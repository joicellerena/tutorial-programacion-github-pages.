import java.util.ArrayList;

public class Listas {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");

        System.out.println("Lista de nombres:");

        for(String nombre : nombres) {
            System.out.println(nombre);
        }

    }

}
