package com.example.vendas.controller;

import com.example.vendas.model.Empresa;
import com.example.vendas.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/empresas")
public class EmpresaController {

    @Autowired
    private EmpresaService service;

    @GetMapping
    public ResponseEntity<List<Empresa>> findAll() {
        List<Empresa> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Empresa> findById(@PathVariable Long id) {
        Empresa obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Empresa> insert(@RequestBody Empresa empresa) {
        empresa = service.insert(empresa);
        return ResponseEntity.ok().body(empresa);
    }
}
