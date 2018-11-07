package com.app.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.app.bean.Student;
import com.app.dao.StudentDAO;
import com.app.dao.StudentDAOImpl;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("In controller");
		String action = request.getParameter("action");
		RequestDispatcher view = null;

		if (action.equals("register")) {
			view = request.getRequestDispatcher("Register.jsp");
			view.forward(request, response);
		} else if (action.equals("list")) {

			StudentDAO dao = new StudentDAOImpl();
			try {

				List<Student> student1 = dao.getAllStudents();
				for (Student e : student1) {
					System.out.println(e.getName() + " " + e.getGender() + " " + e.getUniv_num());
				}
				request.setAttribute("studdata", student1);
				view = request.getRequestDispatcher("List_old.jsp");
				view.forward(request, response);

			
			} catch (Exception e) {
				e.printStackTrace();

			}
		
		} else if (action.equals("new_register")) {
			int univ_no = Integer.parseInt(request.getParameter("univ_no"));
			String gender = request.getParameter("gender");
			String name = request.getParameter("name");
			Student student = new Student(name, gender, univ_no);
			StudentDAO dao = new StudentDAOImpl();
			try {
				dao.registrationStudent(student);

			} catch (Exception e) {
				e.printStackTrace();

			}
		} 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
