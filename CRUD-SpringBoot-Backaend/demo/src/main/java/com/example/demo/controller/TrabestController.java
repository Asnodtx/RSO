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

  @PostMapping
  public ResponseEntity<TrabestModel> createTrabest(@RequestBody TrabestModel trabest) {
    TrabestModel createdTrabest = trabestService.guardarTrabest(trabest);
    return new ResponseEntity<>(createdTrabest, HttpStatus.CREATED);
  }

  // Obtener un registro de trabest por ID
  @GetMapping("/{idt}/{idest}")
  public ResponseEntity<TrabestModel> getTrabestById(@PathVariable Long idt, @PathVariable Long idest) {
    Optional<TrabestModel> trabest = trabestService.obtenerPorId(idt, idest);
    return trabest.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
  }

  // Eliminar un registro de trabest
  @DeleteMapping("/{idt}/{idest}")
  public ResponseEntity<Void> deleteTrabest(@PathVariable Long idt, @PathVariable Long idest) {
    if (trabestService.eliminarTrabest(idt, idest)) {
      return ResponseEntity.noContent().build();
    }
    return ResponseEntity.notFound().build();
  }
}
