package secao15.exemplos;

import java.io.*;
import java.nio.file.*;

public class SummaryExemple15 {
    public static void main(String[] args) {
        // Caminho da pasta e do arquivo
        Path pasta = Paths.get("dados");
        Path arquivo = pasta.resolve("exemplo.txt");

        // 1. Criar a pasta se não existir
        try {
            if (Files.notExists(pasta)) {
                Files.createDirectories(pasta);
                System.out.println("Pasta criada: " + pasta.toAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Erro ao criar pasta: " + e.getMessage());
            return;
        }

        // 2. Escrever no arquivo com BufferedWriter e try-with-resources
        try (BufferedWriter writer = Files.newBufferedWriter(arquivo)) {
            writer.write("Olá, mundo!");
            writer.newLine();
            writer.write("Este é um exemplo simples de BufferedWriter.");
            System.out.println("Arquivo escrito com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
            return;
        }

        // 3. Ler o conteúdo do arquivo com BufferedReader e try-with-resources
        System.out.println("\nConteúdo do arquivo:");
        try (BufferedReader reader = Files.newBufferedReader(arquivo)) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
