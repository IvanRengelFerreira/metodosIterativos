package aplicacion;

import java.util.ArrayList;
import java.util.Scanner;

import mates.Funciones;

public class Principal {
     public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    //Ejercicio 1
    int num = Funciones.numero();
    System.out.println("La suma de los primeros "+num +" números es: " + Funciones.suma(num));
    
    //Ejercicio 2
    num = Funciones.numero();
    System.out.println("El factorial de "+num+" es "+Funciones.factorial(num));

    //Ejercicio 3
    System.out.println("Elige el numero por el que lo potencias");
    int potencia = sc.nextInt();
    num = Funciones.numero();
    System.out.println(num+" a la "+potencia+" es "+Funciones.potencias(potencia,num));

    //Ejercicio 4
    ArrayList<Integer> lista = new ArrayList<>();
    System.out.println("La suma de la lista es "+Funciones.listaSuma(Funciones.tamaño(),lista,sc));

    //Ejercicio 5
    ArrayList<Integer> listaMedia = new ArrayList<>();
    System.out.println("La media de la lista es "+Funciones.mediaLista(Funciones.tamaño(),sc,listaMedia));

    //Ejercicio 6
    ArrayList<Integer> listaDesviacion = new ArrayList<>();
    System.out.println("La desviación típica de la lista es "+Funciones.desviacionTipica(listaDesviacion, sc, Funciones.tamaño(), 0.0));

    //Ejercicio 7
    num = Funciones.numero();
    System.out.println("La suma de los numeros pares desde "+num+" es "+Funciones.sumaPares(num));

    //Ejercicio 8
    ArrayList<Integer> listaPares = new ArrayList<>();
    System.out.println("La suma de los numeros pares dentro de la lista son "+Funciones.listaSumaPares(Funciones.tamaño(), listaPares, sc));

    //Ejercicio 9
    ArrayList<Integer> lista1 = new ArrayList<>();
    Funciones.solicitarNumeros(Funciones.tamaño(),lista1,sc);
    ArrayList<Integer> lista2 = Funciones.filtrarYOrdenarPares(lista1);
    System.out.println("La lista nueva de los numeros pares a partir de la lista dada es "+lista2);
    
    //Ejercicio 10
    num = Funciones.numero();
    System.out.println("La lista de los numeros pares desde "+num+" son "+Funciones.listaPar(num));
    
    //Ejercicio 11
    ArrayList<Integer> listaProducto = new ArrayList<>();
    ArrayList<Integer> listaProducto2 = new ArrayList<>();
    Funciones.solicitarNumeros(Funciones.tamaño(), listaProducto, sc);
    Funciones.solicitarNumeros(Funciones.tamaño(), listaProducto2, sc);
    System.out.println("El producto escalar de las listas es: "+Funciones.productoEscalar(listaProducto,listaProducto2));

   
    

    }

   
}
 




