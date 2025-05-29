package clase;


import exceptii.ExceptieCNPInexistent;
import exceptii.ExceptieCNPInvalid;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Persoana implements IPersoana{

	private String nume;
	public String CNP;
	
	public Persoana(){
		this.nume="Nume initial";
		this.CNP="1000000000001";
	}
	
	
	public Persoana(String nume, String CNP){
		this.nume=nume;
		this.CNP=CNP;
	}
	
	public String getSex(){
		if (this.CNP == null || this.CNP.equals("")) {
			throw new ExceptieCNPInexistent();
		}

		switch(CNP.charAt(0)){
			case '1': return "M";
			case '2': return "F";
			case '3': return "M";
			case '4': return "F";
			case '5': return "M";
			case '6': return "F";
			case '7': return "M";
			case '8': return "F";
			default: throw new ExceptieCNPInvalid();
		}
	}
	
	public int getVarsta(){
		if(this.CNP == null) {
			throw new ExceptieCNPInexistent();
		}

		try {
			int an=0;
			if(CNP.charAt(0)=='1'|| CNP.charAt(0)=='2')
				an=(1900 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2)));
			if(CNP.charAt(0)=='3'|| CNP.charAt(0)=='4')
				an=(1800 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2)));
			if(CNP.charAt(0)=='5'|| CNP.charAt(0)=='6')
				an=(2000 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2)));

			int luna= Integer.parseInt("" + CNP.charAt(3) + CNP.charAt(4));
			int zi= Integer.parseInt("" + CNP.charAt(5) + CNP.charAt(6));

			if(luna < 1 || luna > 12) {
				throw new ExceptieCNPInvalid();
			}

			if(zi < 1 || zi > 31) {
				throw new ExceptieCNPInvalid();
			}

			Calendar dataNasterii=Calendar.getInstance();
			dataNasterii.set(an, luna, zi);
			Calendar dataCurenta=Calendar.getInstance();
			long varsta_zile=TimeUnit.MILLISECONDS.toDays(Math.abs(dataCurenta.getTimeInMillis()-dataNasterii.getTimeInMillis()));
			return (int) (varsta_zile/365);
		} catch (Exception e) {
			throw new ExceptieCNPInvalid();
		}
	}
	
	public boolean checkCNP(){
		int s=0;	
		boolean rezultat = false;
		if(CNP.length()!=13)
			throw new IllegalArgumentException("CNP-ul nu are lungimea corecta");
		String number="279146358279";
		try{
			for(int i=0;i<12;i++){
				s+=Integer.parseInt(""+number.charAt(i))*Integer.parseInt(""+CNP.charAt(i));			
			}
			int cifra=s%11;
			if(cifra==10)
				cifra=1;
			rezultat=cifra==Integer.parseInt(""+CNP.charAt(12));
		}catch(Exception ert)
		{
			throw new IllegalArgumentException("CNP-ul contine caractere incorecte");
		}
		
		return rezultat;
	}
}