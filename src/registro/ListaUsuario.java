/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;
import java.util.Vector;

/**
 *
 * @author luis
 */
public class ListaUsuario {
    private static Vector<Usuario> datos= new  Vector<Usuario>();
    
    public static void agregar(Usuario obj){
        datos.addElement(obj);
    }
    
    public static void eliminar(int postj){
       datos.removeElementAt(postj);
    }
    
    public static Vector mostrar(){
        return datos;
    }

    
}
