import javax.swing.JOptionPane;

public class Persona {

		private String nombre;
		private int edad;
		private String dni;
		private char sexo='H';
		private double peso;
		private double altura;
		
		
		//Constructor por defecto. Con el DNI por ser obligatorio.
		public Persona(String dni) {
			

			this.dni=introducirDNI(dni);

			
		}
		
		//Constructor con el nombre edad y sexo como parámetro. El DNI también ya que siempre habrá que introducirlo.
		public Persona(String nombre,int edad,String dni,char sexo) {
			this.nombre=nombre;
			this.edad=comprobarEdad(edad);
			this.dni=introducirDNI(dni);
			this.sexo=sexo;
			this.peso=0;
			this.altura=0;
			
		}
		//Constructor con todos los atributos como parámetro
		public Persona(String nombre,int edad,String dni,char sexo,double peso, double altura) {
			this.nombre=nombre;
			this.edad=comprobarEdad(edad);
			this.dni=introducirDNI(dni);
			this.sexo=sexo;
			this.peso=peso;
			this.altura=altura;
			
		}
		//Método para introducir y comprobar que el DNI es válido, reintentar si no es así y obtenerlo.
		public String introducirDNI (String dniIntroducido) {
			boolean check=false;
			while(!check) {
				char letraDni=dniIntroducido.charAt(dniIntroducido.length()-1);
				if(dniIntroducido.length()!=9) {
					
					dniIntroducido=JOptionPane.showInputDialog("El DNI ha de contener 9 caracteres,vuelve a introducirlo");					
				
				}else if(Character.isDigit(letraDni)) {
					dniIntroducido=JOptionPane.showInputDialog("El DNI ha de acabar en una letra,vuelve a introducirlo");
				}else
				check=true;
			}
			
		dni=dniIntroducido;
		return dni;
		}
		//Método para comprobar que la edad es mayor que 0.
		public int comprobarEdad(int edadIntroducida) {
			String edadString;
			boolean check=false;
			while(!check) {
				if(edadIntroducida<0) {
					edadString=JOptionPane.showInputDialog("La edad no fue valida, prueba con otra");
					edadIntroducida = Integer.parseInt(edadString);
				}
				else{
					check=true;			
				}
			}
			return edadIntroducida;
		}
		
		//Método para devolver al main el listado de atributos introducidos.
		public String toString() {
		        String mensaje = "Nombre: "+this.nombre+"\nEdad: "+this.edad+"\nDNI: "+this.dni+"\nSexo: "+this.sexo+"\nPeso: "+this.peso+"\nAltura: "+this.altura+"\n";
		        return mensaje;
		}
}
