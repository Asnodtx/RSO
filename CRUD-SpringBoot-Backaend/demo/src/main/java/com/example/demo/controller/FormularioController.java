package com.example.demo.controller;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.FormularioModel;
import com.example.demo.services.FormularioService;

@RestController
@RequestMapping("/formulario")
public class FormularioController {
  @Autowired
  FormularioService formularioService;

  @GetMapping
  public List<FormularioModel> obtenerFormularios() {
    return formularioService.obtenerFormulario();
  }

  @PostMapping
  public ResponseEntity<FormularioModel> guardarFormulario(@RequestBody FormularioModel formulario) {
    FormularioModel nuevaFormulario = formularioService.guardarFormulario(formulario);
    return ResponseEntity.status(HttpStatus.CREATED).body(nuevaFormulario);
  }
/*
  @GetMapping("/{id}")
  public ResponseEntity<FormularioModel> obtenerFormularioPorId(@PathVariable Long id) {
    Optional<FormularioModel> formulario = formularioService.obtenerPorId(id);
    return formulario.map(ResponseEntity::ok)
        .orElseGet(() -> ResponseEntity.notFound().build());
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> eliminarFormularioPorId(@PathVariable Long id) {
    boolean ok = formularioService.eliminarFormulario(id);
    if (ok) {
      return ResponseEntity.ok("Se eliminó la formulario con id: " + id);
    } else {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se pudo eliminar la formulario con id: " + id);
    }
  }*/
}
