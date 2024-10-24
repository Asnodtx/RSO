package com.example.demo.services;

import java.util.ArrayList;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FormularioModel;
import com.example.demo.repositories.FormularioRepository;

@Service
public class FormularioService {
  @Autowired
  FormularioRepository formularioRepository;

  public ArrayList<FormularioModel> obtenerFormulario() {
    return (ArrayList<FormularioModel>) formularioRepository.findAll();
  }
  
  public FormularioModel guardarFormulario(FormularioModel formulario) {
    return formularioRepository.save(formulario);
  }
/*
  public Optional<FormularioModel> obtenerPorId(Long id) {
    return formularioRepository.findById(id);
  }

  public boolean eliminarFormulario(Long id) {
    try {
      formularioRepository.deleteById(id);
      return true;
    } catch (Exception err) {
      return false;
    }
  }*/
}
