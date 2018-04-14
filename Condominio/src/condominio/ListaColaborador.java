/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio;

import condominio.exceptions.DadosJaExistentes;
import condominio.exceptions.DadosNaoEncontrados;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class ListaColaborador implements java.io.Serializable {
    ArrayList <Colaborador> listacolaboradores;
    private int equipamanutencao;
    private  static final long serialVersionUID = -3330545973241012064L;
    
public ListaColaborador () {
    listacolaboradores = new ArrayList<>();
}
    
public void addColaborador(Colaborador a) {
   listacolaboradores.add(a);
}

 public int tamanho () {
        return listacolaboradores.size();
                
    }

 //buscar condominios//
    public Colaborador BuscaCol(int a){
        return listacolaboradores.get(a);
        
    }
    
    
    
    public boolean existeCol(int num) throws DadosJaExistentes { //bool que retorna se existe colaborador na lista
        for (int i = 0;i< listacolaboradores.size();i++) {
            int ID;
            ID = listacolaboradores.get(i).getId();
            if (ID == num) {
                throw new DadosJaExistentes(" O Colaborador já foi inserido");
            }
        }
        return true;
    }
    
    // procura o funcionario pelo numero//
    public Colaborador getColaborador(int numero) throws DadosNaoEncontrados { 
        for (Colaborador c : this.listacolaboradores) {
            if (c.getId() == (numero)) {
                return c;
            }
        }
        throw new DadosNaoEncontrados();
    }
    
    //procura colaborador pela equipa
  public Colaborador EquipaManutencão (int numeroman) throws DadosNaoEncontrados {
      
      
            for (Colaborador c : this.listacolaboradores) {
                
             if ((numeroman)== c.getIdequipa()) {
                return c;
             
          
            }  
  }
            throw new DadosNaoEncontrados();
     
  }

    /**
     * @return the equipamanutenção
     */
    public int getEquipamanutencão() {
        return equipamanutencao;
    }

    /**
     * @param equipamanutenção the equipamanutenção to set
     */
    public void setEquipamanutenção(int equipamanutencao) {
        this.equipamanutencao = equipamanutencao;
    }

}
