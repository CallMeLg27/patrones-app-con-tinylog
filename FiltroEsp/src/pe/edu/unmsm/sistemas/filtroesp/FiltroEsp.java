/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.unmsm.sistemas.filtroesp;

import org.openide.util.lookup.ServiceProvider;
import pe.edu.unmsm.sistemas.filtro.IFiltro;
/**
 *
 * @author Alvaro
 */
@ServiceProvider(service = IFiltro.class)
public class FiltroEsp implements IFiltro{
    private final String nombre = "Filtro Espacios";

    @Override
    public String procesar(String s) {
        return s.replaceAll(" ", "");
    }
    
    @Override
     public String getNombre(){
        return this.nombre;
    }
}
