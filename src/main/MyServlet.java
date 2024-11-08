import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/myServlet")
public class MyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtenemos el nombre del formulario
        String name = request.getParameter("name");

        // Configuramos el tipo de contenido de la respuesta
        response.setContentType("text/html");

        // Generamos la respuesta HTML
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Bienvenida</title></head>");
        out.println("<body>");
        out.println("<h1>Bienvenida, " + name + "!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
