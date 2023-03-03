package admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import admin.dao.AdminDAO;

public class AdminController {
	private AdminDAO adminDao;
	
	@RequestMapping(value="adminSignup.do", method=RequestMethod.GET)
	public ModelAndView addMember(ModelAndView mav) {
		mav.setViewName("admin/signup");
		return mav; 
};

}