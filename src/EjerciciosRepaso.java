import acm.program.*;

public class EjerciciosRepaso extends ConsoleProgram {

	public void run(){
		println(fiestaArdillas(30,false));
		println(fiestaArdillas(50,false));
		println(fiestaArdillas(70,true));
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
}
