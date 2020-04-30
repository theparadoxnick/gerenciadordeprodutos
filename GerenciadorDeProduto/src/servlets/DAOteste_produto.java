package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProdutoDAO;
import model.Produto;

@WebServlet("/DAOteste_produto.do")
public class DAOteste_produto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Teste de inserção:
		Produto p = new Produto(124, "coco","coco fedido", 12.90, 2);
		
		ProdutoDAO pDAO = new ProdutoDAO();
		
		pDAO.cadastrar(p);
		
		// Teste de consulta:
		Produto p1 = pDAO.consultar(123);
		
		//System.out.println(p1.getNome());	}
		
		System.out.println(pDAO.listarProdutos().size());
	}

}
