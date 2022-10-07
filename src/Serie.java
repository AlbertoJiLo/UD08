
public class Serie {
	private String titulo;
	private int numeroTemporadas=3;
	private boolean entregado=false;
	private String genero;
	private String creador;
	
	//Constructo por defecto.
	public Serie() {
	}
	//Constructo con titulo y creador
	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;
	}
	//Constructo con todos los atributos menos entregado
	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.genero = genero;
		this.creador = creador;
	}
	@Override
	public String toString() {
		String mensaje="La serie "+titulo+" tiene "+numeroTemporadas+" temporadas, es de genero "+genero+" y su creador es "+creador;
		return mensaje;
	}
	
}
