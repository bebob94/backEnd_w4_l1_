package products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public abstract class products {
	
	private String name;
	private Double price;
	private Pizza pizza;
	private Bevanda bevanda;
	private Altro altro;
	
	
	

}
