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
 * @author jjoao
 */


//Construtor//
public class Condominio implements java.io.Serializable {
   private int areac;
   private String localizacao;
   private int codigoPostal;
   static int fracoesandar;
   private int ID;
  private ArrayList <Fracao> listafracoes; 
   private static final long serialVersionUID = -7635977569655131548L;
    
   
   public Condominio() {
       listafracoes = new ArrayList();
       
   }
   
   public Condominio (int areaC, String localizacaoC, int codigoPostalC,int ID) {
       this.areac=areaC;
       this.localizacao=localizacaoC;
       this.codigoPostal=codigoPostalC;
       this.ID=ID;
       
   }
   
   public void addCondominio (Fracao a) {
        getListafracoes().add(a);
   }
   
   
    /**
     * @return the area
     */
    public int getArea() {
        return areac;
    }

    /**
     * @param areac
     */
    public void setArea(int areac) {
        this.areac = areac;
    }

    /**
     * @return the localizacao
     */
    public String getLocalizacao() {
        return localizacao;
    }

    /**
     * @param localizacao the localizacao to set
     */
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    /**
     * @return the codigoPostal
     */
    public int getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * @param codigoPostal the codigoPostal to set
     */
    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
    public int getID() {
        return ID;
    }
   
    public void setID (int ID) {
        this.ID=ID;
    }
    
  //getters e setters//
    public  int getFracoesandar() {
        return fracoesandar;
    }
    
    
     public int tamanho () {
        return getListafracoes().size();
                
    }
    //buscar condominios//
    public Fracao BuscarCond(int a){
        return getListafracoes().get(a);
        
    }
    
    
    
    public boolean existeCond(int num) throws DadosJaExistentes {
        for (int i = 0;i< getListafracoes().size();i++) {
            int ID;
            ID = getListafracoes().get(i).getId();
            if (ID == num) {
                throw new DadosJaExistentes(" O Condominio já foi inserido");
            }
        }
        return true;
    }
    
    // Buscar o funcionario pelo numero//
    public Fracao getCondominio(int numero) throws DadosNaoEncontrados {
        for (Fracao c : this.getListafracoes()) {
            if (c.getIdc()== (numero)) {
                return c;
            }
        }
        throw new DadosNaoEncontrados();
    }
    
    
    
    

    /**
     * @param aFracoesandar the fracoesandar to set
     */
    public static void setFracoesandar(int aFracoesandar) {
        fracoesandar = aFracoesandar;
    }
    //Indica quantas fracoes existem por cada andar//
   public void fracoesdecadaandar(int andar) {
       for(int i = 0; i < getListafracoes().size(); i ++) {
         int andarlista;
         andarlista = getListafracoes().get(i).getAndar();
         if (andar == andarlista) {
                fracoesandar =fracoesandar + 1;
         }
        
   }
         
 System.out.println ("O andar tem" + getFracoesandar());
 
}

    /**
     * @return the listafracoes
     */
    public ArrayList <Fracao> getListafracoes() {
        return listafracoes;
    }

    /**
     * @param listafracoes the listafracoes to set
     */
    public void setListafracoes(ArrayList <Fracao> listafracoes) {
        this.listafracoes = listafracoes;
    }

   

    
 
}
