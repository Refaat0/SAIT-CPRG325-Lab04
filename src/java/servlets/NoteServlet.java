package servlets;

import java.io.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

public class NoteServlet extends HttpServlet {

    // Handles the GET request
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // read notes
        String path = getServletContext().getRealPath("/WEB-INF/notes.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));

        // get title and content from notes.txt
        String noteTitle = br.readLine();
        String noteContent = br.readLine();

        // create Note object
        Note note = new Note(noteTitle, noteContent);

        // send Note object to the JSP
        request.setAttribute("note", note);

        // read the query string
        String mode = request.getParameter("edit");

        if (mode == null) {
            // render viewnote jsp
            request.getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
            return;
        } else {
            // render editnote jsp
            request.getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
            return;
        }

    }

    // Handles the POST requests
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("foo bar");

        // redirect to the viewnotes jsp
        response.sendRedirect("note");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
