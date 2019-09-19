
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author hp
 */
public class Gestor extends Funcionario{
    ArrayList<Operador> operadores;
    private String idCentro;
    private String usuario;
    private String senha;

    public Gestor( String nome, String contacto, String email, String tipoDeDocumento, String nrDocumento, Date dataNascimento, String sexo,String idCentro, String usuario, String senha) {
        super(nome, contacto, email, tipoDeDocumento, nrDocumento, dataNascimento, sexo);
        this.idCentro = idCentro;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Gestor(String nome, String contacto, String email, String tipoDeDocumento, String nrDocumento, Date dataNascimento, String sexo,ArrayList<Operador> operadores, String idCentro, String usuario, String senha) {
        super(nome, contacto, email, tipoDeDocumento, nrDocumento, dataNascimento, sexo);
        this.operadores = operadores;
        this.idCentro = idCentro;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Gestor() {
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

    public ArrayList<Operador> getOperadores() {
        return operadores;
    }

    public void setOperadores(ArrayList<Operador> operadores) {
        this.operadores = operadores;
    }
    
}
