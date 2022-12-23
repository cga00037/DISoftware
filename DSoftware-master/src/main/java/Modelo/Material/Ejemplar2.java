package Modelo.Material;

import Modelo.Servicio.Reserva2;

import java.util.Date;
import java.util.Vector;
//import Practica_4___Diseno_de_la_persistencia_de_datos.Modelo.Servicio.Reserva2;

public class Ejemplar2 {

	private String _idInventario;
	private Date _fechaCompra;
	private boolean _estado;
	public Libro2 _tiene;
	public Vector<Reserva2> _contiene = new Vector<Reserva2>();

	public Ejemplar2() {
	}

	public Ejemplar2(String idInventario) {
		this._idInventario = idInventario;
	}

	public String get_idInventario() {
		return _idInventario;
	}
}