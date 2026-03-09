package com.mysite.mbti;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@GetMapping("/mbti")
	@ResponseBody
	public String mbti() {
		return "this is MBTI website.";
	}

}
