package tateti;

public class Tablero {

	char[][] tablero = {{'-','-','-'},{'-','-','-'},{'-','-','-'}};

	public Tablero() {
		super();
	}
	
	public void cambiarCasilla(int x,int y, char value) {
		
		this.tablero[y][x] = value;
		
	}
	
	public String toString() {
		String tableroString = "";
		for(char element[] : tablero){
			for(char element2 : element){
				tableroString = tableroString + element2 + " ";
			}
			tableroString = tableroString + "\n";
		}
		return tableroString;
	}
	
	public boolean estaResuelto() {
		
		return false;
	}

	public char[][] getTablero() {
		return tablero;
	}

	public void setTablero(char[][] tablero) {
		this.tablero = tablero;
	}
	
	
	
}
