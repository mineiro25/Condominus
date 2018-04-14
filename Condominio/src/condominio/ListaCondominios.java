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
 * @author Miguel
 */
public class ListaCondominios implements java.io.Serializable {
    
    ArrayList <Condominio> listaCondominios;
    
    public ListaCondominios() {
        listaCondominios=new ArrayList();
}
    

    
    public void addCondominio (Condominio c1){
        listaCondominios.add(c1);
    }
    
    //retorna o tamanho da lista//
    public int tamanho () {
        return listaCondominios.size();
                
    }
    //buscar condominios//
    public Condominio BuscarCond(int a){
        return listaCondominios.get(a);
        
    }
    
    
    //bool que retorna se existe condominio na lista
    public boolean existeCond(int num) throws DadosJaExistentes {
        for (int i = 0;i< listaCondominios.size();i++) {
            int ID;
            ID = listaCondominios.get(i).getID();
            if (ID == num) {
                throw new DadosJaExistentes(" O Condominio já foi inserido");
            }
        }
        return true;
    }
    
    // Buscar o condominio
    public Condominio getCondominio(int numero) throws DadosNaoEncontrados {
        for (Condominio c : this.listaCondominios) {
            if (c.getID() == (numero)) {
                return c;
            }
        }
        throw new DadosNaoEncontrados();
    }
    
    
    //retorna a zona com mais condominios
    public int zonaComMaisCondominios () {
        String zona = "0";
        int frequencia=0;
        
        for (int i =0; listaCondominios.size()>i ;i++) {
            if ((Collections.frequency(listaCondominios,listaCondominios.get(i).getCodigoPostal()))>frequencia) {
                zona=listaCondominios.get(i).getLocalizacao();
                frequencia=listaCondominios.get(i).getCodigoPostal();
            }
            
        }
        return frequencia ; 
    }
}

    

