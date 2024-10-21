package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TrabestModel;
import com.example.demo.services.TrabestService;

@RestController
@RequestMapping("/trabest")
public class TrabestController {
  @Autowired
  TrabestService trabestService;

  @GetMapping
  public List<TrabestModel> getAllTrabest() {
    return trabestService.obtenerTrabest();
  }

  @GetMapping("/compuesta/{idt}/{idest}")
  public ResponseEntity<TrabestModel> LlaveCompuesta(@PathVariable Long idt, @PathVariable Long idest) {
    Optional<TrabestModel> trabest = trabestService.obtenerPorId(idt, idest);
    return trabest.map(ResponseEntity::ok)
        .orElseGet(() -> ResponseEntity.notFound().build());
  }

  @PostMapping
  public ResponseEntity<?> guardarTrabest(@RequestBody TrabestModel trabest) {
    try {
      TrabestModel nuevoTrabest = trabestService.guardarTrabest(trabest);
      return ResponseEntity.status(HttpStatus.CREATED).body(nuevoTrabest);
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al guardar el registro:");
    }
  }

  @GetMapping("/{idt}/{idest}")
  public ResponseEntity<TrabestModel> obtenerPorId(@PathVariable Long idt, @PathVariable Long idest) {
    Optional<TrabestModel> trabest = trabestService.obtenerPorId(idt, idest);
    return trabest.map(ResponseEntity::ok)
        .orElseGet(() -> ResponseEntity.notFound().build());
  }

  @DeleteMapping("/{idt}/{idest}")
  public ResponseEntity<Void> eliminarTrabest(@PathVariable Long idt, @PathVariable Long idest) {
    boolean eliminado = trabestService.eliminarTrabest(idt, idest);
    return eliminado ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
  }
}
