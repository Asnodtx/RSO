package com.example.demo.controller;

import com.example.demo.model.EjemploModel;
import com.example.demo.services.EjemploService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EjemploController {

    private EjemploService ejemploService = new EjemploService();

    @GetMapping("/ejemplos")
    @ResponseBody
    public EjemploModel[] obtenerTodosLosEjemplos() {
        return ejemploService.obtenerTodosLosEjemplos();
    }

    @GetMapping("/ejemplos/{id}")
    @ResponseBody
    public EjemploModel obtenerEjemploPorId(@PathVariable Long id) {
        return ejemploService.obtenerEjemploPorId(id);
    }
}
