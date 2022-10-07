import javax.swing.JOptionPane;

public class ElectrodomesticoMainApp {
	public static void main (String[] args) {
		Electrodomestico electrodomestico;
		//Panel de control de opciones
		String[] opciones= {"Por defecto","Precio y peso del electrodomestico","Todos los atributos"};
		String eleccion= (String) JOptionPane.showInputDialog(null,"Elige una opción","Personas",
				JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
		System.out.println(eleccion);
		//Llamar al constructo por defecto
		if(eleccion=="Por defecto") {
			electrodomestico=new Electrodomestico();
			System.out.println("Por defecto: " +electrodomestico.toString());
			}
		//Llamar al segundo constructo con los dos valores siendo erroneos para probar la validacion
		if(eleccion=="Precio y peso del electrodomestico") {
			electrodomestico=new Electrodomestico(-2,-25);
			System.out.println("Con precio base y peso: " +electrodomestico.toString());
			}
		//Llamar el constructo total con todos los valores mal para controlar que funciona la validacion
		if(eleccion=="Todos los atributos") {
			electrodomestico=new Electrodomestico(-2,"papagayo",'k',-4);
			System.out.println("Con precio base y peso: " +electrodomestico.toString());
			}
		
	}
}
