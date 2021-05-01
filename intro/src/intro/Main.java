package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButon = "internet þubeye git";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = true;
		
		System.out.println(internetSubeButon);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düþtü resmi");
		}else if (dolarBugun>dolarDun) {
			System.out.println("Dolar yükseldi resmi");
		}
		else {
			System.out.println("Dolar eþittir resmi");
		}
		
		String kredi1 = "Hýzlý kredi";
		String kredi2 = "Mutlu emekli kredisi";
		String kredi3 = "Konut kredisi";
		String kredi4 = "Çiftçi kredi";
		String kredi5 = "Msb kredi";
		
		System.out.println(kredi1);
		
		String[] krediler = {
				"Hýzlý kredi",
				"Mutlu emekli kredi",
				"Konut kredi",
				"Çiftçi kredi",
				"Msb kredi"};
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
	}
		
}
