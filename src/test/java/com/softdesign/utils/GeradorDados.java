package com.softdesign.utils;

import java.util.Random;

public class GeradorDados {
    Random valorAleatorio = new Random();

    public String geradorNomeCadastro() {
        String[] listaNomes = {"Augusto", "Erick", "Isaac", "Breno", "Felipe", "João", "Bruno", "Fernando"};

        return listaNomes[valorAleatorio.nextInt(listaNomes.length)];
    }

    public String geradorSobrenomeCadastro() {
        String[] listaSobrenomes = {"Almeida", "Alves", "Andrade", "Barbosa", "Barros", "Batista",
                "Campos", "Cardoso", "Carvalho", "Dias"};

        return listaSobrenomes[valorAleatorio.nextInt(listaSobrenomes.length)];
    }

    public Integer geradorValorValidoCadastro() {
        return (int) ((Math.random() * (20000 - 100)) + 100);
    }

    public Boolean geradorDepositoPagoCadastro() {
        return valorAleatorio.nextBoolean();
    }

    public String geradorNecessidadesCadastro() {
        String[] listaNomes = {"Café da manhã", "Estacionamento", "Chave extra", "TV", "Frigobar"};

        return listaNomes[valorAleatorio.nextInt(listaNomes.length)];
    }
}
