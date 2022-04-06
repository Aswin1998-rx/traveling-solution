package net.travel.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



import net.travel.entity.AgencyDetails;
import net.travel.entity.Booking;
import net.travel.entity.TravelPack;
import net.travel.entity.Userinfo;
import net.travel.repository.PackageRepository;
import net.travel.repository.UserRepository;
import net.travel.service.AgencyServiceI;
import net.travel.service.BookingServiceI;
import net.travel.service.PackageServiceI;
import net.travel.service.UserServiceI;

@Controller
public class PackController {
	@Autowired
	private PackageServiceI packageServiceI;
	@Autowired
	PackageRepository packageRepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	AgencyServiceI agencyServiceI;
	@Autowired
	UserServiceI userServiceI;
	@Autowired
	BookingServiceI bookingServiceI;
	
	@RequestMapping("/listpack")
	public ModelAndView home() {
		List<TravelPack> listpack = packageServiceI.listAll();
		ModelAndView mav = new ModelAndView("listpack");
		mav.addObject("listpack",listpack);
		return mav;

}
//	@RequestMapping(value="/book/{userid}", method = RequestMethod.GET)
//	public String packbooking(@PathVariable Long userid, Model model) {
//		return "userid";
//	}
	@RequestMapping(value = "/aRegister", method = RequestMethod.POST)
	public String CreatUser(@ModelAttribute("agency") AgencyDetails agency) {
	    agencyServiceI.save(agency);
	    return "agencylogin";
	}
	@RequestMapping(value="/booking",method=RequestMethod.GET)
	public String newbooking(Map<String, Object> model) {
	    Booking booking = new Booking();
	    model.put("listpack",booking);
	    return "listpack";
	} 
	@RequestMapping(value="/bookingz",method=RequestMethod.POST)
	public String Creatagency(@ModelAttribute("listpack") Booking booking) {
		   bookingServiceI.save(booking);
		    return "Userview";
		
		 
	}

//	// some booking apis which return Booking objects
//	@Query(value = "SELECT a FROM booking b WHERE " +
//	        "EXISTS (SELECT 1 FROM userinfo c WHERE bs.customer_id = c.id AND c.phone = :phone) " +
//	        "AND EXISTS (SELECT 1 FROM books b WHERE b.id = bs.book_id AND b.author IN :authors)",
//	        nativeQuery = true)
//	List&lt;Booking&gt; queryBy(@Param("phone_no") String phone,
//	                        @Param("authors") List&lt;String&gt; authors);
	}

