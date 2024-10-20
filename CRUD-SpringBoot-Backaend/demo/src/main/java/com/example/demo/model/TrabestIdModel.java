package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class TrabestIdModel implements Serializable {
  private Long idt;
  private Long idest;

  public Long getIdt() {
    return idt;
  }

  public void setIdt(Long idt) {
    this.idt = idt;
  }

  public Long getIdest() {
    return idest;
  }

  public void setIdest(Long idest) {
    this.idest = idest;
  }

  // Equals and HashCode methods for proper comparison
  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof TrabestIdModel))
      return false;
    TrabestIdModel that = (TrabestIdModel) o;
    return idt.equals(that.idt) && idest.equals(that.idest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idt, idest);
  }
}
