package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Produto;
import service.ProdutoService;

@WebServlet("/Excluir_Produto.do")
public class Excluir_Produto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int codigo = Integer.parseInt(request.getParameter("codigo_produto"));
		
		ProdutoService produtoService = new ProdutoService();
		
		Produto produto = new Produto();
		produto.setCodigo(codigo);
		
		produtoService.excluir(produto);
		
		PrintWriter saida = response.getWriter();
		saida.println("O Produto de codigo " + codigo + " foi excluido.");
	}

}
