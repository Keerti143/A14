package com.cec.a14;

public class TaxCalculation {

	public void calculateTax(Persone persone) {
		if(persone.getAge()>65) {
			persone.setTax(0);
			System.out.println("tax not applicable");
		}else {
			if(persone.getIncome()<-160000) {
				persone.setTax(0);
			}else if(persone.getIncome()>160000 ) {
				persone.setTax((persone.getIncome()-160000)*10/100);
			}else if(persone.getIncome()>=500000 ) {
				persone.setTax((persone.getIncome()-500000)*20/100);
			}else {
				persone.setTax((persone.getIncome()-800000)*30/100);
			}
		}
		
		
	}
}
