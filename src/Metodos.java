public class Metodos {
    public int[] metodoBurbuja(int[] arreglo, boolean logs) {
        int size = arreglo.length;
        int aux = 0;
        imprimirArreglo(arreglo);
        if (logs) {
            System.out.println("");
        }
        for (int i = 0; i <= size - 2; i++) {
            for (int j = i + 1; j <= size - 1; j++) {
                if (logs) {
                    System.out.println("Num[" + i + "]: " + arreglo[i] + " - Num[" + j + "]: " + arreglo[j]);
                }
                if (arreglo[j] < arreglo[i]) {
                    if (logs) {
                        System.out.println("Numero " + arreglo[i] + " es mayor a " + arreglo[j]);
                    }
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                    if (logs) {
                        System.out.println("Num[" + i + "]: " + arreglo[i] + "- Num[" + j + "]: " + arreglo[j]);
                    }
                } else {
                    if (logs) {
                        System.out.println("Numero " + arreglo[i] + " no es mayor a " + arreglo[j]);
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

        return arreglo;
    }

    public int[] metodoSeleccion(int arreglo[]) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arreglo[minIndex];
            arreglo[minIndex] = arreglo[i];
            arreglo[i] = temp;
        }
        return arreglo;

    }

    public int[] metodoInsercion(int[] arreglo) {
        int aux;
        int pos;

        for (int i = 0; i < arreglo.length; i++) {
            pos = i;
            aux = arreglo[i];
            while ((pos > 0) && (arreglo[pos - 1] > aux)) {
                arreglo[pos] = arreglo[pos - 1];
                pos--;

            }
            arreglo[pos] = aux;
        }
        return arreglo;
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
    }
}
