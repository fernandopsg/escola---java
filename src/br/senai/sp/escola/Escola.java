package br.senai.sp.escola;

import com.sun.source.tree.WhileLoopTree;

import java.awt.*;
import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {

        /** Declara Variaveis*/
        String nomeAluno;
        String disciplina;
        String professor;
        int frequencia;
        int nota1;
        int nota2;
        float mediaAluno;
        String Situacaoaluno;
        boolean continuar = true;



        /** instanciar o teclado*/
        Scanner teclado = new Scanner(System.in);

        while (continuar) {

            /** coleta dados*/
            System.out.println("-------------------------");

            System.out.println("ola professor, qual seu nome?");
            professor = teclado.nextLine();
            System.out.println("Informe o nome do aluno");
            nomeAluno = teclado.nextLine();
            System.out.println("informe sua disciplina:");
            disciplina = teclado.nextLine();
            System.out.println("Informe a frequencia do aluno");
            frequencia = teclado.nextInt();
            System.out.println("Informe a nota1");
            nota1 = teclado.nextInt();
            System.out.println("Informe nota 2");
            nota2 = teclado.nextInt();
            System.out.println("--------------------------------------");

            /** avaliação do aluno*/


            boolean validacao = ("vitor".equalsIgnoreCase(professor));
            System.out.println(validacao);

            mediaAluno = (nota1 + nota2) / 2;

            System.out.println(mediaAluno);

            if (mediaAluno >= 7 && frequencia >= 75 && !validacao || mediaAluno >= 6 && frequencia >= 90 && !validacao) {
                System.out.println("Aluno aprovado !");

            } else {
                System.out.println("Aluno Reprovado !!");
            }

            /** relatorio*/
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
            System.out.println("nome do aluno: " + nomeAluno);
            System.out.println("sua disciplina: " + disciplina);
            System.out.println("media do aluno: " + mediaAluno);
            System.out.println("frequencia do aluno: " + frequencia);
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");

        }{
System.out.println("deseja cadastrar outro aluno?");
String respProf = teclado.nextLine();
    if (respProf.equalsIgnoreCase("nao")) {
        continuar = false;
    }




      }

    System.out.println("cadastros finalizados com sucesso" );
    }




}






