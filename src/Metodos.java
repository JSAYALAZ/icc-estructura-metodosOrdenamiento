import java.util.ArrayList;

public class Metodos {
    public ArrayList<Integer> metodoBurbuja(ArrayList<Integer> arreglo, boolean logs) {
        ArrayList<Integer> arregloEntrada = arreglo;
        int size = arregloEntrada.size();
        int aux = 0;
        imprimirArreglo(arregloEntrada);
        if (logs) {
            System.out.println("");
        }
        for (int i = 0; i <= size - 2; i++) {
            for (int j = i + 1; j <= size - 1; j++) {
                if (logs) {
                    System.out.println("Num[" + i + "]: " + arregloEntrada.get(i) + " - Num[" + j + "]: " + arregloEntrada.get(j));
                }
                if (arregloEntrada.get(j) < arregloEntrada.get(i)) {
                    if (logs) {
                        System.out.println("Numero " + arregloEntrada.get(i) + " es mayor a " + arregloEntrada.get(j));
                    }
                    aux = arregloEntrada.get(i);
                    arregloEntrada.set(i, arregloEntrada.get(j));
                    arregloEntrada.set(j, aux);
                    if (logs) {
                        System.out.println("Num[" + i + "]: " + arregloEntrada.get(i) + "- Num[" + j + "]: " + arregloEntrada.get(j));
                    }
                } else {
                    if (logs) {
                        System.out.println("Numero " + arregloEntrada.get(i) + " no es mayor a " + arregloEntrada.get(j));
                    }
                }
                if (logs) {
                    System.out.println("\n");
                }
            }
            if (logs) {
                System.out.println("\n");
            }
        }

        return arregloEntrada;
    }

    public ArrayList<Integer> metodoSeleccion(ArrayList<Integer> arreglo) {
        int n = arreglo.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo.get(j) < arreglo.get(minIndex)) {
                    minIndex = j;
                }
            }
            int temp = arreglo.get(minIndex);
            arreglo.set(minIndex, arreglo.get(i));
            arreglo.set(i, temp);
        }
        return arreglo;

    }

    public ArrayList<Integer> metodoInsercion(ArrayList<Integer> arreglo) {
        int aux;
        int pos;

        for (int i = 0; i < arreglo.size(); i++) {
            pos = i;
            aux = arreglo.get(i);
            while ((pos > 0) && (arreglo.get(pos - 1) > aux)) {
                arreglo.set(pos, arreglo.get(pos - 1));
                pos--;

            }
            arreglo.set(pos, aux);
        }
        return arreglo;
    }

    public void imprimirArreglo(ArrayList<Integer> arreglo) {
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
    }
}
