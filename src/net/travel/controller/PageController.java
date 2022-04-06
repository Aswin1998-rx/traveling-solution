package net.travel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("/signin")
	public String sign(){
		return "LoginUser";
		
		
	}
//	@RequestMapping("/userlog")
//	public String ulog() {
//		return "UserView";
//	}

	@RequestMapping("/Adlogin")
	public String adlogin(){
		return "LoginAdmin";
		
		
	}
	@RequestMapping("/aglogin")
	public String aglogin(){
		return "agencylogin";
		
		
	}
	
}
