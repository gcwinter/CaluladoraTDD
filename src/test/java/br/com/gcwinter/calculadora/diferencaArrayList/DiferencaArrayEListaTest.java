package br.com.gcwinter.calculadora.diferencaArrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class DiferencaArrayEListaTest {


     @Test
    void diferenca(){

         int[] arrayDeUmADez = new int[99];
         List<Integer> listaDeUmADez = new ArrayList<>(99);

         for (int i = 1; i < 10; i++) {
             arrayDeUmADez[i-1] = i;
         }
         for (int i = 1; i < 10; i++) {
             listaDeUmADez.add(i);
         }
         System.out.println("---------Array-----------");
         System.out.println(Arrays.toString(arrayDeUmADez));
         System.out.println("---------Lista-----------");
         System.out.println(listaDeUmADez);

     }
}
