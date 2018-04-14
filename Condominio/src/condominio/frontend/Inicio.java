/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio.frontend;

import condominio.Sistema;
import static condominio.Sistema.DADOS;
import condominio.Utilizador;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Miguel
 */
public class Inicio {

/**
 *
 * @author migas
 */


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         UIManager.LookAndFeelInfo plafinfo[] = UIManager.getInstalledLookAndFeels();
boolean nimbusfound=false;
int nimbusindex=0;

for (int look = 0; look < plafinfo.length; look++) {
if(plafinfo[look].getClassName().toLowerCase().contains("nimbus"))
{
nimbusfound=true;
nimbusindex=look;
}
}

try {

if(nimbusfound)
{ 
UIManager.setLookAndFeel(plafinfo[nimbusindex].getClassName());
}
else

UIManager.setLookAndFeel(
UIManager.getCrossPlatformLookAndFeelClassName());

}
catch(Exception e)
{
    }

        Sistema s = new Sistema();
       Utilizador a1 = new Utilizador("miguel","2442");
       s.getListaUtilizadores().inicializaManual(a1);
       
        
          try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(Sistema.DADOS));
            s = (Sistema) in.readObject();
            in.close();
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), DADOS, JOptionPane.ERROR_MESSAGE);
        }
        
       Login l1 = new Login(s);
        
        
        l1.setResizable(false);
        
        
        l1.setLocationRelativeTo(null);
        
        
        l1.setVisible(true); 
        
        
        
       
        
        
        
     
    
}
}

    

