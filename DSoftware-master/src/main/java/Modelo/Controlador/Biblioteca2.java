package Modelo.Controlador;

import Bibliotecario.ControladorBibliotecario;
import Modelo.Material.Libro2;
import Modelo.Persona.Usuario2;
import Modelo.Servicio.Prestamo2;
import PaqueteAdministrador.ControladorAdministrador;
import PaqueteLector.ControladorLector;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Biblioteca2 {

	public List<Usuario2> _accede_a = new ArrayList<>();
	public ControladorLector _unnamed_ControladorLector_;
	public ControladorAdministrador _unnamed_ControladorAdministrador_;
	public ControladorBibliotecario _unnamed_ControladorBibliotecario_;
	//public ObservadorActualizar _unnamed_ObservadorActualizar_;
	//public ObservadorEliminar _unnamed_ObservadorEliminar_;
	public List<Libro2> _contiene = new ArrayList<>();
	public List<Prestamo2> _tramita = new ArrayList<>();

	public boolean autenticacion() {
		throw new UnsupportedOperationException();
	}

	public void addLibro(Object aData) {
		throw new UnsupportedOperationException();
	}

	public Libro2 getLibro() {
		throw new UnsupportedOperationException();
	}

	public boolean buscarLibro(Object aISBN) {
		throw new UnsupportedOperationException();
	}

	public void actualizarLibro(Object aData) {
		throw new UnsupportedOperationException();
	}

	public void eliminarLibro() {
		throw new UnsupportedOperationException();
	}

	public boolean getLibroBorrado() {
		throw new UnsupportedOperationException();
	}

	public List<Prestamo2> pedirPrestamos() {
		throw new UnsupportedOperationException();
	}

	public Date pedirFecha() {
		throw new UnsupportedOperationException();
	}

	public Date pedirFechaTope() {
		throw new UnsupportedOperationException();
	}

	public Date pedirFechaDev() {
		throw new UnsupportedOperationException();
	}

}