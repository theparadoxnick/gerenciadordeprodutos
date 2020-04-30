package service;

import java.util.ArrayList;

import dao.ProdutoDAO;
import model.Produto;

public class ProdutoService {
	
	private ProdutoDAO produtoDAO;
	
	//Contrutor iniciando produtoDAO:
	public ProdutoService() {
		this.produtoDAO = new ProdutoDAO();
	}
	
	//M�todo cadastrar Produto:
	public void cadastrar(Produto produto) {
		produtoDAO.cadastrar(produto);
	}
	
	//M�todo alterar produto:
	public void alterar(Produto produto) {
		
		produtoDAO.alterar(produto);
	}
	
	//M�todo excluir produto:
	public void excluir(Produto produto) {
		produtoDAO.excluir(produto);
	}
	
	//M�todo consultar produto:
	public Produto consultar(int codigo) {
		return produtoDAO.consultar(codigo);
	}
	
	//M�todolistar produto:
	public ArrayList<Produto> listarProdutos(){
		return produtoDAO.listarProdutos();
	}
	
}
