package com.zgh.ribbon.Ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author FreeGuardian
 */
@RestController
public class HelloControler {

	@Autowired
	HelloService helloService;

	@RequestMapping(value = "/hiService")
	public String hiService(@RequestParam String name) {
		return helloService.hiService(name);
	}

}