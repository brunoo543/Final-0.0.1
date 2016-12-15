/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.CategoriaDAO;
import model.Categoria;


public class CategoriaBean  extends CrudBean<Categoria, CategoriaDAO>{   
    
    private CategoriaDAO DAO;
    
    @Override
    public CategoriaDAO getDAO() {
        if (DAO == null) {
            DAO = new CategoriaDAO();
        }
        return DAO;
    }

    @Override
    public Categoria criarNovaEntidade() {
        return new Categoria();
    }
    
}
