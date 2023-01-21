package backend.Projekti1.aloitus.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EkaController {
	
	@RequestMapping("main")
	@ResponseBody
	public String returnMainPage( ) {
		return "Car application!";
	}
	
	@RequestMapping("moikkaa")
	@ResponseBody
	public String sayHello(@RequestParam(name="nimesi", required=false, defaultValue="Nameless") String nimi, @RequestParam(name="ika") int ika) {
		return "Hei " + nimi + "! Olet " + ika + " vuotta.";
	}

}
