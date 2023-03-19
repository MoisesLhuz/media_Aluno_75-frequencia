package com.mycompany.media_aluno_freq75;

import java.util.Scanner;

public class Media_aluno_freq75 {
    public static double calculo_carga_horaria(double carga){
        double calcCarga = carga * 0.75;                
        return calcCarga;
    }
    public static float calculo_media(float a, float b, float c) {
        float media = (a+b+c)/3;
        return media;        
    }
    public static void main(String[] args) {
        //declaração de variaveis
        String name;
        float n1, n2, n3;
        float media;        
        int carga, horasAluno;
        double cargaPRoc;
        
        //abrindo acesso teclado
        Scanner teclado = new Scanner(System.in);
        
        //solicitando dados
        System.out.println("Digite o Nome do Aluno(a): ");
        name = teclado.nextLine();
        System.out.println("Digite o Total da Carga Horária do Curso: ");
        carga = teclado.nextInt();
        System.out.println("[1] Para Calcular Frequência em Horas que o Aluno Frequentou\n[2] para Calcular com as Faltas do Aluno: ");
        int opc = teclado.nextInt();
        
        if (opc == 1) {
            System.out.println("Digite a Quantidade em Horas que o Aluno Frequentou: ");
            horasAluno = teclado.nextInt();
            //passagem de parametro
            cargaPRoc = calculo_carga_horaria(carga);
            //estrutura de decisão Eliminativa
            if(horasAluno <= cargaPRoc){
                System.out.println("O(a) Aluno(a) " +name+ " foi Reprovado!! Frequência inferior a 75%");
            }else{
                System.out.println("Digite a Primeira Nota do Aluno(a): ");
                n1 = teclado.nextFloat();
                System.out.println("Digite a Segunda Nota do Aluno(a): ");
                n2 = teclado.nextFloat();
                System.out.println("Digite a Terceira Nota do Aluno(a): ");
                n3 = teclado.nextFloat();
            
                //passagem de parâmetro
                media = calculo_media(n1, n2, n3);
            
                //estrutura decisão final
                if(media > 7){
                    System.out.println("O(a) Aluno(a) "+name+" foi Aprovado!! Média: "+media+" Frequência superior a 75%");
                }else if(media >= 5){
                    System.out.println("O(a) Aluno(a) "+name+" foi para Verificação Suplementar!! Média: "+media);
                }else{
                    System.out.println("O(a) Aluno(a) "+name+" foi REPROVADO!! Média: "+media);
                }
            }
        } else{
            System.out.println("Digite a Quantidade de Faltas do Aluno: ");
            horasAluno = teclado.nextInt();
            horasAluno = horasAluno * 4;
            if(horasAluno > 10){
                System.out.println("O(a) Aluno(a) " +name+ " foi Reprovado!! Frequência inferior a 75%");
            }else{
                System.out.println("Digite a Primeira Nota do Aluno(a): ");
                n1 = teclado.nextFloat();
                System.out.println("Digite a Segunda Nota do Aluno(a): ");
                n2 = teclado.nextFloat();
                System.out.println("Digite a Terceira Nota do Aluno(a): ");
                n3 = teclado.nextFloat();
            
                //passagem de parâmetro
                media = calculo_media(n1, n2, n3);

                //estrutura decisão final
                if(media > 7){
                    System.out.println("O(a) Aluno(a) "+name+" foi Aprovado!! Média: "+media+" Frequência superior a 75%");
                }else if(media >= 5){
                    System.out.println("O(a) Aluno(a) "+name+" foi para Verificação Suplementar!! Média: "+media);
                }else{
                    System.out.println("O(a) Aluno(a) "+name+" foi REPROVADO!! Média: "+media);
                }
            }
        }
       
        teclado.close();
    }
}