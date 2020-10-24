/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.unmsm.sistemas.filtromay;

import org.openide.util.lookup.ServiceProvider;
import pe.edu.unmsm.sistemas.filtro.IFiltro;

/**
 *
 * @author Jyoti
 */
@ServiceProvider(service = IFiltro.class)
public class Mayusculas implements IFiltro{
    
    private final String nombre = "Filtro mayusculas";
    
    @Override
    public String procesar(String s) {
        return s.toUpperCase();
    }
        
    @Override
    public String getNombre(){
        return this.nombre;
    }
}
