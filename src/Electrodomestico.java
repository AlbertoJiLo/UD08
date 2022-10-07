import javax.swing.JOptionPane;
import javax.swing.Spring;


public class Electrodomestico {

	private double precioBase=100;
	private String color="blanco";
	private char consumoEnergetico='F';
	private double peso=5;
	
	//Constructor por defecto.
	public Electrodomestico() {
	}
	
	//Constructor con precio y peso.
	
	public Electrodomestico(double precioBase,double peso) {
		this.precioBase=comprobarPrecio(precioBase);
		this.peso=comprobarPeso(peso);
		
	}
	//Constructor con todos los atributos.
	public Electrodomestico(double precioBase,String color, char consumoEnergetico,double peso) {
		this.precioBase=comprobarPrecio(precioBase);
		this.color=comprobarColor(color);
		this.consumoEnergetico=comprobarConsumo(consumoEnergetico);
		this.peso=comprobarPeso(peso);		
	}
	//Validación de precio
	public double comprobarPrecio(double precioBase) {
		double precioFinal = 0;
		boolean check=true;
			while(check) {
					if(precioBase<0) {
						String precioBaseString=JOptionPane.showInputDialog(precioBase+" es un precio invalido. Introduce uno mayor a 0");
						precioBase=Double.parseDouble(precioBaseString);
					}else {
						check=false;
						precioFinal=precioBase;
					}
			}
		return precioFinal;
	}
	
	//Validación de peso
	public double comprobarPeso(double peso) {
		double pesoFinal = 0;
		boolean check=true;
			while(check) {
					if(peso<0) {
						String pesoString=JOptionPane.showInputDialog(peso+" es un peso invalido. Introduce uno mayor a 0");
						peso=Double.parseDouble(pesoString);
					}else {
						check=false;
						pesoFinal=peso;
					}
			}
		return pesoFinal;
	}
	
	//Validacion de consumo energético.
	
	public char comprobarConsumo(char consumoEnergetico) {
		boolean check=true;
		String posiblesCaracteres="ABCDEF";
		int i=0;

		consumoEnergetico = Character.toUpperCase(consumoEnergetico);
			while(check) {
				i=0;
				//Entramos en un while con las posibilidades de la A a la F para recorrer las opciones 
				//y controlaremos que la letra introducida se ponga en mayus automáticamente y que coincida
					while(i<6) {
						if(consumoEnergetico!=posiblesCaracteres.charAt(i)) {
						}else {
						return consumoEnergetico;
						}
						i++;
					}
					String consumoString=JOptionPane.showInputDialog(consumoEnergetico+" es una letra invalida. Introduce A,B,C,D,E,F");
					consumoEnergetico=consumoString.charAt(0);
					consumoEnergetico=Character.toUpperCase(consumoEnergetico);

				}
	
		return consumoEnergetico;
}
	//Validacion de color.
	public String comprobarColor(String color) {
		int i=0;
		String colorString;
		boolean check=true;
		color=color.toLowerCase();
		while(check) {
			i=0;
		//Recorremos el enum mientras cambios sus valores a una String del mismo nombre
			while(i<6) {
				colorString=Color.values()[i].name();
				if(color.equals(colorString)) {
					return color;
				}else {
					
				}
			i++;
			}
			String colorTemp=JOptionPane.showInputDialog(color+" es un color invalido. Escribe"
					+ " blanco,negro,azul,verde,amarillo o rojo" );
			colorTemp=colorTemp.toLowerCase();
			color=colorTemp;
		}
		return color;
	}
	
	//Método para devolver al main el listado de atributos introducidos.
	public String toString() {
        String mensaje = "Precio base: "+this.precioBase+"\nColor: "+this.color+"\nConsumo energetico: "+this.consumoEnergetico+
        		"\nPeso: "+this.peso;
        return mensaje;
    }	
}
