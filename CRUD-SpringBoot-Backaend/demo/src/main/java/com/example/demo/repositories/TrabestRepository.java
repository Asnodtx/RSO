package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TrabestIdModel;
import com.example.demo.model.TrabestModel;

@Repository
public interface TrabestRepository extends CrudRepository<TrabestModel, TrabestIdModel> {
    boolean existsById(TrabestIdModel id);

    void deleteById(TrabestIdModel id);

    /**
     *    _missing_tasks_ { 22 OCTOBER 2024 }
     * 
     *    1. Debemos de colocar un abstract que utilize la anotación @Query de la librería:
     *    ` org.springframework.data.repository.CrudRepository; `
     *           o
     *    ` org.springframework.data.repository.Repository; `
     * 
     *     2. Debemos verificar en la documentación oficial como funciona `CrudRepository` y `Repository`
     *      ¿Cuáles son sus diferencias? ¿Cuál es más modificables?
     *      Será una buena idea buscar opiniones en YouTube, acerca de: cuál tipo de repositorio se adapta
     *      mejor a nuestro proyecto.
     * 
     */




}

