import Modelo.Servicio.Prestamo2;

import java.util.Vector;

public class Lector2 extends Usuario2 {
	private String _direccion;
	private boolean _estado;
	private int _tiempoPenalizacion;
	public Vector<Reserva2> _reserva2s = new Vector<Reserva2>();
	public Vector<Prestamo2> _prestamo2s = new Vector<Prestamo2>();
	public Vector<Favorito> _favoritos = new Vector<Favorito>();
}