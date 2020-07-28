package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
	String text = new String(Files.readAllBytes(Paths.get("C:/Users/Едгар/Desktop/IT-Programming/Java/harry.txt")));

	String first200 = text.substring(0,20); //сабстринг отрезали и вывевли 200 символов

        System.out.println(first200);
// освободили текст от мусора textTrashFree
        String textTrashFree = text.replaceAll("[^A-Za-z'\\- ]", "");

        System.out.println();
        first200 = textTrashFree.substring(0,200);
        System.out.println(first200);

        String [] wordsArray = textTrashFree.split(" "); //array - масив слов текста Гарри потер
        System.out.println(wordsArray.length);

        for (int i = 0; i <100; i++) {

            // все слова которе начинаются на Б    // все слова которые начинаются на А
            if ( (wordsArray[i].length() >=3) && ( (wordsArray[i].charAt(0) == 'b') || (wordsArray[i].charAt(0) == 'a') ) ) {// "||" дисджиншен.
                //Первая буква charAt(0) солова "а"
                // есть первая "нулевая"!!!! запомните!!
                // charAt берется в одиночных кавычках



                System.out.print(i + ". ");// выводит номер слова
                System.out.println(wordsArray[i]);// это выводит слово на каком номере
            }else {
                System.out.println(i + " Слово (" + wordsArray[i] + ") не подходит");

            }

        }




    }
}
