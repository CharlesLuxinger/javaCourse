package br.com.charles.maven.lojaweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.maven.Produto;
import br.com.caelum.stella.tinytype.CPF;

@WebServlet(urlPatterns = {"/contato"})
public class ContatoServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Produto p1 = new Produto("Teste", 1.5);
		new CPF("99999999").isValido();
		PrintWriter writer = resp.getWriter();
		writer.println("<html><h2>Fale Conosco!</h2></html>");
		writer.close();
	}
}
