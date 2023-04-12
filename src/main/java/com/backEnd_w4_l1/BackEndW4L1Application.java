package com.backEnd_w4_l1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Configuration_pizza.configuration_pizza;
import configuration_bevanda.configuration_bevanda;
import products.Bevanda;
import products.Pizza;

@SpringBootApplication
public class BackEndW4L1Application {

	public static void main(String[] args) {
		SpringApplication.run(BackEndW4L1Application.class, args);
		//menù
		System.out.println("\n*****menù pizze:*****");
		menuPizza("margherita");
		menuPizza("capricciosa");
		menuPizza("fourstagioni");
		menuPizza("fruttiDiMare");
		
		System.out.println("\n*****menù bevande:*****");
		menuBevanda("acqua");
		menuBevanda("birra");
		menuBevanda("vino");
		
		
		System.out.println("\n*****menù gadget:*****");
		
		//ordini
		System.out.println("\ngli ordini del cliente sono i seguenti: \n");
		menuPizza("fruttiDiMare");
		menuBevanda("birra");
		menuBevanda("birra");
		menuBevanda("acqua");
		menuBevanda("vino");
	}

	
	public static Pizza menuPizza(String name) {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(configuration_pizza.class);
        Pizza p1 = (Pizza) appContext.getBean(name);
        System.out.println(p1.toString());
        appContext.close();
        return p1;
    }
	
	public static Bevanda menuBevanda(String name) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(configuration_bevanda.class);
		Bevanda b1 = (Bevanda) appContext.getBean(name);
		System.out.println(b1.toString());
		appContext.close();
		return b1;
	}
}
