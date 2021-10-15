package com.alan;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*while
	    do-while
	    for
	*/
    Scanner input = new Scanner(System.in);
       /* System.out.println("Ingresa un numero");
        int numero = input.nextInt();
    for(int i=1; i<=10; i++){
        if(i%2==0){//Lo que hace continue es que directamente va a aumentar el iterador i, es decir no va a ejecutar la siguiente linea de codigo por lo tanto no va a imprimir los numeros pares
            continue;
        }
        System.out.println( i + ".-" + numero + " x " + i  + " = " + i*numero);
    }*/

    //Serie de fibonacci
        //System.out.println("Hasta que numero de la serie lo quieres");
    /*int parar =  input.nextInt();
    int aux=0;
    for(int i=0; i<parar; i++){
        for(int j = 0; j<i ;j ++) {
            if(i==1){
                aux=0;
            }else
                aux++;
        }
        System.out.println( "n= "+ (i) + " = " + (i+aux) + "\n");
    }*/
    /*int parar = input.nextInt();
    int acumula=0, n=0,aux=1;
    for(int i=0;i<parar; i++){


    }*/


        int numeroSecreto = 33;
        int numero;

       /* while(numero!=numeroSecreto){
            System.out.println("Numero incorrecto");
            numero = input.nextInt();
        }
        System.out.println("Felicidades adivinaste el numero secreto");
        */

        /*for(;;){
            int numero = input.nextInt();
            if(numero==numeroSecreto){
                System.out.println("Felicidades adivinaste el numero");
                break;
            }
            System.out.println("Numero incorrecto");
        }*/

        /*do{
            System.out.println("Adivina el numero secreto");
            numero = input.nextInt();
        }while(numero!=numeroSecreto);
        System.out.println("Felicidades adivinaste el numero");*/
        numero=input.nextInt();
        int aux=numero;
        int acumulable=0;
        for(int i=numero;i>=1;i--){//5
            acumulable=numero*(numero-i);
        }
        System.out.println(acumulable);


        /*
       public int factorial(int n){
            if(n==1){
                return n;
            }
            return (n*factorial(n-1));
        };

        System.out.println("Resultado: " + factorial(10));*/
    }
}
