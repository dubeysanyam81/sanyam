import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ MatrixSolverServlet")
public class MatrixSolverServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int n = 8; // Change this to the desired board size (e.g., 8 for an 8x8 board)
        char[][] board = new char[n][n];
        
        // Initialize the board with empty cells
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        
        // Solve the N-Queens problem (you should have a solver for this)
        // Fill the 'board' array with the solution
        
        // Example solution for an 8x8 board
        board[0][1] = 'Q';
        board[1][3] = 'Q';
        board[2][0] = 'Q';
        board[3][2] = 'Q';
        board[4][5] = 'Q';
        board[5][7] = 'Q';
        board[6][4] = 'Q';
        board[7][6] = 'Q';

        // Set the response content type to HTML
        response.setContentType("text/html");
        
        // Get the PrintWriter to write the HTML response
        PrintWriter out = response.getWriter();
        
        // Generate the HTML table representing the chessboard
        out.println("<html>");
        out.println("<head>");
        out.println("<title>N-Queens Solution</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>N-Queens Solution</h1>");
        out.println("<table border='1'>");
        
        for (int i = 0; i < n; i++) {
            out.println("<tr>");
            for (int j = 0; j < n; j++) {
                out.println("<td>" + board[i][j] + "</td>");
            }
            out.println("</tr>");
        }
        
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}
