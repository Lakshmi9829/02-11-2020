class RoadTax{
	public static void main(String args[])
	{
		int vehiclePrice=500000;
		String state="MH";
		switch(state)
		{
			case "KA": 
				  float roadTaxKA=0.18f;
				  float finalTaxKA=vehiclePrice*roadTaxKA;
				  System.out.println("The tax to be paid  from KA is:" +finalTaxKA);
				  break;
			case "AP": 
				  float roadTaxPB=0.20f;
				  float finalTaxPB=vehiclePrice*roadTaxPB;
				  System.out.println("The tax to be paid is from PB is:" + finalTaxPB);
				  break;
			case "TM": 
				  float roadTaxTS=0.19f;
				  float finalTaxTS=vehiclePrice*roadTaxTS;
			          	  System.out.println("The tax to be paid is from TS is:" + finalTaxTS);
				  break;
			case "MH": 
				  float roadTaxAP=0.22f;
				  float finalTaxAP=vehiclePrice*roadTaxAP;
				  System.out.println("The tax to be paid is from AP is:" + finalTaxAP);
				  break;
			case "DL":    
				  float roadTaxKL=0.21f;
				  float finalTaxKL=vehiclePrice*roadTaxKL;
				  System.out.println("The tax to be paid is from KL is:" + finalTaxKL);
				  break;
			case "KL": 
				  float roadTaxTN=0.15f;
				  float finalTaxTN=vehiclePrice*roadTaxTN;
				  System.out.println("The tax to be paid is from TN is:" + finalTaxTN);
				  break;
			default : System.out.println("Select from KA,PB,TS,AP,KL,TN");
		}
	}
}