import Modelo.Material.Ejemplar2;

import java.util.Date;

public class Prestamo2 {
	private int _iD;
	private String _fecha;
	private String _fechaTope;
	private String _fechaDev;
	public Biblioteca2 _tramita;
	public Lector2 _lector2;
	public Ejemplar2 _ejemplar2;

	public Prestamo2(int _iD, String _fecha, String _fechaTope, Ejemplar2 _ejemplar2) {
		this._iD = _iD;
		this._fecha = _fecha;
		this._fechaTope = _fechaTope;
		this._fechaDev = _fecha;
		this._ejemplar2 = _ejemplar2;
	}

	public void actualizarPrestamo(String fechaDev, Ejemplar2 _ejemplar2) {
		this._fechaDev = fechaDev;
		this._ejemplar2 = _ejemplar2;
	}

	public void seleccionarPrestamos() {
		throw new UnsupportedOperationException();
	}

	public void seleccionarFecha() {
		throw new UnsupportedOperationException();
	}

	public void seleccionarFechaTope() {
		throw new UnsupportedOperationException();
	}

	public void seleccionarFechaDev() {
		throw new UnsupportedOperationException();
	}

	public void getEjemplar() {
		throw new UnsupportedOperationException();
	}

	public int get_iD() {
		return _iD;
	}

	public String get_fecha() {
		return _fecha;
	}

	public String get_fechaDev() {
		return _fechaDev;
	}

	public Ejemplar2 get_ejemplar2() {
		return _ejemplar2;
	}
}