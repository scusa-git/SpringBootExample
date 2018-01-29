package exp.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConfigMain {

	@Autowired
	private TestConfig testConfig;
	
	
}
