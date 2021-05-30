/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yasir
 */
import java.util.*;

public class Hangman_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] category = {"Negara", "Buah", "Profesi"};

        System.out.println("Kategori");
        for (int i = 0; i < category.length; i++) {
            System.out.println(i + 1 + ". " + category[i]);
        }

        System.out.println("Silahkan pilih kategori: ");
        String pilih = in.nextLine();
        System.out.println("");

        Random r = new Random();

        String chosen_word = "";
        char[] wordFound;
        int range;
        int maxLife = 6;
        boolean rightAns = false;
        switch (Integer.parseInt(pilih)) {
            case 1:
                String[] wl_negara = {"Indonesia", "Malaysia", "Singapura"};
                range = r.nextInt(wl_negara.length);
                chosen_word = wl_negara[range];
                wordFound = new char[chosen_word.length()];

                for (int i = 0; i < chosen_word.length(); i++) {
                    int rand = r.nextInt(2);
                    char c = chosen_word.charAt(i);
                    if (i == 0) {
                        System.out.print(c);
                        wordFound[i] = c;
                    } else if (i % 2 == rand) {
                        System.out.print(c);
                        wordFound[i] = c;
                    } else {
                        System.out.print("_");
                        wordFound[i] = '_';
                    }
                }
                System.out.println("");

                while (!rightAns && maxLife > 0) {
                    System.out.println("Masukkan huruf: ");
                    char guess = in.next().charAt(0);
                    String c = Character.toString(guess);
                    if (chosen_word.contains(c)) {
                        int index = chosen_word.indexOf(c);
                        while (index >= 0) {
                            wordFound[index] = c.charAt(0);
                            index = chosen_word.indexOf(c, index + 1);
                        }
                    } else {
                        maxLife--;
                        System.out.println("Jawaban salah! Sisa nyawa adalah " + maxLife);
                    }

                    if (chosen_word.contentEquals(new String(wordFound))) {
                        rightAns = true;
                        System.out.println(wordFound);
                        System.out.println("You win!");
                    } else if (maxLife > 0) {
                        System.out.println(wordFound);
                    } else {
                        System.out.println("You Lose!");
                    }
                }
                break;
            case 2:
                String[] wl_buah = {"Semangka", "Alpukat", "Rambutan"};
                range = r.nextInt(wl_buah.length);
                chosen_word = wl_buah[range];
                wordFound = new char[chosen_word.length()];

                for (int i = 0; i < chosen_word.length(); i++) {
                    int rand = r.nextInt(2);
                    char c = chosen_word.charAt(i);
                    if (i == 0) {
                        System.out.print(c);
                        wordFound[i] = c;
                    } else if (i % 2 == rand) {
                        System.out.print(c);
                        wordFound[i] = c;
                    } else {
                        System.out.print("_");
                        wordFound[i] = '_';
                    }
                }
                System.out.println("");
                while (!rightAns && maxLife > 0) {
                    System.out.println("Masukkan huruf: ");
                    char guess = in.next().charAt(0);
                    String c = Character.toString(guess);
                    if (chosen_word.contains(c)) {
                        int index = chosen_word.indexOf(c);
                        while (index >= 0) {
                            wordFound[index] = c.charAt(0);
                            index = chosen_word.indexOf(c, index + 1);
                        }
                    } else {
                        maxLife--;
                        System.out.println("Jawaban salah! Sisa nyawa adalah " + maxLife);
                    }

                    if (chosen_word.contentEquals(new String(wordFound))) {
                        rightAns = true;
                        System.out.println(wordFound);
                        System.out.println("You win!");
                    } else if (maxLife > 0) {
                        System.out.println(wordFound);
                    } else {
                        System.out.println("You Lose!");
                    }
                }
                break;
            case 3:
                String[] wl_profesi = {"Kuli", "Dokter", "Gamer"};
                range = r.nextInt(wl_profesi.length);
                chosen_word = wl_profesi[range];
                wordFound = new char[chosen_word.length()];

                for (int i = 0; i < chosen_word.length(); i++) {
                    int rand = r.nextInt(2);
                    char c = chosen_word.charAt(i);
                    if (i == 0) {
                        System.out.print(c);
                        wordFound[i] = c;
                    } else if (i % 2 == rand) {
                        System.out.print(c);
                        wordFound[i] = c;
                    } else {
                        System.out.print("_");
                        wordFound[i] = '_';
                    }
                }
                System.out.println("");

                while (!rightAns && maxLife > 0) {
                    System.out.println("Masukkan huruf: ");
                    char guess = in.next().charAt(0);
                    String c = Character.toString(guess);
                    if (chosen_word.contains(c)) {
                        int index = chosen_word.indexOf(c);
                        while (index >= 0) {
                            wordFound[index] = c.charAt(0);
                            index = chosen_word.indexOf(c, index + 1);
                        }
                    } else {
                        maxLife--;
                        System.out.println("Jawaban salah! Sisa nyawa adalah " + maxLife);
                    }

                    if (chosen_word.contentEquals(new String(wordFound))) {
                        rightAns = true;
                        System.out.println(wordFound);
                        System.out.println("You win!");
                    } else if (maxLife > 0) {
                        System.out.println(wordFound);
                    } else {
                        System.out.println("You Lose!");
                    }
                }
                break;
            default:
                System.out.println("Silahkan pilih 1-3");
                break;
        }

    }
}
