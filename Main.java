import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        IRepositorio repo;
        int opcion;
        int tipo;

        System.out.println("Seleccione el tipo de repositorio");
        System.out.println("1. SQL");
        System.out.println("2. Memoria");
        tipo = sc.nextInt();
        sc.nextLine();

        if (tipo == 1) {
            repo = new RepositorioSQL();
        } else {
            repo = new RepositorioEnMemoria();
        }

        do {
            System.out.println("\nMENU");
            System.out.println("1. Guardar dato");
            System.out.println("2. Leer dato");
            System.out.println("3. Eliminar dato");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.print("Ingrese el dato: ");
                String dato = sc.nextLine();
                repo.guardar(dato);

            } else if (opcion == 2) {
                System.out.print("Ingrese el id: ");
                String id = sc.nextLine();
                Object dato = repo.leer(id);
                System.out.println("Dato obtenido: " + dato);

            } else if (opcion == 3) {
                System.out.print("Ingrese el id: ");
                String id = sc.nextLine();
                repo.eliminar(id);
            }

        } while (opcion != 4);

        System.out.println("Programa finalizado");
    }
}
