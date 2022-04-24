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
        int posicion = 0;
        System.out.print("El arreglo en orden seria: ");
        for (int dato : arreglo) {
            System.out.print(dato);
        }
        System.out.print("\n");
        for (int dato =0; dato != arreglo.length; dato ++){
            if (arreglo[posicion] == arreglo[dato]) {
                acumulador++;
            } else {
               if (acumulador == 0) {
                   acumulador = 1;
                   System.out.println("El numero " + arreglo[posicion] + " se repite " + acumulador + " veces");
               } else {
                   System.out.println("El numero " + arreglo[posicion] + " se repite " + acumulador + " veces");
               }
                posicion = posicion + acumulador;
                acumulador =1;
            }
        }

        //MOSTRAR NUMEROS PARES E IMPARES Y SUS PROMEDIOS
        double cantNumPar = 0;
        double cantNumInpar = 0;
        double sumaPar = 0 ;
        double sumaInpar = 0;
        for (int dato =0; dato< arreglo.length; dato++){
            if (arreglo[dato]%2 == 0){
                System.out.println("El numero " + arreglo[dato] + " en la posicion " + dato + " del arreglo, es par.");
                cantNumPar++;
                sumaPar = sumaPar + arreglo[dato];
            } else {
                System.out.println("El numero " + arreglo[dato] + " en la posicion " + dato + " del arreglo, es inpar.");
                cantNumInpar++;
                sumaInpar = sumaInpar + arreglo[dato];
            }
        }
        double promPar = sumaPar/cantNumPar;
        double promInpar = sumaInpar/cantNumInpar;
        System.out.println("La suma de los pares es " + sumaPar + " y su promedio es " + promPar);
        System.out.println("La suma de los inpares es " + sumaInpar + " y su promedio es " + promInpar);
    }
}