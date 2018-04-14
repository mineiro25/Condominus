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
public class Utilizador implements java.io.Serializable {
    private String utilizador;
    private String senha;
    
    public Utilizador(String utilizador, String senha){
        this.utilizador = utilizador;
        this.senha = senha;
    }

    public String getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(String utilizador) {
        this.utilizador = utilizador;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }  
    
}
