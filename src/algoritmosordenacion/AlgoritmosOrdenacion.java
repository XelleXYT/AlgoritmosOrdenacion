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
	for (int j = 0; j < numeros.length; j++) {
	    for (int i = 0; i < numeros.length - 1; i++) {
		if (numeros[i] > numeros[i + 1]) {
		    aux = numeros[i];
		    numeros[i] = numeros[i + 1];
		    numeros[i + 1] = aux;
		}
	    }
	}
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	AlgoritmosOrdenacion ejercicios = new AlgoritmosOrdenacion();
	int[] numeros = {57, 22, 11, 13, 21, 7};
	ejercicios.ordenacionBurbuja(numeros);
	System.out.println(Arrays.toString(numeros));
    }

}
