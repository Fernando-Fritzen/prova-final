package com.example.vendas.services;

import com.example.vendas.model.Empresa;
import com.example.vendas.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository repository;

    public List<Empresa> findAll() {
        return repository.findAll();
    }

    public Empresa findById(Long id) {
        Optional<Empresa> obj = repository.findById(id);
        return obj.get();
    }

    public Empresa insert(Empresa empresa) {
        return repository.save(empresa);
    }

}
