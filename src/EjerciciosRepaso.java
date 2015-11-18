import acm.program.*;

public class EjerciciosRepaso extends ConsoleProgram {

	public void run(){
		println("Ejercicio1 fiestaArdilla");
		println(fiestaArdillas(30,false));
		println(fiestaArdillas(50,false));
		println(fiestaArdillas(70,true));
		println("Ejercicio2 multa");
		println(multa(60,false));
		println(multa(65,false));
		println(multa(65,true));
		println(multa(66,true));
		println(multa(98,false));
		println("Ejercicio3 muyVanidoso");
		println(muyVanidoso(22));
		println(muyVanidoso(23));
		println(muyVanidoso(24));
		println(muyVanidoso(26));
		println(muyVanidoso(69));
		println(muyVanidoso(77));
		println("Ejercicio4 Contesta");
		println(contesta(false,false,false));
		println(contesta(false,false,true));
		println(contesta(true,false,false));
		println(contesta(false,true,false));
		println(contesta(true,true,false));
		println(contesta(true,true,true));
		println("Ejercicio5 menorPor10");
		println(menorPor10(1,7,11));
		println(menorPor10(1,7,10));
		println(menorPor10(11,1,7));
		println(menorPor10(101,7,111));
		println(menorPor10(110,7,11));
		println(menorPor10(1,77,171));
		println("Ejericico6 digitoIgual");
		println(digitoIgual(12,23));
		println(digitoIgual(12,34));
		println(digitoIgual(12,44));
		println(digitoIgual(12,22));
		println(digitoIgual(12,11));
		println("Ejercicio7 multiploMultiple");
		println(multiploMultiple(3));
		println(multiploMultiple(10));
		println(multiploMultiple(15));
		println(multiploMultiple(30));
		println(multiploMultiple(100));
		println(multiploMultiple(150));
		println(multiploMultiple(50));
		println("Ejercicio8 menos20");
		println(menos20(18));
		println(menos20(19));
		println(menos20(20));
		println(menos20(38));
		println(menos20(400));
		println("Ejercicio9 loteria");
		println(loteria(2,2,2));
		println(loteria(2,2,1));
		println(loteria(0,0,0));
		println(loteria(0,0,1));
		println(loteria(1,1,1));
		println("Ejercicio10 withoutDoubles");
		println(withoutDoubles(2,3,true));
		println(withoutDoubles(3,3,true));
		println(withoutDoubles(3,3,false));
		println(withoutDoubles(6,6,true));
		println(withoutDoubles(5,4,true));
		println(withoutDoubles(6,6,false));
		println(withoutDoubles(4,4,true));
		
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

	public boolean digitoIgual (int a, int b){
		if (a/10 == b/10 || a/10 == b%10 || a%10 == b/10 || a%10 == b%10){
			return true;
		}
		return false;
	}

	public boolean multiploMultiple (int a){
		if(a%5 == 0 && a%3 == 0){
			return false;
		}
		else if(a%3 == 0 || a%5 == 0){
			return true;
		}
		return true;
	}

	public boolean menos20 (int a){
		if(a%20 == 0){
			return false;
		}
		else if((a%20) - 20 != 1 || (a%20) - 20 != 2){
			return true;
		}
		return true;
	}
	
	public int loteria(int a, int b, int c){
		if(a==2 & b==2 & c==2){
			return 10;
		}
		else if(a==b & b==c & a==c){
			return 5;
		}
		return 0;
	}
	
	public int withoutDoubles (int a, int b, boolean booleano){
		if(a!=b && booleano==true){
			return a+b;
		}
		else if(a==b && booleano==true){
			return (a+b)+1;
		}
		else if(a==b && booleano==false){
			return a+b;
		}
		return 0;
	}



}
