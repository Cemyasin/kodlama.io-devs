package kodlama.io.devs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
 @EnableAutoConfiguration
public class DevsApplication {

   public static void main(String[] args) {
	   SpringApplication.run(DevsApplication.class, args);
	
}

}
