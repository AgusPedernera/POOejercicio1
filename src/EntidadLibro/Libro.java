/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un constructor vacío. 
Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método 
el número de ISBN, el título, el autor del libro y el número de páginas.

 */
package EntidadLibro;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class Libro {
    public int ISBN;
    public String titulo;
    public String autor;
    public int paginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    
    public  void cargarDatos(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero de ISBN");
        this.ISBN=leer.nextInt();
        System.out.println("Ingrese titulo del libro");
        this.titulo=leer.next();
        System.out.println("Ingrese el autor");
        this.autor=leer.next();
        System.out.println("Ingrese el numero de paginas");
        this.paginas=leer.nextInt();
        
        
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
    }
    
    
    
}
