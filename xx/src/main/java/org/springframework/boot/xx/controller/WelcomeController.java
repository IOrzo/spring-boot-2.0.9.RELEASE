package org.springframework.boot.xx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xie yuan bing
 * @date 2020-11-11 15:12
 * @description
 */
@RestController
@RequestMapping("/welcome")
public class WelcomeController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello world!";
	}

}
