package com.mysite.mbti.Question1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuestionController {

	@GetMapping("/Q1/main")
	public String list() {
		return "main_list";
	}
}
