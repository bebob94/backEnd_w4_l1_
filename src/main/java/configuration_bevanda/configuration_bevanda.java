package configuration_bevanda;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import products.Bevanda;
import products.Pizza;

public class configuration_bevanda {

	

	@Bean
	@Scope("prototype")
	public Bevanda acqua() {
        return new Bevanda("acqua", 1.50);
	}
	
	@Bean
	@Scope("prototype")
	public Bevanda vino() {
		return new Bevanda("vino", 10.50);
	}
	
	@Bean
	@Scope("prototype")
	public Bevanda birra(){
		return new Bevanda("birra",2.50);
	}
}
