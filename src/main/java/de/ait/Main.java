package de.ait;

public class Main {
    public static void main(String[] args) {

//        Создайте абстрактный класс StringTools, со статическими методами:
//
//        String FirstToUpperCase(String str);
//        Данный метод должен возвращать новую строку, в которой первый символ возведен в верхний регистр.
//                Например, FirstToUpperCase("apple") -> "apple';
//
//        boolean isStartingFromCapital(String str); Данный метод должен показывать, начинается ли строка с большой буквы. Например, isStartingFromCapital("Apple") -> true;
//        isStartingFromCapital("apple") -> false;
//
//        Напишите тесты для данных методов.

        System.out.println(StringTools.firstToUpperCase("mama"));//Mama
        System.out.println(StringTools.firstToUpperCase("i have got a cat"));//I have got a cat

        System.out.println(StringTools.isStartingFromCapital("Mama"));//true
        System.out.println(StringTools.isStartingFromCapital("mama"));//false

    }
}