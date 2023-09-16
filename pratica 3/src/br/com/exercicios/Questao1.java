package br.com.exercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Questao1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner;
        Stack pilha = new Stack();
        scanner = new Scanner(new File("frases.txt"));

        while (scanner.hasNextLine()){
            pilha.push(scanner.nextLine());
        }
        System.out.println("Top 10 Frases");

        for (int i=0; i<10; i++){
            System.out.println(pilha.pop());
        }

        while (!pilha.empty()){
            pilha.pop();
        }

        System.out.println(pilha.size());
    }
}