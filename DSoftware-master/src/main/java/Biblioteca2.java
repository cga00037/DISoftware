import Modelo.Material.Ejemplar2;
import Modelo.Material.Libro2;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Vector;


public class Biblioteca2 {

	public Vector<Usuario2> _accede_a = new Vector<Usuario2>();
	public ControladorLector _unnamed_ControladorLector_;
	public ControladorAdministrador _unnamed_ControladorAdministrador_;
	public Vector<Libro2> _contiene = new Vector<Libro2>();
	public Vector<Prestamo2> _tramita = new Vector<Prestamo2>();
	public ObservadorActualizar _unnamed_ObservadorActualizar_;
	public ObservadorEliminar _unnamed_ObservadorEliminar_;

	public Biblioteca2() {}

	/** Método principal donde se ejecuta el programa */
	public static void main(String[] args) {

	}

	public boolean autenticacion() {
		throw new UnsupportedOperationException();
	}

	public void addLibro(String titulo, String autores, int ano, String isbn, int paginas) {
		if (titulo.length() < 5 || autores.length() < 5)
			throw new RuntimeException("Debe tener al menos 5 letras");
		if(ano <= 0 || paginas <= 0)
			throw  new RuntimeException("Debe ser mayor de 0");

		Libro2 libro = new Libro2(titulo, autores, ano, isbn, paginas);
		_contiene.add(libro);
	}

	public Libro2 getLibro() {
		throw new UnsupportedOperationException();
	}

	public Libro2 buscarLibro(String  isbn) {
		for (int i = 0; i < _contiene.size(); i++) {
			if (_contiene.get(i).get_iSBN().equals(isbn))
				return _contiene.get(i);
		}
		return null;
	}

	public boolean actualizarLibro(String isbn, String titulo, String autores, int ano, int paginas) {
		if (titulo.length() < 5 || autores.length() < 5)
			throw new RuntimeException("Debe tener al menos 5 letras");
		if(ano <= 0 || paginas <= 0)
			throw  new RuntimeException("Debe ser mayor de 0");

		for (int i = 0; i < _contiene.size(); i++) {
			if (_contiene.get(i).get_iSBN().equals(isbn)) {
				_contiene.get(i).actualizarLibro(titulo, autores, ano, paginas);
				return true;
			}
		}
		return false;
	}

	public void realizaPrestamo(String idEjemplar) {
		_tramita.add(new Prestamo2(_tramita.size()+1, LocalDate.now().toString(),
				LocalDate.now().plusDays(14).toString(), new Ejemplar2(idEjemplar)));
	}

	public Prestamo2 buscarPrestamo(int idPrestamo) {
		for (int i = 0; i < _tramita.size(); i++) {
			if (_tramita.get(i).get_iD() == idPrestamo)
				return _tramita.get(i);
		}
		return null;
	}

	public boolean actualizarPrestamo(int idPrestamo, String fechaDev, String idEjemplar) {
		if(Integer.parseInt(idEjemplar) <= 0)
			throw  new RuntimeException("Debe ser mayor de 0");

		for (int i = 0; i < _tramita.size(); i++) {
			if (_tramita.get(i).get_iD() == idPrestamo) {
				if (fechaDev.equals(_tramita.get(i).get_fecha()))
					throw new RuntimeException("Error en la fecha devolucion");

				_tramita.get(i).actualizarPrestamo(fechaDev, new Ejemplar2(idEjemplar));
				return true;
			}
		}
		return false;
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