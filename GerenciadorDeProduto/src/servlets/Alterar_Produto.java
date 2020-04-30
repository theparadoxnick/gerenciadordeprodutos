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

@WebServlet("/Alterar_Produto.do")
public class Alterar_Produto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int codigo = Integer.parseInt(request.getParameter("codigo_produto"));
		String nome = request.getParameter("nome_produto");
		String descricao = request.getParameter("descricao_produto");
		double valor = Double.parseDouble(request.getParameter("valor_produto"));
		int estoque = Integer.parseInt(request.getParameter("estoque_produto"));
		
		Produto produto = new Produto();
		produto.setCodigo(codigo);
		produto.setNome(nome);
		produto.setDescricao(descricao);
		produto.setValor(valor);
		produto.setEstoque(estoque);
		
		ProdutoService produtoService = new ProdutoService();
		
		produtoService.alterar(produto);
		
		PrintWriter saida = response.getWriter();
		
		saida.println("Produto alterado com sucesso.");
		
	}

}
