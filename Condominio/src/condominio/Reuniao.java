/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio;
import java.util.Calendar;
import static java.util.Calendar.JANUARY;

/**
 *
 * @author Miguel
 */
public class Reuniao implements java.io.Serializable {
    private int id;
    public String tipo;
    private int idC;
    public int diaR;
    public String mês;
    
    
    public Reuniao (int id,String tipo,int idC,int diaR,String mês) {
        this.tipo=tipo;
        this.idC=idC;
        this.diaR=diaR;
        this.mês=mês;
        this.id=id;
    }

    public String getTipo() {
        return tipo;
    }

    public int getDiaR() {
        return diaR;
    }

    public String getMês() {
        return mês;
    }
    //método que emite aviso da reunião (backend)
    public void avisoReuniao () {
        int diaRR=diaR;
        Calendar cal = Calendar.getInstance();
        int mês = cal.get(Calendar.MONTH);
        int dia = cal.get(Calendar.DAY_OF_MONTH) ;
        
        
        if (mês==JANUARY & dia == 1) {
            System.out.println(" A reunião de condominio é no dia" + diaR );
            
            
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
}
    

