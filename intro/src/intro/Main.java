package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButon = "internet �ubeye git";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = true;
		
		System.out.println(internetSubeButon);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar d��t� resmi");
		}else if (dolarBugun>dolarDun) {
			System.out.println("Dolar y�kseldi resmi");
		}
		else {
			System.out.println("Dolar e�ittir resmi");
		}
		
		String kredi1 = "H�zl� kredi";
		String kredi2 = "Mutlu emekli kredisi";
		String kredi3 = "Konut kredisi";
		String kredi4 = "�ift�i kredi";
		String kredi5 = "Msb kredi";
		
		System.out.println(kredi1);
		
		String[] krediler = {
				"H�zl� kredi",
				"Mutlu emekli kredi",
				"Konut kredi",
				"�ift�i kredi",
				"Msb kredi"};
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
	}
		
}
