package com.mycompany.exercicioaula02;

public class FoneDeOuvido {
    
    String nome;
    String modelo;
    String cor;
    int bateria;
    boolean doisToque;
    boolean seguraSensorPor5Segundos;

    
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Cor: " + this.cor);
        System.out.println("Bateria: " + this.bateria);
    }
    
    void ligar() {
       if (this.bateria == 0) {
           System.out.println("O fone está descarregado");
       } else if (this.bateria > 0 && this.bateria <= 100 && this.seguraSensorPor5Segundos == false) {
           System.out.println("O fone está ligado.");
       } else {
           System.out.println("O fone está desligado.");
       }
   }
    
    void desligar() {
        if (this.seguraSensorPor5Segundos == true) {
            System.out.println("O fone foi desligado.");
        }
    }
    
    void play() {
        if(doisToque == true && this.seguraSensorPor5Segundos == false) {
            System.out.println("Você deu play na música.");
        } else {
            System.out.println("Você não deu play na música.");
        }
    }
}
