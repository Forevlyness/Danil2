package com.company;

public class Main {

    public static void main(String[] args) {

        // условная конструкция switch
        String color = "Зеленый";

        switch (color){
            case "красный":
                System.out.println("вы агресивный и вспылчивый");
                break;
            case "оранжевый":
                System.out.println("вы позитивный и дружелюбный");
                break;
            default:
                System.out.println("Некорректный цвет");

        }
        // булева алгебра
        // Использование оператора "или - ||"
        if (color == "красный" || color == "Синий") {
            System.out.println("успешно");
        } else {
            System.out.println("Ошибка");
        }

        // Использование оператора "и - &&"
        int temp = 24;
        String season = "Summer";
        if(temp > 20 && season == "Summer"){
            printText("Hello from Osh" , 20);
            print();
            System.out.println(sum());
        }


    }

    private static void print (){
        System.out.println("Вы можете идти гулять!");
    }

    protected static int sum(){
        return 11 + 16;
    }

    // Метод с параметрами
    public static void printText(String text, int a) {
        System.out.println(text + ", Число равно - " + a);
    }
}
