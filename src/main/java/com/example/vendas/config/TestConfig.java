package com.example.vendas.config;

import com.example.vendas.model.Empresa;
import com.example.vendas.model.Produto;
import com.example.vendas.repositories.EmpresaRepository;
import com.example.vendas.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public void run(String... args) throws Exception {

        Empresa e1 = new Empresa(null, "Facebook", "Rio de Janeiro", "999999999");
        Empresa e2 = new Empresa(null, "Twitter", "Rio de Janeiro", "999999999");

        empresaRepository.saveAll(Arrays.asList(e1, e2));

        Produto p1 = new Produto(null, "caixa", 25.0, "ffff", e1);
        Produto p2 = new Produto(null, "caixa", 25.0, "ffff", e2);

        produtoRepository.saveAll(Arrays.asList(p1, p2));
    }
}
