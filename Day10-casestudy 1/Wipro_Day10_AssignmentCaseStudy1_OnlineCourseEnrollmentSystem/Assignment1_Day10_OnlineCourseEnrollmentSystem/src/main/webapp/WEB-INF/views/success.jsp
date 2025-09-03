<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
<meta charset="UTF-8">
<title>Enrollment Confirmation</title>
<style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f5f5f5;
            margin: 0;
            padding: 20px;
        }
        .container {
            max-width: 600px;
            margin: 0 auto;
            background-color: white;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
            text-align: center;
        }
        h1 {
            color: #2ecc71;
            margin-bottom: 20px;
        }
        .confirmation-icon {
            font-size: 60px;
            color: #2ecc71;
            margin-bottom: 20px;
        }
        .details {
            text-align: left;
            background-color: #f8f9fa;
            padding: 20px;
            border-radius: 4px;
            margin: 20px 0;
        }
        .back-link {
            display: inline-block;
            background-color: #3498db;
            color: white;
            padding: 10px 20px;
            text-decoration: none;
            border-radius: 4px;
            font-weight: bold;
            transition: background-color 0.3s;
        }
        .back-link:hover {
            background-color: #2980b9;
        }
    </style>
</head>
<body>
                 <div class="container">
        <div class="confirmation-icon">✓</div>
        <h1>Enrollment Confirmed!</h1>
        
        <div class="details">
            <p><strong>Student Name:</strong> ${student.name}</p>
            <p><strong>Email:</strong> ${student.email}</p>
            <p><strong>Course:</strong> ${course.title}</p>
            <p><strong>Instructor:</strong> ${course.instructor}</p>
            <p><strong>Price:</strong> $${course.price}</p>
        </div>
        
        <p>We have sent a confirmation email to ${student.email}.</p>
        <p><a href="courses" class="back-link">Back to Courses</a></p>
    </div>
</body>
</html>