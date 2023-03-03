package user.controller;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import user.dto.AuthInfo;
import user.dto.UserDTO;
import user.service.UserService;

//http://localhost:8090/myapp/user/signup.do

@Controller
public class UserController {

	private UserService userService;
	
	public UserController() {
		
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	//홈페이지
	
	//회원가입 폼
	@RequestMapping(value="/user/signup.do", method=RequestMethod.GET)
	public ModelAndView addMember(ModelAndView mav) {
		mav.setViewName("user/signup");
		return mav;
	}
	
	//회원가입 시 addUserProcess로 회원을 추가 한 후,
	//세션에 인증정보 저장 후 홈으로 redirect
	@RequestMapping(value="/user/signup.do", method=RequestMethod.POST)
	public String addMember(UserDTO userDTO, HttpSession session) {
		AuthInfo authInfo = userService.addUserProcess(userDTO);
		session.setAttribute("authInfo", authInfo);
		return "redirect:/home.do";
	}
	
	/*
	 * @RequestMapping(value="/user/books.do", method=RequestMethod.GET) public
	 */
}
