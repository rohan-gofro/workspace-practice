

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Profile
 */
@WebServlet(name = "profile", urlPatterns = { "/profile" })
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);
		
		Cookie ck[] = request.getCookies();
		if(ck!=null)
		{
			String name = ck[0].getValue();
			if(!name.equals("") || name != null)
			{
				out.println("<h1>Welcome to profile</h1><br>");
				out.println("Welcome " + name);
			}
		}
		else
		{
			out.println("Login first");
			request.getRequestDispatcher("index.html").include(request, response);
		}
		
		out.close();

	}

}
