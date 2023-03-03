package admin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import admin.dto.AdminDTO;
import admin.dto.adminAuthInfo;
import admin.service.AdminService;

//	http://localhost:8090/myapp/admin/adminSignup.do

@Controller
public class AdminController {
	
	private AdminService adminService;
	
	public AdminController() {

	}
	
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
	// 관리자 회원가입 폼
	@RequestMapping(value="/admin/adminSignup.do", method=RequestMethod.GET)
	public ModelAndView addAdmin(ModelAndView mav) {
		mav.setViewName("admin/adminSignup");
		return mav; 
};
	
	// 관리자 회원가입 후 홈페이지로 redirect
	@RequestMapping(value="/admin/adminSignup.do", method=RequestMethod.POST)
	public String addAdmin(AdminDTO dto, HttpSession session) {
		adminAuthInfo authInfo = adminService.addAdminProcess(dto);
		session.setAttribute("authInfo", authInfo);
		return "redirect:/home.do";
	}

}