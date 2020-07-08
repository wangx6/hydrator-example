package cdc.hydrator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
@SpringBootApplication
public class HydratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(HydratorApplication.class, args);
	}

	@GetMapping("save")
	public String save() {
		return "this is working now...";
	}

}
