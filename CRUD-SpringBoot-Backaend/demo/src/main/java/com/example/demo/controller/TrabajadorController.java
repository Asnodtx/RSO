package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TrabajadorModel;
import com.example.demo.services.TrabajadorService;

@RestController
@RequestMapping("/trabajador")
public class TrabajadorController {
  @Autowired
  TrabajadorService trabajadorService;

  @GetMapping
  public ArrayList<TrabajadorModel> obtenerTrabajadores(){
    return trabajadorService.obtenerTrabajadores();
  }

  @PostMapping
  public TrabajadorModel guardarTrabajador(@RequestBody TrabajadorModel trabajador){
    return this.trabajadorService.guardarTrabajador(trabajador);
  }

  @GetMapping ( path = "/{id}")
  public Optional<TrabajadorModel> obtenerTrabajadorId(@PathVariable("id") Long id){
    return this.trabajadorService.obtenerPorId(id);
  }

  @DeleteMapping( path = "/{id}")
  public String eliminarPorId(@PathVariable("id")Long id){
    boolean ok = this.trabajadorService.eliminarTrabajador(id);
    if(ok){
      return "Se elimino el trabajador con id: " + id;
    }else{
      return "No se pudo eliminar el trabajador con id: " + id;
    }
  }
}
