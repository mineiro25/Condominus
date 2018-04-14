/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio;

import condominio.exceptions.DadosJaExistentes;
import condominio.exceptions.DadosNaoEncontrados;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Miguel
 */
public class ListaOrçamentos implements java.io.Serializable {
   
    ArrayList<Orcamento> listaOrçamentos;
   
    
    
    
    
    public ListaOrçamentos () {
        listaOrçamentos=new ArrayList ();
 
    }
    
    public void addOrcamento (Orcamento a) {
        listaOrçamentos.add(a);
    }
    
    
      public int tamanho () {
        return listaOrçamentos.size();
                
    }
    //procura orçamento//
    public Orcamento ProcOrc(int a){
        return listaOrçamentos.get(a);
        
    }
    
    
    //bool que procura se existe orçamento
    public boolean existeOrc(int num) throws DadosJaExistentes {
        for (int i = 0;i< listaOrçamentos.size();i++) {
            int ID;
            ID = listaOrçamentos.get(i).getID();
            if (ID == num) {
                throw new DadosJaExistentes(" O Orçamento já foi inserido");
            }
        }
        return true;
    }
    
    // Procura a Manutenção pelo numero//
    public Orcamento getManutencao(int numero) throws DadosNaoEncontrados {
        for (Orcamento c : this.listaOrçamentos) {
            if (c.getID() == (numero)) {
                return c;
            }
        }
        throw new DadosNaoEncontrados();
    }
    
    
    //método que retorna o ID do condiminio que tem maior faturação
    
    public String maioresFaturacoes () {
        double valor=0;
        double valor2=0;
        int IDC=0;
        
        
            System.out.println("As maiores faturações");
                for (int i = 0; listaOrçamentos.size()>i;i++) {
                if ("Aceite".equals(listaOrçamentos.get(i).getEstado())) {
                if (valor < listaOrçamentos.get(i).getOrcamento()) {
                    valor=listaOrçamentos.get(i).getOrcamento();
                    IDC=listaOrçamentos.get(i).getID();
                }
            }
                }
            return " ID:" +IDC +" Valor" + valor;
       
}
}
    
    
    



    

