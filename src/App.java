import java.util.ArrayList;
import java.util.Scanner;

import views.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        Metodos ordenamiento = new Metodos();

        ArrayList<Integer> arregloOrdenado;
        int opcMenu;
        int opc;
        int valor;
        int opcLogs;
        boolean logs;
        boolean seguirIngreso;
        ArrayList<Integer> arreglo = new ArrayList<>();

        do {// LECTURA DE SI QUIERE O NO LOGS
            menu.menuPrincipal();
            opcMenu = scanner.nextInt();
            if (opcMenu == 1) {
                arreglo.clear();
                seguirIngreso = true;
                do {
                    menu.menuIngresoAArray();
                    valor = scanner.nextInt();
                    if (valor != 999) {
                        arreglo.add(valor);
                    } else {
                        seguirIngreso = false;
                    }

                } while (seguirIngreso);
            }
            if (opcMenu == 2) {
                System.out.print("Tu arreglo actual -> ");
                ordenamiento.imprimirArreglo(arreglo);
            }
            if (opcMenu == 3) {
                menu.menuOrdenamientos();
                opc = scanner.nextInt();
                switch (opc) {
                    case 1:
                        menu.menuLogs();
                            opcLogs = scanner.nextInt();
                        if (opcLogs == 1) {
                            logs = true;
                        } else {
                            logs = false;
                        }
                        System.out.println("");
                        arregloOrdenado = ordenamiento.metodoBurbuja(arreglo, logs);
                        System.out.println("\n***** Ordenamiento burbuja *****");
                        ordenamiento.imprimirArreglo(arregloOrdenado);
                        break;
                    case 2:
                        opcLogs = scanner.nextInt();
                        if (opcLogs == 1) {
                            logs = true;
                        } else {
                            logs = false;
                        }
                        arregloOrdenado = ordenamiento.metodoInsercion(arreglo);
                        System.out.println("\n***** Ordenamiento Insercion *****");
                        ordenamiento.imprimirArreglo(arregloOrdenado);
                        break;
                    case 3:
                        opcLogs = scanner.nextInt();
                        if (opcLogs == 1) {
                            logs = true;
                        } else {
                            logs = false;
                        }
                        arregloOrdenado = ordenamiento.metodoSeleccion(arreglo);
                        System.out.println("\n***** Ordenamiento Seleccion *****");
                        ordenamiento.imprimirArreglo(arregloOrdenado);
                        break;
                    case 4:
                        System.out.println("Saliste del programa");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            }
        } while (opcMenu != 4);
        scanner.close();
    }
}
