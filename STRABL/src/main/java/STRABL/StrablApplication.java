package STRABL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.STRABLAPP")
public class StrablApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrablApplication.class, args);
	}

}
