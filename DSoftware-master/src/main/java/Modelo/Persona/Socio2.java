package Modelo.Persona;

import Modelo.Servicio.Pago2;

import java.util.Vector;
//import Practica_4___Diseno_de_la_persistencia_de_datos.Modelo.Servicio.Pago2;

public class Socio2 extends Alumno2 {
	private String _idSocio;
	public Vector<Pago2> _realiza = new Vector<Pago2>();
}