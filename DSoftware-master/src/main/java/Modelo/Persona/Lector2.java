package Modelo.Persona;

import Modelo.Servicio.Favorito;
import Modelo.Servicio.Reserva2;

import java.util.Vector;
//import Practica_4___Diseno_de_la_persistencia_de_datos.Modelo.Servicio.Reserva2;
//import Practica_4___Diseno_de_la_persistencia_de_datos.Modelo.Servicio.Favorito;

public class Lector2 extends Usuario2 {

	private String _direccion;
	private boolean _estado;
	private int _tiempoPenalizacion;
	public Vector<Reserva2> _realiza = new Vector<Reserva2>();
	public Vector<Favorito> _tiene = new Vector<Favorito>();

}