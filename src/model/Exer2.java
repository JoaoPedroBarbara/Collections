package model;

import java.util.ArrayList;
import java.util.Scanner;

import controller.Aluno;

public class Exer2 
{
	ArrayList<Aluno> misc;
	Scanner sc = new Scanner(System.in);
	
	public Exer2()
	{
		misc = new ArrayList();
		loadMockupDataEx2();
		visualizarData();
	
	}
	
	
	public void loadMockupDataEx2()
	{
			Aluno alu;
			System.out.println("\nExercicio 2 \n");
			for(int i = 0; i < 3; i++)
			{
				System.out.println("Introduza o nome, a nota e o contacto do aluno.");
				alu = new Aluno(new Scanner(System.in).nextLine(), sc.nextInt(), new Scanner(System.in).nextLine());
				
				misc.add(alu);
			}
		
		
	
	}
	
	public void visualizarData()
	{
		for(int i = 0; i < 3; i++)
		{
			Aluno primeiro = (Aluno) misc.get(i);
			System.out.print("\n"+primeiro.getNome() + "\n");
			System.out.print(primeiro.getNota() + "\n");
			System.out.print(primeiro.getContacto() + "\n");
			
			
		}
		
		
	}

}
