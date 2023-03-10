package EmployeeManagement;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateEmployee
 */
@WebServlet("/UpdateEmployee")
public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String eid = request.getParameter("id");
		
		int id = Integer.parseInt(eid);
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String designation = request.getParameter("designation");
		String dob = request.getParameter("dob");
		String salary = request.getParameter("salary");
		
        System.out.println("Pass");
		int emp = 3;
		
		emp = Employee.UpdateEmployee(id,name,address,phone, email, designation, dob, salary);

		if (emp == 1) {

			
			RequestDispatcher dis = request.getRequestDispatcher("ViewEmployee.jsp");
			dis.forward(request, response);
			System.out.println("Successful");
			
		} else if (emp == 0) {

			
			RequestDispatcher dis2 = request.getRequestDispatcher("ViewEmployee.jsp");
			dis2.forward(request, response);
			System.out.println("UnSuccessful");
		}
	}

}
