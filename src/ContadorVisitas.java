import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorVisitas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> visitas = new HashMap<>();

        System.out.println("Introduce nombres de páginas (escribe 'fin' para terminar):");

        while (true) {
            String pagina = sc.nextLine().toLowerCase();

            if (pagina.equals("fin")) {
                break;
            }

            if (visitas.containsKey(pagina)) {
                visitas.put(pagina, visitas.get(pagina) + 1);
            } else {
                visitas.put(pagina, 1);
            }
        }

        System.out.println("--- VISITAS POR PÁGINA ---");

        for (String pagina : visitas.keySet()) {
            System.out.println(pagina + " = " + visitas.get(pagina));
        }

        sc.close();
    }
}
