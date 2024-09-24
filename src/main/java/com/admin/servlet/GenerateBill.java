package com.admin.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.BillDAO;
import com.db.DBConnect;
import com.entity.Bill;

@WebServlet("/generateBill")
public class GenerateBill extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String fullName = request.getParameter("fullName");
			String medicinenames = request.getParameter("medicinenames");
			String diseases = request.getParameter("diseases");
			String pymentStatus = request.getParameter("pymentStatus");
			
			int Id = Integer.parseInt(request.getParameter("Id"));
			int doctorcharges = Integer.parseInt(request.getParameter("doctorcharges"));
			int medicinequantity = Integer.parseInt(request.getParameter("medicinequantity"));
			int medicinecharges = Integer.parseInt(request.getParameter("medicinecharges"));
			int bedcharges = Integer.parseInt(request.getParameter("bedcharges"));
			int nursecharges = Integer.parseInt(request.getParameter("nursecharges"));
			int extracharges = Integer.parseInt(request.getParameter("extracharges"));
			
			double amountDue = Double.parseDouble(request.getParameter("amountDue"));
			
			Bill b = new Bill(Id,fullName,doctorcharges,medicinenames,diseases,medicinequantity,medicinecharges,bedcharges,nursecharges,extracharges,amountDue,pymentStatus);
			
			BillDAO dao = new BillDAO(DBConnect.getConn());
			HttpSession session = request.getSession();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
