/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botetin_7;

/**
 *
 * @author jalvarezotero
 */
public class Botetin_7 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Libro libro1 = new Libro("rosalin","Jojo",3,0);
        Libro libro2 = new Libro("adios","pepe gonzales",7,2);
        Libro libro3 = new Libro();
        libro3.setTitulo("adeus e mais");
        libro3.setAutor("floup");
        libro3.setExemplares(9);
        libro3.setPrestados(7);
        
        libro1.prestamo();
        libro2.prestamo();
        libro3.devolucion();
    }
    

}
