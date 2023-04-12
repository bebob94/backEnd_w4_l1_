package products;

public class Bevanda extends products {

	 private String nutritional_info;
	 
	  public Bevanda() {
	        super();
	        super.setName("Margherita");
	        super.setPrice(5d);
	        this.nutritional_info ="700Kcal";
	       
	    }

	    public Bevanda(String name, double price) {
	        switch(name) {
	        case "acqua":
	            super.setName(name);
	            super.setPrice(price);
	            this.nutritional_info ="10Kcal";
	        
	            break;
	        case "vino":
	            super.setName(name);
	            super.setPrice(price);
	            this.nutritional_info ="380Kcal";
	     
	            break;
	        case "birra":
	            super.setName(name);
	            super.setPrice(price);
	            this.nutritional_info ="350Kcal";

	            break;
	        }
	    }

	    @Override
		public String toString() {
			return "Name: " + getName()
					+ ", Price: " + getPrice() + "€";
		}
}
