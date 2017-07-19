

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		
		
		HttpSession session = request.getSession(false);
		
		if(session == null)
		{
			out.print("No session found. Login First");
			request.getRequestDispatcher("index.html").include(request, response);
		}
		else
		{
			String name = (String)session.getAttribute("name");
			out.println("Hello " + name );
		}
		
		out.close();
		
	}

}
