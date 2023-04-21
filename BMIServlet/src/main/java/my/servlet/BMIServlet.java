package my.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.PrintWriter;

/**
* Servlet implementation class BMIServlet
*/
@WebServlet("/BMIServlet")

public class BMIServlet extends HttpServlet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BMIServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    out.println("<html>");
    out.println("<head>");
    out.println("<title>BMI Calculator</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>BMI Calculator</h1>");
    out.println("<form method=\"post\">");
    out.println("<fieldset>");
    out.println("Weight (kg): <input type=\"text\" name=\"weight\"><br><br>");
    out.println("Height (m): <input type=\"text\" name=\"height\"><br><br>");
    out.println("<input type=\"submit\" value=\"Get My BMI\">");
    out.println("</fieldset>");
    out.println("</form>");
    out.println("</body>");
    out.println("</html>");
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doGet(request, response);
	response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    String weightString = request.getParameter("weight");
    String heightString = request.getParameter("height");

    double weight = Double.parseDouble(weightString);
    double height = Double.parseDouble(heightString) / 100;

    double bmi = weight / (height * height);

    out.println("<html>");
    out.println("<head>");
    out.println("<title>BMI Result</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>BMI Result</h1>");
    out.println("<p>Your BMI is: " + bmi + "</p>");
    out.println("</body>");
    out.println("</html>");
    
  }
}
