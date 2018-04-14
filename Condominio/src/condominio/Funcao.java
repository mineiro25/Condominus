/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;

/**
 *
 * @author jjoao
 */
public class Funcao {
    SimpleDateFormat Formato=new SimpleDateFormat("dd-MM-yyyy");
      SimpleDateFormat Formato2=new SimpleDateFormat("dd");
    
      public String getData(JDateChooser jd) { // obter a data do jCalendar
        if (jd.getDate()!=null) {
            return Formato.format(jd.getDate());
        } else {
            return null;
        }
    }
    public String getDia (JDateChooser jd) {  //obter o dia do jCalendar
        if (jd.getDate()!=null) {
        return Formato2.format(jd.getDate());
    }else {
    return null;
    }
}
}
