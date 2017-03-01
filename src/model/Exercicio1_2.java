package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1_2
{
	ArrayList misc;
	ArrayList misc2;
	Scanner sc = new Scanner(System.in);
	

	public Exercicio1_2() 
	{
		
		misc2 = new ArrayList<>();
		
		loadMockupDataEx2();
		visualizarData();
		
	}
	
	

	
	public void loadMockupDataEx2()
	{
		System.out.println("Exercicio 1.2 \n");
		System.out.println("Introduza um valor inteiro.");
		misc2.add(sc.nextInt());
		
		
	}
	
	public void visualizarData()
	{
		for(int i = 0; i < misc2.size(); i++)
		{
			System.out.println(misc2.get(i));
		}
		
	}
	

}