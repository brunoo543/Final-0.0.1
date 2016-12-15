/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author BRUNO
 * @param <E>
 */
public interface CrudDAO<E> {//O E vai representar a entidade
    
    public void salvar(E entidade);
    public void deletar(E entidade);
    public void alterar(E entidade);
    public List<E> carregar(); 
    
}
