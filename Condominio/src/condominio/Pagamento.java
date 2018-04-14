/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio;

import static condominio.Condomino.proprietario;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author migas
 */
public class Pagamento extends Condomino implements java.io.Serializable {
    Fracao andar;
    Fracao area;
    private String estado;
    static int DAY_OF_MONTH ;
    static int MONTH;
    static int YEAR;
    static String datapagamento;
    private Orcamento valororcamento;
    private int id;
    private int valor;
    
    public Pagamento(String estado,String datapagamento,int nif,String morada, String proprietario,int id,int valor) {
        super(nif,morada,proprietario);
        this.estado=estado;
        this.datapagamento=datapagamento;
        this.id=id;
        this.valor=valor;
        
    }
    
    
    //getters and setters//
   
    public String getData() {
        return datapagamento;
    }
    public void setData(String datapagamento) {
        this.datapagamento=datapagamento;
    }
    
     public void avisoMensal () {
        Calendar cal = Calendar.getInstance();
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        if (estado!="Pago" && dayOfMonth == 10) {
            System.out.println("O condomino" + proprietario + "tem cinco dias para pagar");
        }
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

    /**
     * @return the valororcamento
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valororcamento the valororcamento to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
        
       
}