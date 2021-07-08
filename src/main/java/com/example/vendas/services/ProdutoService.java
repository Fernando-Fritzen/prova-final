package com.example.vendas.services;

import com.example.vendas.model.Produto;
import com.example.vendas.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    public ProdutoRepository repository;

    public List<Produto> findAll() {
        List<Produto> result = repository.findAll();
        return result;
    }

    public Produto findById(Long id) {
        Optional<Produto> obj = repository.findById(id);
        return obj.get();
    }

    public Produto insert(Produto produto) {
        return repository.save(produto);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }


    public Produto update(Long id, Produto obj) {
        Produto entity = repository.findById(id).get();
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Produto entity, Produto obj) {
        entity.setNome(obj.getNome());
        entity.setPreco(obj.getPreco());
        entity.setDescricao(obj.getDescricao());
        entity.setEmpresa(obj.getEmpresa());
    }
}
