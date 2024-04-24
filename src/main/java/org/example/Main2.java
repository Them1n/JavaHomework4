package org.example;

public class Main2 {
    public static void main(String[] args) {
        String text = "Роняє ліс багряний свій убір,\r\n" +
                "Срібне мороз, що в'януло поле,\r\n" +
                "Прогляньте день ніби мимоволі\r\n" +
                "І сховайтеся за край окружних гір.";

        text = text.toLowerCase();

        int[] letterCount = new int[33];


        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'а' && ch <= 'я') {
                int index = ch - 'а';
                letterCount[index]++;
            }
        }

        for (char ch = 'а'; ch <= 'я'; ch++) {
            int index = ch - 'а';
            if (letterCount[index] > 0) {
                System.out.println("Letter '" + ch + "' occurs " + letterCount[index] + " times.");
            }
        }
    }
}
