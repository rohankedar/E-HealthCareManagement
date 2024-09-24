<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Patient Bill</title>
</head>
<body>
    <h1>Patient Bill Details</h1>
    <p>Patient ID: ${bill.patientId}</p>
    <p>Amount Due: ${bill.amountDue}</p>
    <p>Payment Status: ${bill.paymentStatus}</p>
</body>
</html>