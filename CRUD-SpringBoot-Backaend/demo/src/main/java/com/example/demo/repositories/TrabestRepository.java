package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TrabestIdModel;
import com.example.demo.model.TrabestModel;

@Repository
public interface TrabestRepository extends CrudRepository<TrabestModel, TrabestIdModel> {
    boolean existsById(TrabestIdModel id);

    void deleteById(TrabestIdModel id);
}

