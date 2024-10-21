package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TrabestIdModel;
import com.example.demo.model.TrabestModel;

@Repository
public interface TrabestRepository extends CrudRepository<TrabestModel, TrabestIdModel> {

  Optional<TrabestModel> findById(TrabestIdModel id);

  boolean existsById(TrabestIdModel id);

  void deleteById(TrabestIdModel id);
}
