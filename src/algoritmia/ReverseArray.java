/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmia;

import java.util.Arrays;

/**
 *
 * @author olga
 */
public class ReverseArray
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int[] arraySimple =
        {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11
        };
        int j = arraySimple.length - 1;
        int med = arraySimple.length / 2;
        for (int i = 0; i < med; i++)
        {
            int var = arraySimple[i];
            arraySimple[i] = arraySimple[j];
            arraySimple[j] = var;
            j--;
        }
        System.out.println(Arrays.toString(arraySimple));
    }

}
