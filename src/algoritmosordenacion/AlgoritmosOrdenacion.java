/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosordenacion;

import java.util.Arrays;

/**
 *
 * @author Alex
 */
public class AlgoritmosOrdenacion {

    public void ordenacionBurbuja(int[] numeros) {
	int aux;
	boolean cambio = false;
	int contador = 1;
	System.out.println(Arrays.toString(numeros));
	while (!cambio) {
	    cambio = true;
	    for (int i = 0; i < numeros.length - contador; i++) {
		if (numeros[i] > numeros[i + 1]) {
		    aux = numeros[i];
		    numeros[i] = numeros[i + 1];
		    numeros[i + 1] = aux;
		    cambio = false;
		}
	    }
	    contador++;
	    System.out.println(Arrays.toString(numeros));
	}
    }

    public void ordenacionInsercion(int[] numeros) {
	for (int i = 1; i < numeros.length; i++) {
	    int aux = numeros[i];
	    int j = i;
	    while (j > 0 && aux < numeros[j - 1]) {
		numeros[j] = numeros[j - 1];
		j--;
	    }
	    numeros[j] = aux;
	    System.out.println(Arrays.toString(numeros));
	}
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	AlgoritmosOrdenacion ejercicios = new AlgoritmosOrdenacion();
	int[] numeros = {57, 22, 11, 13, 21, 7};
	//ejercicios.ordenacionBurbuja(numeros);
	ejercicios.ordenacionInsercion(numeros);
    }

}
