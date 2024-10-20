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

import com.example.demo.model.EmpresaModel;
import com.example.demo.services.EmpresaService;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
  @Autowired
  EmpresaService empresaService;

  @GetMapping
  public ArrayList<EmpresaModel> obtenerEmpresa() {
    return empresaService.obtenerEmpresas();
  }

  @PostMapping
  public EmpresaModel guardarEmpresa(@RequestBody EmpresaModel empresa) {
    return this.empresaService.guardarEmpresa(empresa);
  }

  @GetMapping(path = "/{id}")
  public Optional<EmpresaModel> obtenerEmpresaId(@PathVariable("id") Long id) {
    return this.empresaService.obtenerPorId(id);
  }

  @DeleteMapping (path = "/{id}")
  public String eliminarPorId(@PathVariable("id")Long id){
    boolean ok = this.empresaService.eliminarEmpresa(id);
    if(ok){
      return "Se elimino el trabajador con id: " + id;
    }else{
      return "No se pudo eliminar el trabajador con id: " + id;
    }
  }
}
