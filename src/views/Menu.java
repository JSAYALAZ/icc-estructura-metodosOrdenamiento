package views;

public class Menu {
    public void menuPrincipal() {
        System.out.println("\n");
        System.out.println("Menu");
        System.out.println("1) Definir arreglo");
        System.out.println("2) Ver Arreglo");
        System.out.println("3) Ordenar arreglo");
        System.out.println("4) Salir");
        System.out.print("Opcion: ");
    }
    public void menuOrdenamientos() {
        System.out.println("\n");
        System.out.println("Ordenamientos disponibles");
        System.out.println("1) Metodo Burbuja");
        System.out.println("2) Metodo Insercion");
        System.out.println("3) Metodo Selecciona");
        System.out.println("4) Salir");
        System.out.print("Opcion: ");
    }

    public void menuLogs() {
        System.out.println("Con logs[1]");
        System.out.println("Sin logs[0]");
        System.out.print("Logs [1/0]: ");
    }
    public void menuIngresoAArray() {
        System.out.print("Agregar valor [Digita 999 para Salir]:");
        
    }
}
