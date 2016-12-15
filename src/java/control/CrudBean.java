/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import dao.CrudDAO;


public abstract class CrudBean<E,D extends CrudDAO> {//O E vai representar a entidade(model) e o D o DAO(usuarioDAO) etc.....
    private E entidade;
    private List<E> listaEntidade;
    
    //Metodos Crud
    public void novo(){
    entidade = criarNovaEntidade();
    }
    public void salvar(){
       getDAO().salvar(entidade);
       entidade = criarNovaEntidade();
    }
    public void editar(E ent){
    getDAO().alterar(ent);
    entidade = criarNovaEntidade();
    }
    public void excluir(E entidade){}
    public void buscar(){
    getDAO().deletar(entidade);
    }
    //Metodos Crud
   
    
    
    //Responsável por criar os metodos na classe Bean.
    public abstract D getDAO();
    public abstract E criarNovaEntidade();
    //Responsável por criar os metodos na classe Bean.

    
    //get e set
    public E getEntidade() {
        return entidade;
    }

    public void setEntidade(E entidade) {
        this.entidade = entidade;
    }

    public List<E> getListaEntidade() {
        return listaEntidade;
    }

    public void setListaEntidade(List<E> listaEntidade) {
        this.listaEntidade = listaEntidade;
    }
     //get e set
    
}
