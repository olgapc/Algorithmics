/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmia;

/**
 *
 * @author olga
 */
public class Palindrome
{

    public static void main(String[] args)
    {
        String words = "1Yo Voy1";

        if (isPalindrome(words))
        {
            System.out.println(words + " es un palíndromo");
        } else
        {
            System.out.println("no es un palíndromo");
        }
    }

    public static boolean isPalindrome(String words)
    {
        boolean bool = true;

        words = words.toLowerCase();
        words = words.replaceAll("\\s", "");

        int max = words.length() - 1;

        for (int i = 0; i < words.length() / 2; i++)
        {
            if (words.charAt(i) != words.charAt(max - i))
            {
                bool = false;
            }

        }
        return bool;
    }

}
