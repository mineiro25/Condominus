/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio;

/**
 *
 * @author Miguel
 */
import condominio.exceptions.DadosJaExistentes;
import condominio.exceptions.DadosNaoEncontrados;
import java.util.ArrayList;
 import  java.util.Date;
import java.text.SimpleDateFormat;

public class ListaManutencoes implements java.io.Serializable {
    ArrayList <Despesa> listadespesas;
    private static final long serialVersionUID =-6110244578077764740L;
    public ListaManutencoes () {
        listadespesas = new ArrayList<>();
    }
    
    
     public int tamanho () {
        return listadespesas.size();
                
    }
    //procura despesa//
    public Despesa ProcMan(int a){
        return listadespesas.get(a);
        
    }
    
    
    //bool que procura se existe manutenção
    public boolean existeMan(int num) throws DadosJaExistentes {
        for (int i = 0;i< listadespesas.size();i++) {
            int ID;
            ID = listadespesas.get(i).getId();
            if (ID == num) {
                throw new DadosJaExistentes(" O Condominio já foi inserido");
            }
        }
        return true;
    }
    
    // Buscar a manutenção pelo numero
    public Despesa getManutencao(int numero) throws DadosNaoEncontrados {
        for (Despesa c : this.listadespesas) {
            if (c.getId() == (numero)) {
                return c;
            }
        }
        throw new DadosNaoEncontrados();
    }
    
    
   //adiciona uma manutencao//
    public void addmanutencao(Despesa a) {
        listadespesas.add(a);
    }
    
    public void calendario () {
        for (int i = 0; i < listadespesas.size(); i++) {
            String date = listadespesas.get(i).getData();
            SimpleDateFormat std = new SimpleDateFormat ("dd-MM-yyyy");
            
            try {
            Date datamanutencao = std.parse(date);
            System.out.println (datamanutencao);
            }
           catch (Exception e) {
                   e.getMessage();
                   }
        }
        
    }
}
