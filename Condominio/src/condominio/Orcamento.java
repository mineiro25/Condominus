/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio;

import java.util.ArrayList;

/**
 *
 * @author migas
 */
public class Orcamento implements java.io.Serializable {
  int totaldespesa;
  private int honorarios;
  private ArrayList <Despesa> listadespesas = new ArrayList<>();  
  static String estado;
  private int idC;
  private int id;
  private String modalidade;
  private Condominio c2;
  private double valororcamento;
  private double valorapagar;
  private double mensalidade;
  
  public Orcamento (int honorarios, String estado,int id, int valororcamento, int idC, double valorapagar, double mensalidade) {
      
        this.honorarios = honorarios;
        this.estado=estado;
        this.valororcamento=valororcamento;
        this.id=id;
        this.idC=idC;
        this.valorapagar=valorapagar;
        this.mensalidade=mensalidade;
      
        }
  
  public void addorçamento(Despesa a) {
      listadespesas.add(a);
  }

   public String getEstado(){
       return estado;
   }
    public double getHonorarios() {
        return honorarios;
    }

    /**
     * @param honorarios the honorarios to set
     */
    public void setHonorarios(int honorarios) {
        this.honorarios = honorarios;
    }

    /**
     * @return the listadespesas
     */
    public ArrayList <Despesa> getListadespesas() {
        return listadespesas;
    }

    /**
     * @param listadespesas the listadespesas to set
     */
    public void setListadespesas(ArrayList <Despesa> listadespesas) {
        this.listadespesas = listadespesas;
    }
    
    public double getOrcamento() {
        return valororcamento;
    }
    
    public void setOrcamento(int valororcamento) {
        this.valororcamento= valororcamento;
    }
    
    public int getID() {
        return id;
    }
    
    public void setID(int ID) {
        this.id=ID;
    }
    
    //metodos//
    //faz soma das despesas
    
    public void somadespesas() {
        
        int despesa;
        for (int i=0;i < listadespesas.size(); i++) {
          despesa=  listadespesas.get(i).getValordespesa();
        totaldespesa = despesa + totaldespesa;
                    
        }
        System.out.println("O total da despesa é " + totaldespesa);
    }
    
    public void totalorçamento() {
        valororcamento = totaldespesa + honorarios;
        System.out.println("O valor total do orçamento é " + valororcamento);
    }

    /**
     * @return the id
     */
    public int getIdC() {
        return idC;
    }
    
    public void setIdC (int idC) {
        this.idC=idC;
    }
    
    /**
     * @return the modalidade
     */
    public String getModalidade() {
        return modalidade;
    }

    /**
     * @param modalidade the modalidade to set
     */
    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
    
    
    
    public void Permilagem () {
       
        for (int i=0;i < c2.getListafracoes().size();i++) {
       
      
     
         
            double areafracao;
            double percentagem;
             areafracao = c2.getArea();
             
            int areac = c2.getArea();
            percentagem = areafracao / areac ;
            setValorapagar(valororcamento * percentagem);
            setMensalidade(getValorapagar() / 12);
            
         
        }
    }
        
     public void Equitativa  (double perc){ 
        
            
            
           double percentageminserida = perc;
          
           
            valorapagar =(((percentageminserida * valororcamento) / c2.getFracoesandar()) / 100);
                   System.out.println("O valor a pagar é " + getValorapagar() );
        
        }
     
     
     public void Exata () {
         
            
           valorapagar =(valororcamento);
          mensalidade = (valororcamento / 12);
        }
        
     
     public void Manual (double val) {
        valorapagar =val;
        mensalidade =(val / 12) ;
         
     }
    
    

    /**
     * @return the valorapagar
     */
    public double getValorapagar() {
        return valorapagar;
    }
    


    /**
     * @param valorapagar the valorapagar to set
     */
    public void setValorapagar(double valorapagar) {
        this.valorapagar = valorapagar;
    }

    /**
     * @return the mensalidade
     */
    public double getMensalidade() {
        return mensalidade;
    }

    /**
     * @param mensalidade the mensalidade to set
     */
    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
}

    /**
     * @param id the id to set
     */
  
    
