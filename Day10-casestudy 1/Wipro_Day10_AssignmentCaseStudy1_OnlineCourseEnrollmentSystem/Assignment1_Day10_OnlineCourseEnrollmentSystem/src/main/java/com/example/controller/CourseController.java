package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Course;
import com.example.model.Student;

@Controller
public class CourseController {

	 private List<Course> courses = Arrays.asList(
		        new Course("C001", "Spring Framework", "Sanjith", 6449.99),
		        new Course("C002", "Java Programming", "Manoj", 4439.99),
		        new Course("C003", "Web Development", "Harsha", 4659.99)
		    );
	 
	 @GetMapping("/")
	 public String home() {
		 return "redirect:/courses";
	 }
	 
	 @GetMapping("/courses")
	 public String showCourses(Model model) {
		 model.addAttribute("courses", courses);
		 return "courses";
	 }
	 
	 @GetMapping("/enroll")
	 public String showEnrollmentForm(@RequestParam String courseId, Model model) {
		 Course selectedCourse = courses.stream()
				 .filter(c -> c.getId().equals(courseId))
				 .findFirst()
				 .orElse(null);
		 
		 model.addAttribute("course", selectedCourse);
		 model.addAttribute("student", new Student());
		 return "enroll";
	 }
	 
	 @PostMapping("/submitEnrollment")
	 public String processEnrollment(@ModelAttribute Student student, Model model) {
		 Course enrolledCourse = courses.stream()
				 .filter(c -> c.getId().equals(student.getCourseId()))
				 .findFirst()
				 .orElse(null);
		 
		 model.addAttribute("student", student);
		 model.addAttribute("course", enrolledCourse);
		 return "success";
	 }
}
