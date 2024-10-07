package com.example.clinic_ticketing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class AbstractBaseService<R extends JpaRepository<E, Long>, E>
{
    @Autowired
    private R repository;

    public E create(E entity)
    {
        return repository.save(entity);
    }

    public E update(E entity)
    {
        return repository.save(entity);
    }

    public void deleteById(long id)
    {
        repository.deleteById(id);
    }

    public E findById(long id)
    {
        return repository.findById(id).get();
    }

    public List<E> findAll()
    {
        return repository.findAll();
    }
}