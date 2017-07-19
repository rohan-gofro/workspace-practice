

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet(name = "login", urlPatterns = { "/login" })
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

       public Login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(password.equals("123"))
		{
			out.println("Login Success");
			out.println("Welcome " + name);
			
			Cookie ck = new Cookie("name", name);
			response.addCookie(ck);
		}
		else
		{
			out.println("Wrong credentials");
			request.getRequestDispatcher("index.html").include(request, response);
		}
		
		out.close();
	}

}
