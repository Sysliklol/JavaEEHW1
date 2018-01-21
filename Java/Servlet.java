import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
  
public class Servlet extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();   
    String n=request.getParameter("name");  
    String p=request.getParameter("password");  
    if(n.equals("1")&&p.equals("1")){
    	System.out.println(n);
        RequestDispatcher rd=request.getRequestDispatcher("welcome");  
        rd.forward(request,response);  
    }  
    else{  
        out.print("Wrong password");  
        System.out.println(n);
        RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
        rd.include(request,response);   
    }   
    out.close();  
    }  
}  	