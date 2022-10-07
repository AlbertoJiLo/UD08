import javax.swing.JOptionPane;

public class PersonaMainApp {
	

	public static void main (String[] args) {
			Persona persona;
			String[] opciones= {"Crear persona solo con DNI","Crear persona con nombre, edad, dni y sexo",
					"Crear persona con todos los atributos"};
			String eleccion= (String) JOptionPane.showInputDialog(null,"Elige una opción","Personas",
					JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
			System.out.println(eleccion);
			//Añadir únicamente DNI de una persona.
			if(eleccion=="Crear persona solo con DNI") {
				persona=new Persona("48054287V");
				System.out.println("Por defecto: " +persona.toString());
				}
			//Creamos una persona usando el segundo constructo, con el DNI erróneo para entrar en validacion
			if(eleccion=="Crear persona con nombre, edad, dni y sexo") {
				persona=new Persona("Alberto",32,"4854128V",'H');
				System.out.println("Nombre, edad, dni y sexo: "+persona.toString());
			}
			//Creamos una persona con todos los atributos introducidos, con la edad errónea para entrar en validación
			if(eleccion=="Crear persona con todos los atributos") {
				persona=new Persona("Alberto",-1,"48541285V",'H',91,1.89);
				System.out.println("Nombre, edad, dni, sexo, peso y altura: "+persona.toString());
			}
	}
}

		



