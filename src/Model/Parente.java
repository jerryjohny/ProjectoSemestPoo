
package Model;

/**
 *
 * @author hp
 */
public class Parente {
    
    
private String nome;
private String grauParentesco;
private String contacto;

    public Parente(String nome, String grauParentesco, String contacto) {
        this.nome = nome;
        this.grauParentesco = grauParentesco;
        this.contacto = contacto;
    }

    public Parente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGrauParentesco() {
        return grauParentesco;
    }

    public void setGrauParentesco(String grauParentesco) {
        this.grauParentesco = grauParentesco;
    }
   
    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

     
}
