package swimtracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@SpringBootApplication
public class SwimTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwimTrackerApplication.class, args);
	}

	@RequestMapping("/")
  	public String greeting(){
    		return "Penis!";
  	}

}
