package lucyexercises.SpringUtilities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class SpringUtilitiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringUtilitiesApplication.class, args);
	}

	@GetMapping("/testRequestGet")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@PostMapping(path = "/testRequestPost", consumes = "application/json", produces = "application/json")
	public TestJsonResponse getTestRequest(@RequestBody TestJsonRequest request) {
		TestJsonResponse response = new TestJsonResponse(request.getMsg(),
				request.getSender(), request.getReceiveDate());
		return response;
	}
}
