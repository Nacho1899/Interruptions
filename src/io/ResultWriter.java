package io;

import java.io.FileWriter; // Importamos la clase FileWriter
import java.io.IOException; // Importamos la clase IOException
import java.io.File; // Importamos la clase Archvo

/**
 * ResultWriter
 */
public class ResultWriter {
    File file; // Creamos un archivo

    public ResultWriter(String file) {
        this.file = new File(file); // Escribimos en el archivo un String
    }

    public void writeResults(int[] results) {
        try { // Inicio donde pudiera saltar un error 
            FileWriter writer = new FileWriter(file);  // Creamos el archivo para escribir 

            for (int i : results) {
                writer.write(String.valueOf(i) + "\n");
                System.out.println(i); // Leemos el archivo y lo mostramos por pantalla
            }
            writer.close(); // Cerramos el arhivo 
        } catch (IOException e) {
            e.printStackTrace(); // Imprime donde fue el error 
        }
    }
}
