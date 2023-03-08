/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine.controller;
        
import cine.entity.pelicula;
import cine.service.Ipeliculaservice;
//import com.cine.service.IpeliculaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class peliculacontroller {
    @Autowired
    private Ipeliculaservice peliculaservice;
    
    //@Autowired
    //private IpeliculaService peliculaService;
    
  //*  @GetMapping("/pelicula")
 //*   public String index (Model model) {
    //*    List<Producto> listaProductos = productService.getAllVerdura();
    //*    model.addAttribute("titulo", "Tabla productos");
   //*     model.addAttribute("productos", listaProductos);
   //*     return "productos";
 //*   }
    
}

        
