package Desafios;

import java.util.Scanner;

public class variavel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("nome: ");
            nome = scan.next();
            if(nome.equals("0")) break;
            System.out.println("idade: ");
            idade = scan.nextInt();
        }
        System.out.println("continuando aqui");
    }
}