import javax.servlet.http.*;  
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

import java.io.*;  
@SuppressWarnings("serial")
@WebServlet("/Test")
public class Test extends HttpServlet{  
public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{  
res.setContentType("text/html");  
PrintWriter pw=res.getWriter();  

FetchRecord r=new FetchRecord();
try {
	r.mains();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  
String name=req.getParameter("name");//will return value  
pw.println("Welcome "+name);  


  
pw.close();  
}}