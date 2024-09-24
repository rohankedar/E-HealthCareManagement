package com.admin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.DoctorDao;
import com.db.DBConnect;
import com.entity.Doctor;

@WebServlet("/updateDoctor")
public class UpdateDoctor extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			String fullName = req.getParameter("fullname");
			String dob = req.getParameter("dob");
			String quilification = req.getParameter("quilification");
			String spec = req.getParameter("spec");
			String email = req.getParameter("email");
			String mobileno = req.getParameter("mobileno");
			String password = req.getParameter("password");
			
			int id=Integer.parseInt(req.getParameter("id"));
			
			Doctor d=new Doctor(id,fullName, dob, quilification, spec, email, mobileno, password);
			
			DoctorDao dao= new DoctorDao(DBConnect.getConn());
			HttpSession session=req.getSession();
			
			if(dao.updateDoctor(d))
			{
				session.setAttribute("succMsg", "Doctor Updated Successfully...");
				resp.sendRedirect("admin/view_doctor.jsp");
			} else {
				session.setAttribute("errorMsg", "Something Wrong Please Check it");
				resp.sendRedirect("admin/view_doctor.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
