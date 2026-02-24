package br.com.fiapride.main;

import br.com.fiapride.model.Teclado;

public class SistemaPrincipal {

    public static void main(String[] args) {
        Teclado teclado1 = new Teclado();
        teclado1.luzLayout = "ABNT2";
        teclado1.mudarCorLed = "Verde, Vermelho ou Azul";
        teclado1.larguraEmCm = 44;
        teclado1.quantidadeTeclas = 61;
        teclado1.alturaEmCm = 5;



        Teclado teclado2 = new Teclado();
        teclado2.luzLayout = "US";
        teclado2.mudarCorLed = "Ativar RBG?";
        teclado2.larguraEmCm = 50;
        teclado2.quantidadeTeclas = 84;
        teclado2.alturaEmCm = 8;


        System.out.println("--- Sistema FiapRide Teclados Novos ---");
        System.out.println("Layout: " + teclado1.luzLayout + " | Cor do Led: " + teclado1.mudarCorLed + " | Largura em CM: " + teclado1.larguraEmCm + " | Quantidade de Teclas: " + teclado1.quantidadeTeclas + " | Altura em CM: " + teclado1.alturaEmCm);
        System.out.println("Layout: " + teclado2.luzLayout + " | Cor do Led: " + teclado2.mudarCorLed + " | Largura: em CM" + teclado2.larguraEmCm + " | Quantidade de Teclas: " + teclado2.quantidadeTeclas + " | Altura em CM: " + teclado2.alturaEmCm);
    }
}