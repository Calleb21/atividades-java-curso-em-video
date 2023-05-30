package com.mycompany.exercicioaula02;

public class ExercicioAula02 {

    public static void main(String[] args) {
        
        FoneDeOuvido fone1 = new FoneDeOuvido();
        
        fone1.cor = "Azul";
        fone1.nome = "Builds Live";
        fone1.modelo = "Samsung";
        fone1.bateria = 10;
        fone1.doisToque = true;
        fone1.seguraSensorPor5Segundos = false;
        
        fone1.ligar();
        fone1.desligar();
        fone1.play();
        fone1.status();
    }
}
