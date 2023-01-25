package backend.Projekti1.aloitus.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@GetMapping("/hei")
	public String hei(@RequestParam(name="name") String name, @RequestParam(name="age") String age, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "result.html";
	}
	
}
