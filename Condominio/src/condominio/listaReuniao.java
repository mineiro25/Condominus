/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio;

import condominio.exceptions.DadosJaExistentes;
import java.util.ArrayList;
/**
 *
 * @author ricardo
 */
public class listaReuniao implements java.io.Serializable{
    
    ArrayList <Reuniao> listaReuniao;

    public listaReuniao() {
        listaReuniao = new ArrayList();        
    }
    
    //Adicionar Reuniao
    public void addReuniao(Reuniao a){
        listaReuniao.add(a);
    }
    
    
    
     public int tamanho () {
        return listaReuniao.size();
                
    }
    //procura Reunioes//
    public Reuniao ProcReuniao(int a){
        return listaReuniao.get(a);
        
    }
    
    
    
    //Listar Reunioes
    public void listarTodos(){
	Reuniao d;	
        for(int i=0; i<listaReuniao.size(); i++){
	System.out.println(listaReuniao.get(i).toString());
	}
    }
    // bool que procura na lista se existe reuniao pelo seu ID
    public boolean existeReuniao(int idR) throws DadosJaExistentes{
        for (int i = 0;i< listaReuniao.size();i++) {
            
            int ID;
            ID=listaReuniao.get(i).getId();
          
            if (ID == idR) {
                throw new DadosJaExistentes(" Reunião já foi inserida");
            }
        }
        return true;
    }
    
}
