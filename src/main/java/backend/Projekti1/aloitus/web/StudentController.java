package backend.Projekti1.aloitus.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import backend.Projekti1.aloitus.domain.Student;

@Controller
public class StudentController {
	
	@GetMapping("hello")
	public String hello(Model model) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Essek", "Thelyss"));
		students.add(new Student("Caleb", "Widogast"));
		students.add(new Student("Mollymauk", "Tealeaf"));
		model.addAttribute("students", students);
		return "studentList";
	}

}
