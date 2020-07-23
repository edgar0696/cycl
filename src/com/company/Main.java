package com.company;
// Вывести все собственные имена !!!
// Все которіе начинаются  с большой буквы!


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
	//Загружаем файл в строку
        String text = new String(Files.readAllBytes(Paths.get("C:/Users/Едгар/Desktop/IT-Programming/Java/harry.txt")));
        // Выводим первые 200 символов !!!
        System.out.println(text.substring(0,200));

        System.out.println("-----------------------------------------------------------------------------------------------------");

        // Чистим от мусора
        text = text.replaceAll("[^A-Za-z ]", "");
        System.out.println(text);

        // Все слова текста переводим в МАСИВ!!!
        String[] words = text.split(" ");
        for (int i = 0; i <=20; i++) {

                System.out.println(i + ". " + words[i]);  // Номер слова и точка после и пробел перед словом


        }
        for (int i = 0; i <words.length; i++) {
            //char first = (Character) words[i].charAt(0);
            if (words[i].length() >0 && Character.isUpperCase(words[i].charAt(0))){

                System.out.println(i + ". " + words[i]);
            }
        }
        // Создаем строку из Distinct-ов - Слова уникальные которые не повторяются
        String distinctString = "";
        for (int i = 0; i <words.length; i++) {

            if (!distinctString.contains(words[i])) {

                distinctString +=" " + words[i];
            }

        }
        System.out.println(distinctString.substring(0,200));

        String[] distincts = distinctString.split(" ");
        System.out.println(distincts.length);
        System.out.println(words.length);
        // Розмещаем Distinct в алфавитном порядке
        System.out.println("----------------------------------------------------------------");

        Arrays.sort(distincts);  // Отсортировать масив!
        for (int i = 0; i <20; i++) {
            System.out.println(i + ". " + distincts[i]);
        }
        // Ищем сколько раз The Встречается в тексте!
          //для этого создаем счетчик!!!
        int counter = 0;

        String wordToFind = words[5];

        for (int i = 0; i < words.length; i++) {

            if (words[i].toLowerCase().equals(wordToFind.toLowerCase())) {

                counter ++;

            }
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("Слова (" + wordToFind + ") встречаеться в тексте (" + counter + ") раз!");

    }
}

// Составить масив int - ов, ввестисколько раз в тексте встречается уникальное слова Distinct