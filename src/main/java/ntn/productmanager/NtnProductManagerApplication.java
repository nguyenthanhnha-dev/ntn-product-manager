package ntn.productmanager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
public class NtnProductManagerApplication {
	
	private static Logger logger = LoggerFactory.getLogger(NtnProductManagerApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(NtnProductManagerApplication.class, args);
		logger.info("Connected to Postgresql: {}", ctx.getEnvironment().getProperty("spring.r2dbc.url"));
	}

}
