
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            if (request.getParameter("guia").equalsIgnoreCase("123")) {

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>EXITOSO</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Numero de guia: " + request.getParameter("guia") + "</h1>");
                out.println("<h1>Lugar: " + request.getParameter("idLugar").toUpperCase() + "</h1>");
                out.println("<h1>El paquete contiene una computadora nueva de parte de Santa Claus!!!</h1>");
                out.println("</body>");
                out.println(" <button onclick=\"location.href='index.html'\">Llévame al inicio</button>");
                out.println("</html>");

            } else{
            
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>SIN RESULTADOS</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>La guia: " + request.getParameter("guia") + " no es valida. </h1>");
                out.println("</body>");
                out.println(" <button onclick=\"location.href='index.html'\">Llévame al inicio</button>");    
                out.println("</html>");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        try
        {
            String username = request.getParameter("name");
            String password = request.getParameter("pass");
            
            if(username.equals("abc") && password.equals("123"))
            {
                response.sendRedirect("index.html");
                
                
            }else
                response.sendRedirect("newjsp1.jsp");
                
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
