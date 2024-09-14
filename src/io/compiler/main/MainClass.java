package io.compiler.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import io.compiler.core.antrl.UFABCGrammarLexer;
import io.compiler.core.antrl.UFABCGrammarParser;
import io.compiler.core.ast.Program;

public class MainClass {
	public static void main(String[] args) {
		try {
			UFABCGrammarLexer lexer;
			UFABCGrammarParser parser;
			
			// crio o analisador léxico a partir da leitura de um arquivo
			lexer = new UFABCGrammarLexer(CharStreams.fromFileName("program.in"));
			
			// agora a partir do analisador lexico, obtenho um fluxo de tokens
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			
			// crio o parser a partir do tokenStream
			parser = new UFABCGrammarParser(tokenStream);
			
			
	
			parser.programa();
		


			/* vou deixar aqui a geracao do codigo do programa*/
			Program program = parser.getProgram();
			
			try {
				File f = new File(program.getName()+".java");
				FileWriter fr = new FileWriter(f);
				PrintWriter pr = new PrintWriter(fr);
				pr.println(program.generateTarget());
				pr.close();
			}
			catch (IOException ex) {
				ex.printStackTrace();
			}
			
			for(var s : program.getSymbolTable().values()) {
				if(!s.isInitialized()) {
					System.out.println("Aviso: A variável "+ s.getId() + " foi declarada e não está sendo usada" );
				}
			}
			
		}
		catch(Exception ex) {
			System.err.println("Error: "+ex.getMessage());
			//ex.printStackTrace();
		}
	}
}
