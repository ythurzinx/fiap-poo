package br.com.fiapride.model;

public class Teclado {

    public String luzLayout;
    public String mudarCorLed;
    public float larguraEmCm;
    public float alturaEmCm;
    public int quantidadeTeclas;

    public void exibirInformacoes() {
        System.out.println(
                "Layout: " + luzLayout +
                        " | Cor do Led: " + mudarCorLed +
                        " | Largura em CM: " + larguraEmCm +
                        " | Quantidade de Teclas: " + quantidadeTeclas +
                        " | Altura em CM: " + alturaEmCm
        );
    }

    public void alterarCorLed(String novaCor) {
        if (novaCor == null || novaCor.isEmpty()) {
            System.out.println("Erro: a cor do LED não pode ser vazia.");
        } else {
            mudarCorLed = novaCor;
            System.out.println("Cor do LED alterada para: " + mudarCorLed);
        }
    }

    public void alterarQuantidadeTeclas(int novaQuantidade) {
        if (novaQuantidade <= 0) {
            System.out.println("Erro: quantidade de teclas inválida.");
        } else {
            quantidadeTeclas = novaQuantidade;
            System.out.println("Quantidade de teclas alterada para: " + quantidadeTeclas);
        }
    }
}