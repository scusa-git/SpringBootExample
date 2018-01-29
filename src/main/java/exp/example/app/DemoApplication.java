package exp.example.app;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import exp.example.config.TestConfig;

//@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackageClasses=TestConfig.class)
public class DemoApplication {
	
	@Autowired
	private TestConfig testConfig;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@PostConstruct
	private void init() {
		System.out.println("aaa:"+testConfig.getAaa());
		System.out.println("bbb:"+testConfig.getBbb());
		System.out.println("ccc:"+testConfig.getCcc());
	}
}
