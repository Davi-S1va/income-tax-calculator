package entities;

public class IndividualPeople extends Accont {


	
	private double HealthExpenses;
	

	
	public IndividualPeople() {
		super();
	}
	
	public IndividualPeople(String name, double anualIncome, double healthExpenses) {
		super(name, anualIncome);
		HealthExpenses = healthExpenses;
	}


	public double getHealthExpenses() {
		return HealthExpenses;
	}


	public void setHealthExpenses(double healthExpenses) {
		HealthExpenses = healthExpenses;
	}


	@Override
	public double totalValue() {
		if(getAnualIncome()>20000.00 || HealthExpenses>0) {

			return (getAnualIncome()*0.25)- (HealthExpenses*0.50);
		}
		
		if (getAnualIncome()<20000.00 || HealthExpenses>0) {
	
			return (getAnualIncome()*0.15)- (HealthExpenses*0.50);
		}
		
		if(getAnualIncome()>20000.00|| HealthExpenses==0) {

			return (getAnualIncome()*0.25);
		}
		if (getAnualIncome()<20000.00 || HealthExpenses==0) {
	
			return (getAnualIncome()*0.15);
		}
		
		return 0;
	}

	
	@Override
	public String AccontTag() {
		
		return "Dados do PF:\n Nome: "+getName()+"\n imposto a pagar: - $"+totalValue();
		
	}

	@Override
	public double value() {
        return totalValue();
	}
	
}

