import java.util.Scanner;

public class PoleChudes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("введите загаданное слово");
		String slovo = sc.next();
		slovo = slovo.toLowerCase();
		int dlina = slovo.length();
		String zagadka = "";
		for (int a = 0; a < dlina; a++) {
			zagadka = zagadka + "X";
		}
		System.out.println("загаданное слово " + zagadka);
				
		while(!(zagadka.equals(slovo))) {
	
			System.out.println("введите букву");
			
	
			
			String bukva = sc.next();
			bukva = bukva.toLowerCase();
		
			
			for (int i=0;i<dlina;i++){
				if (slovo.substring(i,i+1).equals(bukva)) {
					zagadka=zagadka.substring(0,i)+bukva+zagadka.substring(i+1, dlina);
					System.out.println(zagadka);
					
				} 
			}
		}
		System.out.println("Поздравляем! Вы отгадали слово!");

	}
}