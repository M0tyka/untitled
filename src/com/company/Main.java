package com.company;

public class Main {

    public static void main(String[] args) {

        var myCigan = new Cigan(12,5);
        System.out.println(myCigan.x());
        System.out.println(myCigan.y());
        var code = "404";

        switch (code) {
            case "401", "402", "403" -> System.out.println("Chyba na straně klienta.");
            case "501", "502", "503" -> System.out.println("Chyba na straně serveru");
            default -> {
                System.out.println("Chyba je mezi monitorem a židlí.");
                System.out.println("Je to zase tady.");
            }


        }
    }
}
