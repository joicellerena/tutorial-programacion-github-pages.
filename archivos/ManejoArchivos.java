import java.io.FileWriter;
import java.io.IOException;

public class ManejoArchivos {

    public static void main(String[] args) {

        try {

            FileWriter archivo = new FileWriter("datos.txt");

            archivo.write("Hola Mundo");

            archivo.close();

            System.out.println("Archivo creado correctamente.");

        } catch (IOException e) {

            System.out.println("Error al crear el archivo.");

        }

    }

}
