/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import dao.DDato;
import java.util.List;
import modelos.Dato;

/**
 *
 * @author Josar
 */
public class DatoControlador {
    private DDato daoDato;

    public DatoControlador() {
        this.daoDato = new DDato();
    }
    
    /**
     * Funcion para guardar datos en la base de datos.
     * @param dato
     * @return 
     */
    public boolean registrar(Dato dato){
        boolean respuesta = this.daoDato.registrarDatos(dato);
        
        return respuesta;
    }
    
    /**
     * Funcion para recopilar los datos dentro de un arreglo.
     * @return 
     */
    public List<Dato> listar(){
        List<Dato> listaDatos = this.daoDato.listar();
        
        return listaDatos;
    }
    
    /**
     * Funcion para eliminar una fila de la base de datos con respecto al id que se le de.
     * @param id
     * @return 
     */
    public boolean eliminar(int id){
        boolean respuesta = this.daoDato.eliminar(id);
        
        return respuesta;
    }
}
