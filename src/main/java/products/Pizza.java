package products;

public class Pizza extends products {
	
	
	 private String nutritional_info;
	    private Size size;

	    public Pizza() {
	        super();
	        super.setName("Margherita");
	        super.setPrice(5d);
	        this.nutritional_info ="700Kcal";
	        this.size = Size.Normal;
	    }

	    public Pizza(String name, double price) {
	        switch(name) {
	        case "margherita":
	        	super.setName(name);
	        	super.setPrice(price);
	        	this.nutritional_info ="500Kcal";
	        	this.size = Size.Normal;
	        	break;
	        case "capricciosa":
	            super.setName(name);
	            super.setPrice(price);
	            this.nutritional_info ="1000Kcal";
	            this.size = Size.Normal;
	            break;
	        case "4 stagioni":
	            super.setName(name);
	            super.setPrice(price);
	            this.nutritional_info ="1200Kcal";
	            this.size = Size.Normal;
	            break;
	        case "frutti di mare":
	            super.setName(name);
	            super.setPrice(price);
	            this.nutritional_info ="1350Kcal";
	            this.size = Size.Normal;
	            break;
	        }
	    }

		@Override
		public String toString() {
			return "Name: " + getName()
					+ ", Price: " + getPrice() + "€";
		}

		

}
