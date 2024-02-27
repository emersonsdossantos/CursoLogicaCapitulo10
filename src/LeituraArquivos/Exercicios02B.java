package LeituraArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercicios02B {

	public static void main(String[] args) throws IOException {
		
		List<String> linhas = lerArquivo("C:\\Users\\emers\\Documents\\workspaces\\algaworks\\CursoLogicaCapitulo10/arquivo2.txt");
		for(int i = 1; i < linhas.size(); i++) {
			String tarefa = linhas.get(i);
			System.out.println("Tarefa " + (i+1) +": " + tarefa);
		}
	}
	
	static List<String> lerArquivo(String arquivo) throws IOException{
		Path path = Paths.get(arquivo);
		return Files.readAllLines(path);
	}

}
