package com.example.base;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class BaseController {
	public static List<String> test;

	@PostConstruct
	public void init() {
		test = new ArrayList<>();
		test.add("a");
		test.add("b");
	}
}
