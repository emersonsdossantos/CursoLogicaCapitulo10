package exercicio01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01B {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		String tarefa;
		int i = 0;
		
		while (true) {
			System.out.print("Tarefa " + (i + 1) + " :");
			tarefa = scanner.nextLine();
			
			if("x".equalsIgnoreCase(tarefa)) {
				break;
			}
			linhas.add(tarefa);
			i++;			
		}
		
		System.out.println("Fim");
		
		scanner.close();
				
		Path arquivo = Paths.get("C:\\Users\\emers\\Documents\\workspaces\\algaworks\\CursoLogicaCapitulo10/arquivo2.txt");
		Files.write(arquivo, linhas);
		
	}

}
