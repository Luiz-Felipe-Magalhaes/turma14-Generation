package Exemplos;

import java.util.Calendar;

public class testadata 
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DATE)-7;
		int month = cal.get(Calendar.MONTH) + 1;
		int year = cal.get(Calendar.YEAR);
		
		int dia=17, mes=12, ano=1994;
		
		int idade = (dia-day)+((mes-month)*30)+((ano-year)*365)*-1;
		
		System.out.println(idade);
		
		
		System.out.printf("Data: %d / %d / %d",day,month,year);
	}
}
