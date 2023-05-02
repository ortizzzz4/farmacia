/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

import java.util.Vector;
import static registro.ListaUsuario.mostrar;

/**
 *
 * @author luis
 */
public class Usuario {
    private String  usuario;
    private String contrasena;
    private String rango;
    
     public String getUsuario() {
        return usuario;
    }

    // Método setter para el atributo usuario
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    // Método getter para el atributo contrasena
    public String getContrasena() {
        return contrasena;
    }

    // Método setter para el atributo contrasena
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    // Método getter para el atributo rango
    public String getRango() {
        return rango;
    }

    // Método setter para el atributo rango
    public void setRango(String rango) {
        this.rango = rango;
    }
    
    public static int verificarUsuario(String usuario){
        Vector lista = mostrar();
        Usuario obj;
        for(int  i=0; i < lista.size(); i++ ){
            obj =(Usuario) lista.elementAt(i);
            if (obj.getUsuario().equalsIgnoreCase(usuario)){
                return i;
            }
        }
        return -1;
    }
    
    
    public static int verificarLogueo(String usuario, String contrasena){
        Vector lista = mostrar();
        Usuario obj;
        for(int i =0; i <lista.size(); i++){
            obj =(Usuario) lista.elementAt(i);
            
            if(obj.getUsuario().equalsIgnoreCase(usuario) && obj.getContrasena().equalsIgnoreCase(contrasena)){
                return i;
            }
        
        }
       return -1;
    }
    
    public static Vector mostar(){
      return ListaUsuario.mostrar();
    }
    
   }
