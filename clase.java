/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author Cinthia
 */
public class clase {
    //atributos del libro
    String titulo;
    String autores;
    int id_libros;

    //constructor para la class clase
    public clase(String titulo, String autores, int id_libros) {
        this.titulo = titulo;
        this.autores = autores;
        this.id_libros = id_libros;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public int getId_libros() {
        return id_libros;
    }

    public void setId_libros(int id_libros) {
        this.id_libros = id_libros;
    }
    
}
