import java.util.Random;
import javax.swing.JOptionPane;

public class Password {

	private int longitud=8;
	private String contraseña;
	
	//Constructor por defecto.
	public Password() {
	}
	
	//Contructor con longitud personalizada y contraseña aleatoria.
	public Password(int longitudIntroducida) {
		this.longitud=passCheck(longitudIntroducida);
		this.contraseña=generarContraseña(longitud);
	}
	
	
	//Controlaremos que el password tenga un mínimo de 8 caracteres y un máximo de 24.
	public int passCheck(int longitudIntroducida) {
		boolean check=true;
		int longitudFinal = 0;
		while(check) {
			if(longitudIntroducida<8 || longitudIntroducida>24) {
				String longitudFallida=JOptionPane.showInputDialog(longitudIntroducida+" es una longitud incorrecta. Por favor escribe un numero entre 8 y 24");
				longitudIntroducida=Integer.parseInt(longitudFallida);
			}else{
			check=false;
			longitudFinal=longitudIntroducida;
			}
		}
		return longitudFinal;
	}
	
	public String generarContraseña(int longitud) {
		int i=0;
		String contraseñaFinal="";
		char siguienteCaracter;
		String posiblesCaracteres="abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ12345678910";
			while(i<longitud) {
				//Randomizamos entre 0 y 64 para agarrar caracteres de la string de arriba
				Random r = new Random();
				int ran = r.nextInt(64);
				siguienteCaracter=posiblesCaracteres.charAt(ran);
				contraseñaFinal=contraseñaFinal+siguienteCaracter;
				i++;
			}	
		return contraseñaFinal;
	}
	//Método para devolver al main el listado de atributos introducidos.
	public String toString() {
        String mensaje = "Longitud: "+this.longitud+"\nContraseña: "+this.contraseña+"\n";
        return mensaje;
    }	
	
	
}
