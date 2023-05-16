package com.feign.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="PRODUCER-EMP")
public interface EmpFeignClientI {
	
	@GetMapping("/printportDetail")
	public String printPortDetail();
}
