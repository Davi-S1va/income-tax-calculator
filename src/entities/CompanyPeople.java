package entities;

public class CompanyPeople extends Accont{

	
	private double NumberEmployee ;
	
	public CompanyPeople() {
		super();
	}

	public CompanyPeople(String name, double anualIncome, double numberEmployee) {
		super(name, anualIncome);
		NumberEmployee = numberEmployee;
	}

	@Override
	public double totalValue() {
		if (NumberEmployee>10) {
			return (getAnualIncome()*0.14);
		}
		
		if (NumberEmployee<10) {
			return (getAnualIncome()*0.16);
		}
		
		return 0;
	}
	
	
	
	@Override
	public String AccontTag() {
		
		return "Dados do PJ:\n Nome: "+getName()+"\n imposto a pagar: - $"+totalValue();

	}

	@Override
	public double value() {
		return totalValue();
	}


}
