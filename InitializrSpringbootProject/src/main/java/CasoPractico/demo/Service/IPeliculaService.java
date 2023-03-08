/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoPractico.demo.Service;

import CasoPractico.demo.Entity.Pelicula;
import java.util.List;

/**
 *
 * @author yulien
 */
public interface IPeliculaService {
    public List<Pelicula> getAllPeliculas();
    public Pelicula getPeliculaById (long id);
    public void savePelicula(Pelicula pelicula);
    public void delete (long id);
}
