package com.ssm.user.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ssm.user.dto.UserDTO;
import com.ssm.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	/** 查询 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	private String list(Model model) {
		List<UserDTO> list = userService.findByCondition();
		model.addAttribute("list", list);
		return "list";
	}
	
}
