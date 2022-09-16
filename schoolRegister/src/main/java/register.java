

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private registerdao registerdao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	registerdao = new registerdao();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		String action=request.getServletPath();
		switch(action) {
		case"/new":
			showNewForm(request,response);
			break;
		case"/insert":
			try {
				insertStudent(request,response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case"/delete":
			try {
				deleteStudent(request,response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case"/edit":
			try {
				showEditForm(request,response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case"/update":
			try {
				updateStudent(request,response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			default:
			try {
				listStudent(request,response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				break;
		}
	}
		private void showNewForm(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		RequestDispatcher dis=	request.getRequestDispatcher("register.jsp");
		dis.forward(request, response);
		}
		
		private void insertStudent(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException, SQLException{
			String FirstName=request.getParameter("FirstName");
			String LastName=request.getParameter("LastName");
			String address=request.getParameter("address");
			String studentid=request.getParameter("studentid");
			String gender=request.getParameter("gender");
			String grade=request.getParameter("grade");
			student sttt =new student(FirstName,LastName,address,studentid,gender,grade);
			
			registerdao registerdao = new registerdao();
			registerdao.insertStudent(sttt);
			response.sendRedirect("List");
		}
		private void deleteStudent(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException,SQLException{
			String studentid=request.getParameter("studentid");
			try {
				registerdao.deleteStudent(studentid);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect("List");
		}
		private void showEditForm(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException,SQLException{
			String studentid=request.getParameter("studentid");
			student existingStudent;
			try {
			existingStudent=registerdao.selectStudent(studentid);
			RequestDispatcher dis=	request.getRequestDispatcher("register.jsp");
			request.setAttribute("student",existingStudent );
			dis.forward(request, response);
			}
			catch(Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		private void updateStudent(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException,SQLException{
			String FirstName=request.getParameter("FirstName");
			String LastName=request.getParameter("LastName");
			String address=request.getParameter("address");
			String studentid=request.getParameter("studentid");
			String gender=request.getParameter("gender");
			String grade=request.getParameter("grade");
			student student = new student(FirstName,LastName,address,studentid,gender,grade);
			registerdao.updateStudent(student);
			response.sendRedirect("List");
		}
			
		private void listStudent(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException,SQLException{
			List<student> listStudent=registerdao.selectAllStudents();
			RequestDispatcher dis=	request.getRequestDispatcher("register.jsp");
			request.setAttribute("listStudent",listStudent );
			dis.forward(request, response);
			}
		
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
