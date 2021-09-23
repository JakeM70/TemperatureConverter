package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.FahrenheitConverter;



/**
 * Servlet implementation class getFahrenheitServlet
 */
@WebServlet("/getFahrenheitServlet")
public class getFahrenheitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getFahrenheitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String userTemp = request.getParameter("userTemp");
		
		FahrenheitConverter userTempF = new FahrenheitConverter(Double.parseDouble(userTemp));
		request.setAttribute("userTemperature", userTempF);
		getServletContext().getRequestDispatcher("/resultF.jsp").forward(request, response);
	}

}
