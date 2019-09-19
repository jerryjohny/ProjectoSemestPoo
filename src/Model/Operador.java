/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author hp
 */
public class Operador extends Funcionario{
    private String idCentro;
    private String usuario;
    private String senha;

    public Operador() {
    }

    public Operador(String nome, String contacto, String email, String tipoDeDocumento, String nrDocumento, Date dataNascimento, String sexo,String idCentro, String usuario, String senha) {
        super(nome, contacto, email, tipoDeDocumento, nrDocumento, dataNascimento, sexo);
        this.idCentro = idCentro;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    
    

    public String getIdCentro() {
        return idCentro;
    }

    public void setIdCentro(String idCentro) {
        this.idCentro = idCentro;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
