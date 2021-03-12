package com.rest.microservicea;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

	//private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/callMicroserviceA")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "Response From MicroserviceA") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(name));
	}
	
	@GetMapping("/BcallsMicroserviceA")
	public Greeting greetingBA(@RequestParam(value = "name", defaultValue = "Request Received from MicroserviceB and Response Sent From MicroserviceA") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(name));
	}
}
