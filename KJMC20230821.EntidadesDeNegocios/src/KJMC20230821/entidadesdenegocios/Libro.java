/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KJMC20230821.entidadesdenegocios;

/**
 *
 * @author kevin
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int anio_publicacion;

    public Libro() {
    }

    public Libro(String titulo, String autor, int anio_publicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio_publicacion = anio_publicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio_publicacion() {
        return anio_publicacion;
    }

    public void setAnio_publicacion(int anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

    
    
    
}
