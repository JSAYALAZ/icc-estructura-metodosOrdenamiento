import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Metodos ordenamiento = new Metodos();

        int arregloOrdenado[];
        int opc;
        boolean logs;
        int arreglo [] = {3,6,4,1};
        do {
            System.out.println("\n");
            System.out.println("Menu");
            System.out.println("1) Metodo Burbuja");
            System.out.println("2) Metodo Insercion");
            System.out.println("3) Metodo Selecciona");
            System.out.println("4) Salir");
            System.out.print("Opcion: ");
            opc = scanner.nextInt();
            switch (opc) {
                case 1:
                System.out.println("Con logs[1]");
                System.out.println("Sin logs[0]");
                System.out.print("Logs [1/0]: ");
                    int opcLogs = scanner.nextInt();
                    if(opcLogs==1){
                        logs=true;
                    }else{
                        logs=false;
                    }
                    System.out.println("");
                    arregloOrdenado = ordenamiento.metodoBurbuja(arreglo, logs);
                    System.out.println("***** Ordenamiento burbuja *****");
                    ordenamiento.imprimirArreglo(arregloOrdenado);
                    break;
                case 2:
                arregloOrdenado = ordenamiento.metodoInsercion(arreglo);
                    System.out.println("***** Ordenamiento Insercion *****");
                    ordenamiento.imprimirArreglo(arregloOrdenado);
                    break;
                case 3:
                arregloOrdenado = ordenamiento.metodoSeleccion(arreglo);
                    System.out.println("***** Ordenamiento Seleccion *****");
                    ordenamiento.imprimirArreglo(arregloOrdenado);
                    break;
                case 4:
                System.out.println("Saliste del programa");
                    break;
                default:
                    System.err.println("Opcion no valida");

                    break;
            }
        } while (opc != 4);
        scanner.close();
    }
}
