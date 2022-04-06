package net.travel.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import net.travel.entity.TravelPack;
import net.travel.entity.Userinfo;
import net.travel.service.PackageService;
import net.travel.service.PackageServiceI;
import net.travel.service.UserService;
import net.travel.service.UserServiceI;



@Controller
public class UserControler {
	
	@Autowired
	private UserServiceI userservicei;
	
	private PackageServiceI packageServiceI;
	@RequestMapping("/")
	public String log() {
		return "index";
	}
	
	  
	
	
//	@RequestMapping("/listpackz")
//	public ModelAndView home() {
//		List<TravelPack> listpack = packageServiceI.listAll();
//		ModelAndView mav = new ModelAndView("listpack");
//		mav.addObject("listpack",listpack);
//		return mav;
//		
//		
//	}
	@RequestMapping(value="/new1", method = RequestMethod.GET)
	public String newUserForm(Map<String, Object> model) {
	    Userinfo user = new Userinfo();
	    model.put("user", user);
	    return "UserRegister";
	} 
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String CreatUser(@ModelAttribute("user") Userinfo user) {
	    userservicei.save(user);
	    return "LoginUser";
	}

	@RequestMapping(value="loginuser",method=RequestMethod.POST )
	public  ModelAndView loginuser(@ModelAttribute("userlog")Userinfo userinfo, ModelMap map,HttpSession httpSession,ModelAndView mv) {
	  Userinfo userin=userservicei.loginuser(userinfo.getName(),userinfo.getPassword());
		
		if(userin ==  null) {
			map.put("error", "login fail");
			mv.setViewName("LoginUser");
			return mv;
		}
		else {
		// httpSession. setAttribute("username", student.getStudentid());
			return new ModelAndView("UserView", "name",userin);
			
			
		}
			
	}
//	@GetMapping("/userlog")
//	public String loginu() {
//		return "UserView";
//	}
//	@RequestMapping("/edit")
//	public ModelAndView editCustomerForm(@RequestParam long id) {
//	    ModelAndView mav = new ModelAndView("Edit_Customer");
//	    Customer customer = customerService.get(id);
//	    mav.addObject("customer", customer);
//	 
//	    return mav;
//	}
//	@RequestMapping("/delete")
//	public String deleteUserForm(@RequestParam long Userid) {
//	    UserService.delete(Userid);
//	    return "redirect:/";       
//	}
	@RequestMapping(value="/ulogout", method = RequestMethod.GET)
	public String uslogout(Map<String, Object> model) {
//	    Userinfo packzz = new Userinfo();
//	    model.put("packz", pac);
	    return "index";
	}
}
