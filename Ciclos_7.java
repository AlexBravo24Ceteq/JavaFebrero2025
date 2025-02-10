package ciclos;

public class Ciclos_7 {

	public static void main(String[] args) {
		
		double total=700;
		double meses=0; 
		
		while(total<1500) {
			total= total*1.02;
			meses++;
		}
		
		System.out.println(meses);

		
	}

}
