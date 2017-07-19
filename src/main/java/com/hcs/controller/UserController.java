package com.hcs.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hcs.entity.AcctUser;
import com.hcs.service.AcctUserService;

@Controller
public class UserController {
	
private static final Logger LOGGER = Logger.getLogger(UserController.class);
	
	@Autowired
	private AcctUserService userService;
	
	@RequestMapping("/showInfo/{userId}")
	public String showUserInfo(ModelMap modelMap, @PathVariable String userId){
		LOGGER.info("查询用户：" + userId);
		String hql = "from AcctUser where id="+userId;
		List<AcctUser> list = userService.find(hql);
		if(list.size()==1) {
			modelMap.addAttribute("userInfo", list.get(0));
		}
		return "/showInfo";
	}
	
	@RequestMapping("/showInfos")
	public @ResponseBody List<AcctUser> showUserInfos(){
		LOGGER.info("查询用户全部用户");
		String hql = "from AcctUser";
		List<AcctUser> userInfos = userService.find(hql);
		return userInfos;
	}

}
