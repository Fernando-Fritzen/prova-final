package com.example.vendas.repositories;

import com.example.vendas.model.Empresa;
import com.example.vendas.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
