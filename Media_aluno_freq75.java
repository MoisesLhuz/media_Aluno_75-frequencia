package com.mycompany.media_aluno_freq75;

import java.util.Scanner;

public class Media_aluno_freq75 {
    public static int calculo_carga_horaria(int qtdDias){
        int freq = qtdDias * 4;
        return freq;
    }
    public static int calculo_media(int a,int b,int c) {
        int media = (a+b+c)/3;
        return media;        
    }
    public static void main(String[] args) {
        //declaração de variaveis
        String name;
        int n1, n2, n3, qdtDias, freq;
        int media;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o Nome do Aluno(a): ");
        name = teclado.nextLine();
        System.out.println("Digite a Quantidade de Dias que o Aluno Frequentou: ");
        qdtDias = teclado.nextInt();
        
        //passagem de parametro
        freq = calculo_carga_horaria(qdtDias);
        //estrutura de decisão Eliminativa
        if(freq < 30){
            System.out.println("O(a) Aluno(a) " +name+ " foi Reprovado!! Frequência inferior a 75%");
        }else{
            System.out.println("Digite a Primeira Nota do Aluno(a): ");
            n1 = teclado.nextInt();
            System.out.println("Digite a Segunda Nota do Aluno(a): ");
            n2 = teclado.nextInt();
            System.out.println("Digite a Terceira Nota do Aluno(a): ");
            n3 = teclado.nextInt();
            
            //passagem de parâmetro
            media = calculo_media(n1, n2, n3);
            
            //estrutura decisão final
            if(freq > 30 && media > 7){
                System.out.println("O(a) Aluno(a) "+name+" foi Aprovado!! Média: "+media+" Frequência superior a 75%");
            }
            if(media >= 5 && media <= 7){
                System.out.println("O(a) Aluno(a) "+name+" foi para Verificação Suplementar!! Média: "+media);
            }else{
                System.out.println("O(a) Aluno(a) "+name+" foi REPROVADO!! Média: "+media);
            }
        }
        teclado.close();
    }
}
