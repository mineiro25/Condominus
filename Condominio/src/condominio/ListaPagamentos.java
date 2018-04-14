/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio;
import condominio.exceptions.DadosJaExistentes;
import condominio.exceptions.DadosNaoEncontrados;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author Miguel
 */
public class ListaPagamentos implements java.io.Serializable {
    
    ArrayList <Pagamento> listapagamentos;
    private static final long serialVersionUID= 3276286457515160784L;
            
            
 public ListaPagamentos() {
     listapagamentos = new ArrayList<>();
 }
    
    
    public void addPagamento(Pagamento a) {
        listapagamentos.add(a);
    }
    
    
    
      
      public int tamanhox () {
        return listapagamentos.size();
                
    }
    //procura pagamento//
    public Pagamento ProcPag(int a){
        return listapagamentos.get(a);
        
    }
    
    
    //bool que procura se existe pagamento
    public boolean existePag(int num) throws DadosJaExistentes {
        for (int i = 0;i< listapagamentos.size();i++) {
            int ID;
            ID = listapagamentos.get(i).getId();
            if (ID == num) {
                throw new DadosJaExistentes(" O Pagamento já foi inserido");
            }
        }
        return true;
    }
    
    // Procura Pagamentos pelo numero//
    public Pagamento getPagamento(int numero) throws DadosNaoEncontrados {
        for (Pagamento c : this.listapagamentos) {
            if (c.getId() == (numero)) {
                return c;
            }
        }
        throw new DadosNaoEncontrados();
    }
    
    
    //metodos//
    
    public int pagamentosperiodo(String dataintroduzida) {
        int valor = 0;
        int soma = 0;
        int total=0;
        for (int i = 0; i < listapagamentos.size(); i++) {
        try {
        String data = listapagamentos.get(i).getData();
        
        SimpleDateFormat std1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat std2 = new SimpleDateFormat ("dd/MM/yyyy");
        
            Date datapag = std1.parse(data);
            Date dataintr = std2.parse(dataintroduzida);
            
            if (datapag.after(dataintr)) {
              int valorpago =  listapagamentos.get(i).getValor();
              soma=soma+valorpago;
              
             
            }
            
                 
            }
        catch (Exception e) {
        e.printStackTrace();
    }
       
         
        }
        return soma;
   
}

}