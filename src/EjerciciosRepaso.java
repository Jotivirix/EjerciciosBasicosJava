import acm.program.*;

public class EjerciciosRepaso extends ConsoleProgram {

	public void run(){
		println(fiestaArdillas(30,false));
		println(fiestaArdillas(50,false));
		println(fiestaArdillas(70,true));
		println(multa(60,false));
		println(multa(65,false));
		println(multa(65,true));
		println(multa(66,true));
		println(multa(98,false));
		println(muyVanidoso(22));
		println(muyVanidoso(23));
		println(muyVanidoso(24));
		println(muyVanidoso(26));
		println(muyVanidoso(69));
	}

	public boolean fiestaArdillas(int numeroBellotas, boolean festivo){
//		if(festivo){
//			return true;
//		}
//		else if (numeroBellotas >= 40 && numeroBellotas <= 60){
//			return true;
//		}
//		return false;
		if(numeroBellotas >= 40 && numeroBellotas <= 60 || festivo){
			return true;
		}
		return false;
	}
	
	public int multa (int velocidad, boolean cumple){
		if(cumple){
			velocidad = velocidad-5;
		}
		if(velocidad <=60){
			return 0;
		}
		else if (velocidad >60 && velocidad <=80){
			return 1;
		}
		return 2;
	}
	
	public boolean muyVanidoso (int numero){
		if(numero%11==0){
			return true;
		}
		else if(numero%11==1){
			return true;
		}
		return false;
		
		
	}
}
