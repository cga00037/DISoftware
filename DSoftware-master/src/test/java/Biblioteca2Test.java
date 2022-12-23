import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


class Biblioteca2Test {

    Biblioteca2 biblioteca = new Biblioteca2();

    @Test
    void actualizarLibroTest() {
        /*
            Prueba de caja blanca
         */
        // Suponemos que se ha equivocado al escribir el año y el número de páginas
        biblioteca.addLibro("Harry potter", "J. K. Rowling", 2005, "123456", 20);

        // Suponemos que se equivoca al introducir el isbn del libro
        Assertions.assertFalse(
            biblioteca.actualizarLibro("", "Harry potter", "J. K. Rowling", 1996, 200));

        // Suponemos que introduce bien el isbn de libro
        Assertions.assertTrue(
        biblioteca.actualizarLibro("123456", "Harry potter", "J. K. Rowling", 1996, 200));

        // Comprobamos si ha cambiado el año y el número de páginas
        Assertions.assertEquals(1996, biblioteca.buscarLibro("123456").get_ano());
        Assertions.assertEquals(200, biblioteca.buscarLibro("123456").get_paginas());

        /*
            Prueba de caja negra
         */
        // Suponemos que pasa un titulo de menos de 5 caracteres (Debe tirar excepcion de tipo RuntimeException)
        Assertions.assertThrows(RuntimeException.class, () ->
                biblioteca.actualizarLibro("123456", "Bad", "J. K. Rowling", 1996, 200));

        // Suponemos que pasa un autor de menos de 5 caracteres (Debe tirar excepcion de tipo RuntimeException)
        Assertions.assertThrows(RuntimeException.class, () ->
                biblioteca.actualizarLibro("123456", "Harry potter", "J.", 1996, 200));

        // Suponemos que el ano es menor que 0 (Debe tirar excepcion de tipo RuntimeException)
        Assertions.assertThrows(RuntimeException.class, () ->
                biblioteca.actualizarLibro("123456", "Harry potter", "J. K. Rowling", -1, 200));

        // Suponemos que el ano es igual a 0 (Debe tirar excepcion de tipo RuntimeException)
        Assertions.assertThrows(RuntimeException.class, () ->
                biblioteca.actualizarLibro("123456", "Harry potter", "J. K. Rowling", 0, 200));

        // Suponemos que el nº de páginas es menor que 0 (Debe tirar excepcion de tipo RuntimeException)
        Assertions.assertThrows(RuntimeException.class, () ->
                biblioteca.actualizarLibro("123456", "Harry potter", "J. K. Rowling", 1996, -1));

        // Suponemos que el nº de páginas es igual a 0 (Debe tirar excepcion de tipo RuntimeException)
        Assertions.assertThrows(RuntimeException.class, () ->
                biblioteca.actualizarLibro("123456", "Harry potter", "J. K. Rowling", 1996, 0));
    }

    @Test
    void ActualizarPrestamosTest() {
        /*
            Prueba de caja blanca
         */
        // Realizamos el prestamo del ejemplar con id 1
        biblioteca.realizaPrestamo("1");

        // Imaginamos que se equivoca al indicar el préstamo a modificar
        Assertions.assertFalse(
                biblioteca.actualizarPrestamo(-1, LocalDate.now().plusDays(1).toString(), "1"));

        // Imaginamos que indica correctamente el préstamo a modificar
        Assertions.assertTrue(
                biblioteca.actualizarPrestamo(1, LocalDate.now().plusDays(1).toString(), "3"));

        // Vemos si se han cambiado los valores de la fecha devolución y el ejemplar prestado
        Assertions.assertEquals(LocalDate.now().plusDays(1).toString(), biblioteca.buscarPrestamo(1).get_fechaDev());
        Assertions.assertEquals("3", biblioteca.buscarPrestamo(1).get_ejemplar2().get_idInventario());

        /*
            Prueba de caja negra
         */
        // Suponemos que el idEjemplar es menor que 0
        Assertions.assertThrows(RuntimeException.class, () ->
                biblioteca.actualizarPrestamo(1, LocalDate.now().plusDays(1).toString(), "-1"));

        // Suponemos que el idEjemplar es igual a 0
        Assertions.assertThrows(RuntimeException.class, () ->
                biblioteca.actualizarPrestamo(1, LocalDate.now().plusDays(1).toString(), "0"));

        // Suponemos que la fecha de devolucion es hoy (No debe ser posible)
        Assertions.assertThrows(RuntimeException.class, () ->
               biblioteca.actualizarPrestamo(1, LocalDate.now().toString(), "1"));
    }
}