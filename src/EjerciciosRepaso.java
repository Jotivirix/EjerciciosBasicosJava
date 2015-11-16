import acm.program.*;

public class EjerciciosRepaso extends ConsoleProgram {

	public void run(){
		println("Ejercicio fiestaArdilla");
		println(fiestaArdillas(30,false));
		println(fiestaArdillas(50,false));
		println(fiestaArdillas(70,true));
		println("Ejercicio multa");
		println(multa(60,false));
		println(multa(65,false));
		println(multa(65,true));
		println(multa(66,true));
		println(multa(98,false));
		println("Ejercicio muyVanidoso");
		println(muyVanidoso(22));
		println(muyVanidoso(23));
		println(muyVanidoso(24));
		println(muyVanidoso(26));
		println(muyVanidoso(69));
		println("Ejercicio Contesta");
		println(contesta(false,false,false));
		println(contesta(false,false,true));
		println(contesta(true,false,false));
		println(contesta(false,true,false));
		println(contesta(true,true,false));
		println(contesta(true,true,true));
		println("Ejercicio menorPor10");
		println(menorPor10(1,7,11));
		println(menorPor10(1,7,10));
		println(menorPor10(11,1,7));
		println(menorPor10(101,7,111));
		println(menorPor10(110,7,11));
		println(menorPor10(1,77,171));
		
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
	
	public boolean contesta (boolean matinal, boolean madre, boolean dormido){
		if(dormido){
			return false;
		}
		else if(matinal && !madre && !dormido){
			return false;
		}
		else if(!matinal && !madre && dormido){
			return false;
		}
		return true;
	}
	
	public boolean menorPor10 (int a, int b, int c){
		if (a-b==10 || a-c==10){
			return true;
		}
		else if (b-a ==10 || b-c==10){
			return true;
		}
		else if (c-b ==10 || c-a==10){
			return true;
		}
		return false;
	}
	
	/*public boolean digitoIgual (int a, int b){
		if (a/b == )
	}*/
}
