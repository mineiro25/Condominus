/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio;
import condominio.Despesa;

/**
 *
 * @author Miguel
 */
public class Colaborador implements java.io.Serializable {
    private String nome;
    private int id;
    private String morada;
    private String profissao;
    int idequipa;
    private static final long serialVersionUID = 3295127935634952740L;
    
    public Colaborador (String nome,int id,String morada,String profissao, int idequipa) {
        this.nome=nome;
        this.morada=morada;
        this.id=id;
        this.profissao= profissao;
        this.idequipa=idequipa;
    }
    
    
    public int getIdequipa () {
        return idequipa;
    }
    
    
   public void setIdequipa(int idequipa) {
       this.idequipa=idequipa;
   }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
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

    /**
     * @return the profissao
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * @param profissao the profissao to set
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    
}
