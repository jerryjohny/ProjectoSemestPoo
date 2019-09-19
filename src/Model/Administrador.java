
package Model;

import java.util.Date;

/**
 *
 * @author hp
 */
public class Administrador extends Funcionario{
    private String usuario;
    private String senha;

    public Administrador(String nome, String contacto, String email, String tipoDeDocumento, String nrDocumento, Date dataNascimento, String sexo, String usuario, String senha) {
        super(nome, contacto, email, tipoDeDocumento, nrDocumento, dataNascimento, sexo);
        this.usuario = usuario;
        this.senha = senha;
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
