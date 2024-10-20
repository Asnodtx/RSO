package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.TrabestIdModel;
import com.example.demo.model.TrabestModel;
import com.example.demo.repositories.TrabestRepository;

@Service
public class TrabestService {
  @Autowired
  TrabestRepository trabestRepository;

  public ArrayList<TrabestModel> obtenerTrabest() {
    return (ArrayList<TrabestModel>) trabestRepository.findAll();
  }

  public TrabestModel guardarTrabest(TrabestModel trabest) {
    return trabestRepository.save(trabest);
  }

  public Optional<TrabestModel> obtenerPorId(Long idt, Long idest) {
    TrabestIdModel id = new TrabestIdModel(idt, idest);
    return trabestRepository.findById(id);
  }

  @Transactional
  public boolean eliminarTrabest(Long idt, Long idest) {
    TrabestIdModel id = new TrabestIdModel(idt, idest);
    if (trabestRepository.existsById(id)) {
      trabestRepository.deleteById(id);
      return true;
    }
    return false;
  }
}
