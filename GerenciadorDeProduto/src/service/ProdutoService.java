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
	
	//Método cadastrar Produto:
	public void cadastrar(Produto produto) {
		produtoDAO.cadastrar(produto);
	}
	
	//Método alterar produto:
	public void alterar(Produto produto) {
		
		produtoDAO.alterar(produto);
	}
	
	//Método excluir produto:
	public void excluir(Produto produto) {
		produtoDAO.excluir(produto);
	}
	
	//Método consultar produto:
	public Produto consultar(int codigo) {
		return produtoDAO.consultar(codigo);
	}
	
	//Métodolistar produto:
	public ArrayList<Produto> listarProdutos(){
		return produtoDAO.listarProdutos();
	}
	
}
