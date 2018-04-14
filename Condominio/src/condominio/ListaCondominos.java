/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio;
import java.util.ArrayList;
import java.util.Collections;
import condominio.exceptions.DadosJaExistentes;
import condominio.exceptions.DadosNaoEncontrados;
/**
 *
 * @author ricardo
 */
public class ListaCondominos implements java.io.Serializable{
    
    ArrayList <Condomino> listaCondominos;
    

      public ListaCondominos() {
        listaCondominos=new ArrayList();
}
    
    //adicionar condomino a arraylist
    public void addCondomino (Condomino c1){
        listaCondominos.add(c1);
    }
    
    //retorna o tamanho da lista
    public int tamanhoLista(){
        return listaCondominos.size();
    }
    public Condomino BuscarCondomino(int a){
        return listaCondominos.get(a);
        
    }
        
    //Verificar se Condomino já existe
    public boolean existeCondomino(int num) throws DadosJaExistentes{
        for(int i = 0; i < listaCondominos.size(); i++){
            int NIF;
            NIF = listaCondominos.get(i).getNif();
            if(NIF == num){
                throw new DadosJaExistentes ("O Condómino já foi inserido");
            }
        }
        return true;
    }
    
    //buscar nome Condomino pelo nif
    public String getNomeCondomino (int numero) throws DadosNaoEncontrados{               
        String nome = null;
        for(int i = 0; i < listaCondominos.size(); i++){          
            int NIF;
            NIF = listaCondominos.get(i).getNif();
            if(NIF == numero){
                Condomino c = listaCondominos.get(i);
                nome = c.getProprietario();	
            
            } else{
                throw new DadosNaoEncontrados ("Condómino não existente");
            }  
        }		
        return nome;
    }
    
    //buscar morada Condomino pelo nif
    public String getMoradaCondomino (int numero) throws DadosNaoEncontrados{               
        String morada = null;
        for(int i = 0; i < listaCondominos.size(); i++){          
            int NIF;
            NIF = listaCondominos.get(i).getNif();
            if(NIF == numero){
                Condomino c = listaCondominos.get(i);
                morada = c.getMorada();	
            
            } else{
                throw new DadosNaoEncontrados ("Condómino não existente");
            }  
        }		
        return morada;
    }
    
    //buscar o condomino
    public Condomino getCondomino(int numero) throws DadosNaoEncontrados {
        for (Condomino c : this.listaCondominos) {
            if (c.getNif() == (numero)) {
                return c;
            }
        }
        throw new DadosNaoEncontrados();
    }
}
