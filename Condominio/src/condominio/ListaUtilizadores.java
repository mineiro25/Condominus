/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio;
import java.util.ArrayList;

/**
 *
 * @author migas
 */
public class ListaUtilizadores implements java.io.Serializable {
    
    
    ArrayList <Utilizador> listautilizadores;
    
    
    
    //construtor//
    public ListaUtilizadores () {
        
        listautilizadores = new ArrayList<>();
    }
    
    
    
    public void inicializaManual(Utilizador a1){
        listautilizadores.add(a1);
        
        
    }
    
    // autenticação do utilizador
    public boolean loginValido(String user, String senha){
        boolean retValue = false;
        
        for (Utilizador u : listautilizadores){
            if (u.getUtilizador().equals(user) && u.getSenha().equals(senha)){
                retValue = true;
              break;
            }
        }
        
        return retValue;        
    }
        
        
    
}
