/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.unmsm.sistemas.filtrorev;

import org.openide.util.lookup.ServiceProvider;
import pe.edu.unmsm.sistemas.filtro.IFiltro;

/**
 *
 * @author Jyoti
 */
@ServiceProvider(service = IFiltro.class)
public class FiltroRev implements IFiltro{
    private final String nombre = "Filtro hacer Reverso";
    
    @Override
    public String procesar(String s) {
           StringBuilder c = new StringBuilder(s);
           return c.reverse().toString();
    }
    
    @Override
     public String getNombre(){
        return this.nombre;
    }
}
