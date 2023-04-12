package Configuration_pizza;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import products.Pizza;

@Configuration
public class configuration_pizza {

	@Bean
	@Scope("prototype")
	public Pizza margherita() {
		return new Pizza("margherita", 5.80);
	}
	@Bean
	@Scope("prototype")
	public Pizza capricciosa() {
        return new Pizza("capricciosa", 7.80);
	}
	
	@Bean
	@Scope("prototype")
	public Pizza fourstagioni() {
		return new Pizza("4 stagioni", 10.50);
	}
	
	@Bean
	@Scope("prototype")
	public Pizza fruttiDiMare(){
		return new Pizza("frutti di mare",12.50);
	}
	
	
}
