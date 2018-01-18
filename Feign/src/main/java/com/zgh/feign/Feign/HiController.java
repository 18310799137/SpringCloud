package com.zgh.feign.Feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

	@Autowired
	SchedualService schedualService;

	@RequestMapping(value = "/feignService", method = RequestMethod.GET)
	public String feignService(@RequestParam String name) {
		return schedualService.feignService(name);
	}
}
