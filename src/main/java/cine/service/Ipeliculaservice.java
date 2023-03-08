/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cine.service;


import cine.entity.pelicula;
import java.util.List;


public interface IpeliculaService {
     public List <pelicula>  getAllpelicula();
     
     public pelicula getpeliculaById (long Id);
     
     public void savepelicula (pelicula pelicula);
     
     public void delete (long id);
}
