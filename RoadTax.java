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
				  float roadTaxAP=0.20f;
				  float finalTaxAP=vehiclePrice*roadTaxAP;
				  System.out.println("The tax to be paid  from AP is:" + finalTaxAP);
				  break;
			case "TM": 
				  float roadTaxTM=0.19f;
				  float finalTaxTM=vehiclePrice*roadTaxTM;
			          System.out.println("The tax to be paid  from TM is:" + finalTaxTM);
				  break;
			case "MH": 
				  float roadTaxMH=0.22f;
			          float finalTaxMH=vehiclePrice*roadTaxMH;
				  System.out.println("The tax to be paid  from Mh is:" + finalTaxMH);
				  break;
			case "DL":    
				  float roadTaxDL=0.21f;
				  float finalTaxDL=vehiclePrice*roadTaxDL;
				  System.out.println("The tax to be paid  from DL is:" + finalTaxDL);
				  break;
			case "KL": 
				  float roadTaxKL=0.15f;
				  float finalTaxKL=vehiclePrice*roadTaxKL;
				  System.out.println("The tax to be paid  from KL is:" + finalTaxKL);
				  break;
			default : System.out.println("Select from KA,AP,TM,MH,DL,KL");
		}
	}
}