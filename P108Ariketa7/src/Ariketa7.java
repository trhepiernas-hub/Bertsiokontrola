
public class Ariketa7 {

	public static void main(String[] args) {
		
		int Dirua = 779;
		int E500,E200,E100,E50,E20,E10,E5,E1;
		
		E500 = Dirua/500;
		E200 = (Dirua%500)/200;
		E100 = (Dirua%200)/100;
		E50 = (Dirua%100)/50;
		E20 = (Dirua%50)/20;
		E10 = (Dirua%20)/10;
		E5 = (Dirua%10)/5;
		E1 = (Dirua%5)/1;
		
		System.out.println("Diru kopurua " + Dirua + " Euro");
		System.out.println("500€eko bilete " + E500);
		System.out.println("200€eko bilete " + E200);
		System.out.println("100€eko bilete " + E100);
		System.out.println("50€eko bilete " + E50);
		System.out.println("20€eko bilete " + E20);
		System.out.println("10€eko bilete " + E10);
		System.out.println("5€eko bilete " + E5);
		System.out.println(E1 + " Euro soberan");
	}
}
