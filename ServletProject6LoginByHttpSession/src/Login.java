import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */

@WebServlet(name = "login", urlPatterns = { "/login" })
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();	
		
		request.getRequestDispatcher("link.html").include(request, response);
		
		pw.println("<br>This is login servlet");
		
		String username = request.getParameter("uname");
		HttpSession session = request.getSession();
		session.setAttribute("name", username);
		pw.println("<br>Login Success<br>");
		pw.println("Welcome " + username );
		pw.close();
	}

}
