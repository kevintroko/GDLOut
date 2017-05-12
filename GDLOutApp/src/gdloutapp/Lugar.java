
public class Lugar {
	//variables lugar
	private String name;
	private String domicilio;
	private String horario;
	private double rating;
	
	//variables para grafo
	private int category;
	private int price;
	private int city;

	public Lugar(String name){
		this.name = name;
		this.category = 0;
		this.price = 0;
		this.city = 0;
		
	}
	public Lugar(String name, int category, int price, int municipio){
		this.name = name;
		this.category = category;
		this.price = price;
		this.city = municipio;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}
	
	public String toString(){
		return (this.name + "\n" + this.category+"\n" + this.price + "\n" + this.city + "\n");
	}
}

