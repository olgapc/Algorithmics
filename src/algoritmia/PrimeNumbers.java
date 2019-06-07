/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author olga
 */
public class PrimeNumbers
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        List<Integer> primeNumbersList;
        primeNumbersList = new ArrayList<>();

        int num = 100;

        for (int i = 1; i <= num; i++)
        {
            if (isPrime(i))
            {
                primeNumbersList.add(i);
            }
        }
        System.out.println(primeNumbersList);
        System.out.println("hay " + primeNumbersList.size() + " números primos");
    }

    public static boolean isPrime(int num)
    {
        boolean bool = true;
        if (num == 1)
        {
            bool = true;
        } else
        {
            for (int j = 2; j < num; j++)
            {
                if (num % j == 0)
                {
                    bool = false;
                }
            }
        }
        return bool;
    }
}
