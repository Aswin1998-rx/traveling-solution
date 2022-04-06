package net.travel.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.travel.entity.AgencyDetails;
import net.travel.entity.Booking;
import net.travel.entity.TravelPack;
import net.travel.entity.Userinfo;
import net.travel.service.AgencyServiceI;
import net.travel.service.BookingServiceI;
import net.travel.service.PackageService;
import net.travel.service.PackageServiceI;
import net.travel.service.UserService;

@Controller
public class AgencyController {
	@Autowired
	private AgencyServiceI agencyServiceI;
	@Autowired
	private PackageServiceI packageServiceI;
	@Autowired
	private BookingServiceI bookingServiceI;
	
	@RequestMapping("/listPackages")
	public ModelAndView home() {
		List<AgencyDetails> listPack = agencyServiceI.listAll();
		ModelAndView mav = new ModelAndView("ListPackages");
		mav.addObject("istPackages",listPack);
		return mav;
		
	}
	
	    @RequestMapping(value = "/newpack", method = RequestMethod.POST)
		public String newpack(@ModelAttribute("packages")TravelPack  tra) {
		    packageServiceI.save(tra);
		    return "AgencyView";
	} 
	@RequestMapping(value="/newa", method = RequestMethod.GET)
	public String newagency(Map<String, Object> model) {
	    AgencyDetails agency = new AgencyDetails();
	    model.put("agency", agency);
	    return "AddAgency";
	} 
	@RequestMapping(value="/addPackages", method = RequestMethod.GET)
	public String newpack(Map<String, Object> model) {
	    TravelPack packs = new TravelPack();
	    model.put("packz", packs);
	    return "AddPackages";
	}
	@RequestMapping(value="/alogout", method = RequestMethod.GET)
	public String aglogout(Map<String, Object> model) {
	    TravelPack packzz = new TravelPack();
	    model.put("packz", packzz);
	    return "index";
	}
	@RequestMapping(value="/viewbook")
	public ModelAndView vhome() {
		List<Booking> Bookinglist = bookingServiceI.listAll();
		ModelAndView mav = new ModelAndView("Bookinglist");
		mav.addObject("Bookinglist",Bookinglist);
		return mav;
	    
	}
//	@RequestMapping(value = "/save", method = RequestMethod.POST)
//	public String CreatPack(@ModelAttribute("user") TravelPack packz) {
//	    packageservice.save(packz);
//	    return "redirect:/";
//	}
	@RequestMapping(value="loginagency",method=RequestMethod.POST )
	public  ModelAndView loginagency(@ModelAttribute("agencylog")AgencyDetails agencydetails, ModelMap map,HttpSession httpSession,ModelAndView mv) {
	  AgencyDetails ain=agencyServiceI.loginagency(agencydetails.getAname(),agencydetails.getPassword());
		
		if(ain ==  null) {
			map.put("error", "login fail");
			mv.setViewName("LoginAgeny");
			return mv;
		}
		else {
		// httpSession. setAttribute("username", student.getStudentid());
            
			return new ModelAndView("AgencyView", "stud", ain);
		}
	}
	@RequestMapping(value = "/savea", method = RequestMethod.POST)
	public String Creatagency(@ModelAttribute("agency") AgencyDetails agency) {
	   agencyServiceI.save(agency);
	    return "agencylogin";
	}

}
