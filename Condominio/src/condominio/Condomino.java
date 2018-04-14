/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio;

/**
 *
 * @author jjoao
 */
public class Condomino implements java.io.Serializable {
    public int nif;
    public String morada;
    public static String proprietario;
    public int idC;
    public int idF;
    
    
    
 

    
   
    
public Condomino (int nif,String morada, String proprietario) {
this.nif=nif;
this.morada=morada;
this.proprietario=proprietario;



}

    /**
     * @return the nif
     */
    public int getNif() {
        return nif;
    }

    /**
     * @param nif the nif to set
     */
    public void setNif(int nif) {
        this.nif = nif;
    }

    /**
     * @return the morada
     */
    public String getMorada() {
        return morada;
    }

    /**
     * @param morada the morada to set
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }


    
      public static String getProprietario() {
        return proprietario;
    }

    /**
     * @param aProprietario the proprietario to set
     */
    public static void setProprietario(String aProprietario) {
        proprietario = aProprietario;
    }


}
