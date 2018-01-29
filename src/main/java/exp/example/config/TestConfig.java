package exp.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//@Component
//@PropertySource("classpath:config.properties")
@Configuration
@PropertySource("classpath:config.properties")
@ConfigurationProperties(prefix = "test")
public class TestConfig {

	private String aaa;
	private String bbb;
	private String ccc;

	public String getAaa() {
		return aaa;
	}

	public String getBbb() {
		return bbb;
	}

	public String getCcc() {
		return ccc;
	}

	public void setAaa(String aaa) {
		this.aaa = aaa;
	}

	public void setBbb(String bbb) {
		this.bbb = bbb;
	}

	public void setCcc(String ccc) {
		this.ccc = ccc;
	}
}
