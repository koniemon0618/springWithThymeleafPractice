package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sample")
public class SampleController {
//	@RequestMapping(method = RequestMethod.GET)
//    public String test(Model model) {
//        model.addAttribute("name", "SampleAPI");
//        model.addAttribute("get", "GET /sample");
//        model.addAttribute("post", "POST /sample");
//        return "sample/index";
//    }
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping(path = "/sample", method = RequestMethod.GET)
	String index(Model model) {
	    List<User> list = jdbcTemplate.queryForObject("select * from user", new UserMapper());
	    model.addAttribute("list", list);
	    return "sample/index";
	}

}