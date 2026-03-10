package br.com.fiapride.main;

import br.com.fiapride.model.Teclado;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Teclado teclado1 = new Teclado();
        teclado1.luzLayout = "ABNT2";
        teclado1.mudarCorLed = "Verde";
        teclado1.larguraEmCm = 44;
        teclado1.quantidadeTeclas = 61;
        teclado1.alturaEmCm = 5;

        System.out.println("--- Estado inicial do teclado ---");
        teclado1.exibirInformacoes();

        System.out.println("\n--- Teste com valor válido ---");
        teclado1.alterarCorLed("Azul");
        teclado1.alterarQuantidadeTeclas(87);
        teclado1.exibirInformacoes();

        System.out.println("\n--- Teste com valor inválido ---");
        teclado1.alterarCorLed("");
        teclado1.alterarQuantidadeTeclas(-10);
        teclado1.exibirInformacoes();
    }
}