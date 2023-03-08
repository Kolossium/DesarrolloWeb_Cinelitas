/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PELICULA")
public class pelicula implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String nombre;
  private long costo;
  private String Capacidad_maxima;
  private String numero_de_sala;
  private int fecha;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public long getcosto() {
    return costo;
  }

  public void setId(long costo) {
    this.costo = costo;
  }

  public String getCapacidad_maxima() {
    return Capacidad_maxima;
  }

  public void setCapacidad_maxima(String Capacidad_maxima) {
    this.Capacidad_maxima = Capacidad_maxima;
  }

  public long getnumero_de_sala() {
    return numero_de_sala;
  }

  public void setnumero_de_sala(long numero_de_sala) {
    this.numero_de_sala = numero_de_sala;
  }

  public int getfecha() {
    return fecha;
  }

  public void setfecha(int fecha) {
    this.fecha = fecha;
  }

}