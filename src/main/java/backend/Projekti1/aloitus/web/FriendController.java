package backend.Projekti1.aloitus.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import backend.Projekti1.aloitus.domain.Friend;

@Controller
public class FriendController {
	
	private ArrayList<Friend> friends = new ArrayList<>();

	@GetMapping(value = "/index")
	public String askName(Model model) {
		model.addAttribute("friendsList", friends);
		model.addAttribute("index", new Friend());
		return "friends";
	}
	
	@PostMapping("/index")
	public String sendName(@ModelAttribute Friend kaveri) {
		friends.add(kaveri);
		return "redirect:/index";
	}
	
}