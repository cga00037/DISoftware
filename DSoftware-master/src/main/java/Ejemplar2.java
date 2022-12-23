import Modelo.Servicio.Prestamo2;

import java.util.Date;
import java.util.Vector;

public class Ejemplar2 {
	private String _idInventario;
	private Date _fechaCompra;
	private boolean _estado;
	private Integer _idEjemplar;
	public Libro2 _tiene;
	public Vector<Reserva2> _reserva2s = new Vector<Reserva2>();
	public Vector<Prestamo2> _prestamo2s = new Vector<Prestamo2>();

	public void getEjemplar() {
		throw new UnsupportedOperationException();
	}
}