package Modelo.Material;

import Modelo.Controlador.Biblioteca2;
import java.util.Vector;
//import Practica_4___Diseno_de_la_persistencia_de_datos.Modelo.Servicio.Favorito;
//import Practica_4___Diseno_de_la_persistencia_de_datos.Modelo.Material.Ejemplar2;
import Modelo.Servicio.Favorito;
import Persistencia.LibroDAO;

public class Libro2 {
	private String _titulo;
	private String _autores;
	private int _ano;
	private String _iSBN;
	private int _paginas;
	public Biblioteca2 _contiene;
	public Vector<Favorito> _petenece = new Vector<Favorito>();
	public Vector<Ejemplar2> _unnamed_Ejemplar2_ = new Vector<Ejemplar2>();
	public LibroDAO _unnamed_LibroDAO_;

	public Libro2(String _titulo, String _autores, int _ano, String _iSBN, int _paginas) {
		this._titulo = _titulo;
		this._autores = _autores;
		this._ano = _ano;
		this._iSBN = _iSBN;
		this._paginas = _paginas;
	}

	public void crearLibro(Object aData) {
		throw new UnsupportedOperationException();
	}

	public void actualizarLibro(String titulo, String autores, int ano, int paginas) {
		this._titulo=titulo;
		this._autores=autores;
		this._ano=ano;
		this._paginas=paginas;
	}

	public void eliminarLibro() {
		throw new UnsupportedOperationException();
	}

	public String get_iSBN() {
		return _iSBN;
	}

	public String get_titulo() {
		return _titulo;
	}

	public String get_autores() {
		return _autores;
	}

	public int get_ano() {
		return _ano;
	}

	public int get_paginas() {
		return _paginas;
	}
}