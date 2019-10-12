/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TodosDao;

import Controller.TodosDao;
import Model.*;
import java.util.List;
/**
 *
 * @author Edson Nhancale
 */
public class Todos {
    public static void main(String[] args) {

        
        List<Operador> po = TodosDao.Listar();
        
//        for (Operador func: po) {
//            System.out.println("Nome"+func.getNome());
//        }
         
       TodosDao<Funcionario> crud = new TodosDao<Funcionario>();
        Operador teste = new Operador();
        teste.setId(3);
        teste.setNome("Humei Jocordasse Kazembe");
        teste.setSexo("Masculino");
        crud.salvar(teste);
        
    }
    
}
