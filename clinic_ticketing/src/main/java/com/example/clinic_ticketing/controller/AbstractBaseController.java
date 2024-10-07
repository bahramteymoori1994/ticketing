package com.example.clinic_ticketing.controller;

import com.example.clinic_ticketing.service.AbstractBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public abstract class AbstractBaseController<S extends AbstractBaseService<?, E>, E>
{
    @Autowired
    private S service;

    @PostMapping()
    public E create(@RequestBody E entity)
    {
        return service.create(entity);
    }

    @PutMapping()
    public E update(@RequestBody E entity)
    {
        return service.update(entity);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id)
    {
        service.deleteById(id);
    }

    @GetMapping("/{id}")
    public E findById(@PathVariable Long id)
    {
        return service.findById(id);
    }

    @GetMapping()
    public List<E> findAll()
    {
        return service.findAll();
    }
}