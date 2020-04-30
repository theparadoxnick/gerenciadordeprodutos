package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Produto;
import service.ProdutoService;

@WebServlet("/Lista_Produtos.do")
public class Lista_Produtos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProdutoService produtoService = new ProdutoService();
		
		ArrayList<Produto> listaProdutos = produtoService.listarProdutos();
		
		response.setContentType("text/html");
		
		PrintWriter saida = response.getWriter();
		
		saida.println("Lista de produtos: " + "<br>");
		
		listaProdutos.forEach(p -> {
			saida.println("- Código:  " + p.getCodigo());
			saida.println(" - Nome:  " + p.getNome());
			saida.println(" - Descrição:  " + p.getDescricao());
			saida.println(" - Valor:  " + p.getValor());
			saida.println(" - Estoque:  " + p.getEstoque());
			saida.println("<br>");
		});
		
	}


}
