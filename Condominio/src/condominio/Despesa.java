/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio;

/**
 *
 * @author migas
 */



public class Despesa implements java.io.Serializable {
    
    private String tipodespesa;
    private int valordespesa;
    private String data;
    private int id;
      
    
    //construtor//
    
    public Despesa (String tipodespesa,int valordespesa,String data, int id) {
        this.tipodespesa = tipodespesa;
        this.valordespesa = valordespesa;
        this.data=data;
        this.id=id;
    }

    /**
     * @return the tipodespesa
     */
    public String getTipodespesa() {
        return tipodespesa;
    }

    /**
     * @param tipodespesa the tipodespesa to set
     */
    public void setTipodespesa(String tipodespesa) {
        this.tipodespesa = tipodespesa;
    }

    /**
     * @return the valordespesa
     */
    public int getValordespesa() {
        return valordespesa;
    }

    /**
     * @param valordespesa the valordespesa to set
     */
    public void setValordespesa(int valordespesa) {
        this.valordespesa = valordespesa;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

   
   

  
    
   

}
    
    
    
    
