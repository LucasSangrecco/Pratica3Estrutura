package br.com.exercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) throws FileNotFoundException {

        Random random = new Random();
        Queue<Integer> show = new PriorityQueue<>();
        Scanner scanner =new Scanner(new File("show.txt"));

        while (scanner.hasNextLine()){
            show.add(Integer.parseInt(scanner.nextLine()));
        }

        for (int i=0; i<10; i++) {
            System.out.println(show.poll());
        }

        System.out.println(show);

        int sorteado=random.nextInt(show.size());

        show.remove(sorteado);

        System.out.println("Pessoa de Sorteada para conhecer a banda " + sorteado);
        System.out.println(show);
    }
}
