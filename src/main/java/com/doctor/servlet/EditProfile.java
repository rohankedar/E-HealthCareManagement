package com.doctor.servlet;

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

@WebServlet("/doctorUpdateProfile")
public class EditProfile extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			String fullName = req.getParameter("fullname");
			String dob = req.getParameter("dob");
			String quilification = req.getParameter("quilification");
			String spec = req.getParameter("spec");
			String email = req.getParameter("email");
			String mobileno = req.getParameter("mobileno");
			
			
			int id=Integer.parseInt(req.getParameter("id"));
			
			Doctor d=new Doctor(id,fullName, dob, quilification, spec, email, mobileno, "");
			
			DoctorDao dao= new DoctorDao(DBConnect.getConn());
			HttpSession session=req.getSession();
			
			if(dao.editDoctorProfile(d))
			{
				Doctor updateDoctro=dao.getDoctorById(id);
				session.setAttribute("succMsgd", "Doctor Updated Successfully...");
				session.setAttribute("doctObj", updateDoctro);
				resp.sendRedirect("doctor/edit_profile.jsp");
			} else {
				session.setAttribute("errorMsgd", "Something Wrong Please Check it");
				resp.sendRedirect("doctor/edit_profile.jsp.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
