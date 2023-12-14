package com.omegascar.demo.controllers;

import com.omegascar.demo.entities.Carro;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.omegascar.demo.services.CarroService;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
@RequestMapping(value = "/carros")
public class CarroController {
    @Autowired
    CarroService carroService;

    private static final String UPLOAD_DIR = "demo/src/main/webapp/imagens/";



    @PostMapping(path = "/registrarcarro", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Carro> salvar (@RequestParam("foto") MultipartFile foto,
                                        @RequestPart(value="carro") Carro carro){

        if (foto.isEmpty())
            return null;
        try {
            // Obtenha o caminho completo para o diretório de destino
            String fullPath = UPLOAD_DIR + foto.getOriginalFilename();
            Path destinationPath = Paths.get(fullPath);

            // Salve o arquivo no diretório de destino
            Files.write(destinationPath, foto.getBytes());
            carro.setImagem("/imagens/"+foto.getOriginalFilename());

            return ResponseEntity.status(HttpStatus.CREATED).body(carroService.registrarCarro(carro));
        }catch (IOException e) {
            throw new RuntimeException("erro", e);
        }

    }

    @GetMapping("/imagens/{nomeDaImagem}")
    public ResponseEntity<UrlResource> obterImagem(@PathVariable String nomeDaImagem) {
        Path imagemPath = Paths.get(UPLOAD_DIR, nomeDaImagem);
        UrlResource resource;
        try {
            resource = new UrlResource(imagemPath.toUri());
            if (resource.exists() && resource.isReadable()) {
                return ResponseEntity.ok().body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (MalformedURLException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/editcarro/{id}")
    public void editCarro(@PathVariable("id") long id, @RequestBody @Valid Carro carro) {
        carroService.editCarro(id, carro);
    }


    @DeleteMapping("/deletecarro/{id}")
    public void deleteCarro(@PathVariable("id") long id) {
        carroService.deleteCarro(id);
    }

    @GetMapping
    public List<Carro> getCarros() {
        List<Carro> carros = carroService.getAllCarros();
        return carros;
    }
}

