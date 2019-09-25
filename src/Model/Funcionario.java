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
public abstract class Funcionario {
     private String nome;
     private String contacto;
     private String email;
     private String tipoDeDocumento;
     private String nrDocumento;
     private int id;
     private boolean estado;
     private Date dataNascimento;
     private  String sexo;

    public Funcionario(String nome, String contacto, String email, String tipoDeDocumento, String nrDocumento, Date dataNascimento, String sexo) {
        this.nome = nome;
        this.contacto = contacto;
        this.email = email;
        this.tipoDeDocumento = tipoDeDocumento;
        this.nrDocumento = nrDocumento;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.estado = true;
    }
     
     
     

    public Funcionario(String nome, String contacto, String email, String tipo, String nrDocumento, int id, boolean estado, Date dataNascimento, String sexo) {
        this.nome = nome;
        this.contacto = contacto;
        this.email = email;
        this.tipoDeDocumento = tipo;
        this.nrDocumento = nrDocumento;
        this.id = id;
        this.estado = estado;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    public Funcionario() {
    }
     
     
     

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
     

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
     

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
     

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
     

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public void setTipoDeDocumento(String tipo) {
        this.tipoDeDocumento = tipo;
    }

    public String getNrDocumento() {
        return nrDocumento;
    }

    public void setNrDocumento(String nrDocumento) {
        this.nrDocumento = nrDocumento;
    }
    
}
