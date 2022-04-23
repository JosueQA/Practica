import java.util.Arrays;
import java.util.Scanner;

public class Tarea3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Declarar cantidad de elementos del arreglo
        System.out.print("Ingrese el numero de elementos  que tendra el arreglo: ");
        int cantElementos = entrada.nextInt();

        // Declarar rango de los elementos del arreglo
        System.out.println("Ingrese el rango en el que se encuentre el arreglo");
        System.out.print("Valor minimo: ");
        int vMin = entrada.nextInt();
        System.out.print("Valor maximo: ");
        int vMax = entrada.nextInt();

        int array[] = new int[cantElementos];
        // Ordenar al azar los elemntos
        arregloalazar(array, vMax, vMin);

        // Cuantas veces se repite cada numero
        Mostrarcuántasvecesserepitecadanúmero(array);

    }

    // Imprime la lista del arreglo con los numeros al azar.
    public static void  arregloalazar(int[] arreglo, int valorMaximo, int valorMinimo){

        for (int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int) (Math.random()*((valorMaximo-1) - valorMinimo + 1)+ valorMinimo);
            System.out.println(arreglo[i]);
        }
    }

    public static void Mostrarcuántasvecesserepitecadanúmero (int arreglo[]) {
        Arrays.sort(arreglo);
        int acumulador = 0;
        int acumulador2 = 0;
        int posicion = 0;
        for (int dato : arreglo) {
            System.out.print(dato);
        }
        for (int dato : arreglo){
            if (arreglo[posicion] == dato) {
                acumulador++;
                acumulador2++;
            } else {
                System.out.print("\nEl numero " + arreglo[posicion] + " se repite " + acumulador + " veces");
                System.out.print("\n"+dato);
                posicion = acumulador2;
                System.out.print(posicion + "\n");
                acumulador =1;
            }
        }


    }
}
/*
    MOSTRAR CUANTAS VECES SE REPITE CADA NUMERO

    - cuando ya no se acumule, que la posicion tome el valor de la posicion del valor
    */