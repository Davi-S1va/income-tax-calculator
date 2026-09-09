package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.*;
public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		List<Accont>list=new ArrayList<>();
		
		System.out.println("Insira a quanntidade de cadastro que deseja calcular:");
		int n= sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Conta #"+i);
			System.out.println("Conta Física ou Júritica?? (f/j)");
			char ch= sc.next().charAt(0);


			if(ch== 'f') {
				sc.nextLine();
				System.out.println("Nome: ");
				String name=sc.nextLine();
				System.out.println("Renda anual: ");
				double anualIncome= sc.nextDouble();
				System.out.println("Gastos com saúde: ");
				double healthExpenses=sc.nextDouble();
			
				Accont pf=new IndividualPeople(name, anualIncome, healthExpenses);
				list.add(pf);
		
				
			}
			
			if(ch== 'j') {
				sc.nextLine();
				System.out.println("Nome: ");
				String name=sc.nextLine();
				System.out.println("Renda anual: ");
				double anualIncome= sc.nextDouble();
				System.out.println("Quantidade de Fúncionarios: ");
				double numberEmployee=sc.nextDouble();
			
				Accont pj=new CompanyPeople(name, anualIncome, numberEmployee);
				list.add(pj);
			}	
		}
		
		int t=0;
		System.out.println("\nTaxas dos impostos:");
		
		for (Accont pe: list) {
			System.out.println(pe.AccontTag()+"\n");
			System.out.println("\nTOTAL:");
			t+=pe.value();
				
		}
		System.out.println("$"+t);
		sc.close();
	}

}
