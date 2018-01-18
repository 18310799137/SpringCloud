package com.zgh.feign.Feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author FreeGuardian
 */
@FeignClient(value = "service-provider")
public interface SchedualService {
	@RequestMapping(value = "/myService", method = RequestMethod.GET)
	String feignService(@RequestParam(value = "name") String name);
}
