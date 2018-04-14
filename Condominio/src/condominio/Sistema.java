/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Sistema implements java.io.Serializable {
   public ListaCondominos listaCondominos;
    private listaReuniao listaReuniao;
   public  ListaCondominios listaCondominios ;
   private  ListaOrçamentos listaOrçamentos;
   private ListaOrçamentos listaMaiorFaturações;
   public ListaPagamentos listaPagamentos;
   private  ListaManutencoes listadespesas;
   private ListaColaborador listacolaboradores;
   private Condominio listafracoes;
   private ListaUtilizadores listaUtilizadores;
  
   public static int MAX_DIA_PAGAMENTO=15;
   public static final String DADOS = "dados.bin";
   private static final long serialVersionUID = 7314762216966915132L;
   
 public Sistema ()   {
     listaUtilizadores = new ListaUtilizadores();
     listaCondominos= new ListaCondominos();
     listaCondominios= new ListaCondominios();
     listaOrçamentos = new ListaOrçamentos();
     listaMaiorFaturações = new ListaOrçamentos();
     listaPagamentos = new ListaPagamentos();
     listadespesas = new ListaManutencoes();
     listacolaboradores = new ListaColaborador();
     listafracoes = new Condominio();
     listaReuniao=new listaReuniao();
 }

    public ListaCondominos getListaCondominos() {
        return listaCondominos;
    }
 

    /**
     * @return the listaCondominios
     */
    public ListaCondominios getListaCondominios() {
        return listaCondominios;
    }

    /**
     * @return the listaOrçamentos
     */
    public ListaOrçamentos getListaOrçamentos() {
        return listaOrçamentos;
    }

    /**
     * @return the listaMaiorFaturações
     */
    public ListaOrçamentos getListaMaiorFaturações() {
        return listaMaiorFaturações;
    }

    /**
     * @return the listapagamentos
     */
    public ListaPagamentos getListaPagamentos() {
        return listaPagamentos;
    }

    /**
     * @return the listadespesas
     */
    public ListaManutencoes getListadespesas() {
        return listadespesas;
    }

    /**
     * @return the listacolaboradores
     */
    public ListaColaborador getListacolaboradores() {
        return listacolaboradores;
    }
    
    
    
    
     /**
     * @return the listafracoes
     */
    
     /**
     * @return the listaUtilizadores
     */
    public ListaUtilizadores getListaUtilizadores() {
        return listaUtilizadores;
    }
    
    public void exit() {
        System.exit(0);
    }
    
    public Condominio getListafracoes() {
        return listafracoes;
    }

  
      public void sair() {
        guardar(this.DADOS);
        exit();
    }
     //método para guardar dados
    public void guardar(String nomeFicheiro) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomeFicheiro));
            out.writeObject(this);
            out.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), DADOS, JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * @return the listaReuniao
     */
    public listaReuniao getListaReuniao() {
        return listaReuniao;
    }

    /**
     * @param listaReuniao the listaReuniao to set
     */
    public void setListaReuniao(listaReuniao listaReuniao) {
        this.listaReuniao = listaReuniao;
    }

  

   

     
     
     
     
     
    }
    
    
    
      

   

    
    


    

