package entities;

public abstract class Accont{
	
	private String name;
	private double anualIncome;


	
	public Accont(){
	}
	
	public Accont(String name, double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(double anualIncome) {
		this.anualIncome = anualIncome;
	}


	public abstract String AccontTag();
	
	public abstract double totalValue();
	
	public abstract double value();
}
