

public class SerieMainApp {
	public static void main (String[]args) {
		//Creamos un array con tres de series.
		Serie serie[]= new Serie[3];  
		//Creamos series con distintos constructos.
		serie[0]=new Serie("Breaking bad",5,"Drama","Vince GIlligan");
		serie[1]=new Serie("The witcher","Stephen Surjik");
		serie[2]=new Serie();
		
		//Las listamos
			for(int i=0;i<3;i++) {
			System.out.println(serie[i].toString());
			}
	}
}
