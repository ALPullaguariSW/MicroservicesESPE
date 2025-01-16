package com.espe.profesores.controllers;


import com.espe.profesores.entities.Profesor;
import com.espe.profesores.services.ProfesorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/api/profesores")
@CrossOrigin(origins = "http://localhost:5500")

public class ProfesorController {
    @Autowired
    ProfesorService service;

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody Profesor profesor, BindingResult result) {
        if (result.hasErrors()) {
            Map<String, String> errors = new HashMap<>();

            result.getFieldErrors().forEach(
                err -> errors.put(
                        err.getField(), err.getDefaultMessage()
                ));
            return ResponseEntity.badRequest().body(errors);

        }
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(profesor));
    }
    @GetMapping
    public List<Profesor> findAll() {
        return service.findAll();
    }

}
