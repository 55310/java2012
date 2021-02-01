package com.example.springboot.Lesson202;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//step 2. web applicahtion을 만든다

@RestController //HelloController class가 @RestController로 플래그가 지정되어 
				//SpringMVC에서 웹 요청을 처리할 준비가 되었음을 의미
public class HelloController {
	@RequestMapping("/") // @RequestMapping 이 하는일  : '/'를 index() 메서드에 매핑한다. 
					     //
	public String index() {
		return "Hi, Nice to meet u. from spring boot...";
	}
}
