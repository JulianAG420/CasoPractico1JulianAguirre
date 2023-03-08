/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoPractico.demo.Controller;

import CasoPractico.demo.Entity.Pelicula;
import CasoPractico.demo.Entity.Sala;
import CasoPractico.demo.Service.IPeliculaService;
import CasoPractico.demo.Service.ISalaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author yulien
 */
@Controller
public class PeliculaController {
     @Autowired
    private IPeliculaService peliculaService;
    
    @Autowired
    private ISalaService salaService;
    
    @GetMapping("/pelicula")
    public String index(Model model){
        List<Pelicula> listaPelicula = peliculaService.getAllPeliculas();
        model.addAttribute("titulo", "Cartelera Peliculas");
        model.addAttribute("pelicula", listaPelicula);
        return "pelicula";
        
        
    }
    @GetMapping("/peliculaN")
    public String crearPelicula(Model model){
         List<Sala> listaSalas = salaService.listSala();
         model.addAttribute("pelicula", new Pelicula());
         model.addAttribute("salas", listaSalas);
         return "crear";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarPelicula(@PathVariable("id") Long idPelicula){
        peliculaService.delete(idPelicula);
        return "redirect:/pelicula";
        
        
    }
    
    @PostMapping("/save")
    public String guardarPelicula(@ModelAttribute Pelicula pelicula){
        peliculaService.savePelicula(pelicula);
        return "redirect:/pelicula";
    }
  
}

