/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "bean")
public class estadosDeTela {
    private String tela = "excluir" ;
    public void mudarParaInserir(){
        tela = "inserir";
    }
    public void mudarParaExcluir(){
        tela = "excluir";
    }
    public void mudarParaAlterar(){
        tela = "alterar";
    }
    public void mudarParaListar(){
        tela = "listar";
    }
    public boolean isInserir(){
        return "inserir".equals(tela);
    }
    public boolean isExcluir(){
        return "excluir".equals(tela);
    }
    public boolean isAlterar(){
        return "alterar".equals(tela);
    }
     public boolean isListar(){
        return "listar".equals(tela);
    }
    
}
