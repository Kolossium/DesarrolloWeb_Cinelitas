/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine.service;


import cine.entity.pelicula;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class peliculaservice implements Ipeliculaservice{
    
    @Autowired
    private Ipeliculaservice peliculaservice;
    
    @Override
    public List<pelicula> getAlllocal() {
        
        return(List<pelicula>)peliculaRepository.findAll();
    }

    @Override
    public pelicula getlocalById(long Id) {
        return peliculaRepository.findById(Id).orElse(null);
    }

    @Override
    public void savelocal(pelicula pelicula) {
       peliculaRepository.save(pelicula);
    }

    @Override
    public void delete(long id) {
        peliculaRepository.deleteById(id);
    }  

}