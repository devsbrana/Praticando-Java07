package br.com.fiap.main;

import br.com.fiap.bean.Televisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o canal desejado: ");
        televisor.setCanal(scan.nextInt());
        System.out.print("Digite o volume desejado: ");
        televisor.setVolume(scan.nextInt());
        System.out.print("O que você deseja fazer? \n1-Definir outro canal? \n2-Definir novo volume? \n3-Aumentar o volume? \n4-Diminuir o volume? \n");
        int novaAcao = scan.nextInt();
        try {
            if (novaAcao == 1){
                System.out.print("Digite o novo canal: ");
                televisor.setCanal(scan.nextInt());
            } else if (novaAcao == 2) {
                System.out.print("Digite o novo volume: ");
                televisor.setVolume(scan.nextInt());
            } else if (novaAcao == 3) {
                televisor.aumentarVolume();
                System.out.print("Aumentando volume...");
            } else if (novaAcao == 4) {
                televisor.diminuirVolume();
                System.out.print("Diminuindo volume...");
            } else {
                System.out.print("Escolha uma opção válida!");
            }
            System.out.printf("O canal atual é: %d \nVolume atual é %d", televisor.getCanal(), televisor.getVolume());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}