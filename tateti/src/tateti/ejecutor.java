package tateti;

import java.util.Scanner;

public class ejecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tablero tablero1= new Tablero();
		
		Scanner objScanner = new Scanner(System.in);
		
		int x; int y;
		
		while(true) {
			
			System.out.println("Ingresar columna de X");
			
			x=objScanner.nextInt();
			
			System.out.println("Ingresar fila de X");
			
			y=objScanner.nextInt();
			
			tablero1.cambiarCasilla(x, y, 'X');
			
			if (tablero1.estaResuelto()) {
				System.out.println("El jugador de las X ganó");
				break;
			}
			
			System.out.println("Ingresar columna de O");
			
			x=objScanner.nextInt();
			
			System.out.println("Ingresar fila de O");
			
			y=objScanner.nextInt();
			
			tablero1.cambiarCasilla(x, y, 'O');
			
			if (tablero1.estaResuelto()) {
				System.out.println("El jugador de las O ganó");
				break;
			}
			
			
			System.out.println(tablero1.toString());
		}
		
		System.out.println(tablero1.toString());
		
	}

}
