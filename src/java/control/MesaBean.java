/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.MesaDAO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Mesa;
import util.Mensagem;

@ManagedBean
@SessionScoped
public class MesaBean implements Serializable {

    private final MesaDAO DAO;
    private Mesa mesa;
    private List<Mesa> lista;
    private int qtd;

    public MesaBean() {
        lista = new ArrayList<>();
        DAO = new MesaDAO();
        mesa = new Mesa();
    }
    public void cadastrar() {
        boolean retorno = DAO.cadastrarMesa(mesa);
        if (retorno) {
            Mensagem.inserirMensagem("msgdlgcdstr", "Sucesso ao salvar a" + mesa.getNumero());
            mesa = new Mesa();
        } else {
            Mensagem.inserirMensagemErro("mshdlgcdstr", "Falha");
        }

    }
    
   
    public void carregar() {
        lista = DAO.carregar();
        if (!lista.isEmpty()) {
            Mensagem.inserirMensagem("msgtlbr","Lista carregada com "+lista.size()+ "ocorrências");
        }
        else{
        Mensagem.inserirMensagemErro("msgtlbr","Nenhum dados encontrado");
        }

    }
    public void limpar() {
        mesa = new Mesa();
    }
    
    public void excluir(Mesa m){
    mesa= m;
    DAO.excluir(mesa);
    
    }
    
    public void modificar(Mesa m){    
    mesa = m;   
    }
    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public List<Mesa> getLista() {
        return lista;
    }

    public void setLista(List<Mesa> lista) {
        this.lista = lista;
    }

}
