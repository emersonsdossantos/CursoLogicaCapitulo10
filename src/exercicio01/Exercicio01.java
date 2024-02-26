package exercicio01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) throws IOException {
	Scanner scanner = new Scanner(System.in);
	
	String tarefa ="";
	
	System.out.println("**************** Lista de Atividade ****************");
	
	ArrayList<String> linhas = new ArrayList<String>();
	
	System.out.println("Informe as atividade e caso queira encerrar digite x");
	
	while(!tarefa.equalsIgnoreCase("x")) {
		System.out.print("Informe uma tarefa: ");
		tarefa = scanner.nextLine();
		linhas.add(tarefa);
	}
	
	System.out.println("Lista:");
	for(String lista : linhas) {
		System.out.println(lista);
	}
	
	System.out.println("Fim da Lista");
	
	Path arquivo = Paths.get("C:\\Users\\emers\\Documents\\workspaces\\algaworks\\CursoLogicaCapitulo09/arquivo.txt");
	Files.write(arquivo, linhas);
	
	scanner.close();

	}

}
