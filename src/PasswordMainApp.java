import javax.swing.JOptionPane;

public class PasswordMainApp {
	public static void main (String[] args) {
		Password password;
		//Panel de control de opciones
		String[] opciones= {"Por defecto","Password aleatorio con longitud elegida"};
		String eleccion= (String) JOptionPane.showInputDialog(null,"Elige una opción","Personas",
				JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
		System.out.println(eleccion);
		//Llamar al constructo por defecto
		if(eleccion=="Por defecto") {
			password=new Password();
			System.out.println("Por defecto: " +password.toString());
			}
		//Llamar al constructo en el que introducimos el parametro de longitud
		if(eleccion=="Password aleatorio con longitud elegida") {
			String longitudString=JOptionPane.showInputDialog("Introduce el numero de caracteres que se generara para tu password");
			int longitud=Integer.parseInt(longitudString);
			password=new Password(longitud);
			System.out.println("Por defecto: " +password.toString());
			}
	}
}
