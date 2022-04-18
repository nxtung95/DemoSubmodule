package com.example.module1;

import com.example.base.BaseController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Module1Controller {

	@GetMapping("/module1")
	public List<String> get() {
		return BaseController.test;
	}
}
