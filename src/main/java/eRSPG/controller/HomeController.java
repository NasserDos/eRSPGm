package eRSPG.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.websocket.Session;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
 
		return "home";
	}

}
