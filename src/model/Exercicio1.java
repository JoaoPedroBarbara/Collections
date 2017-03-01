package model;

import java.util.ArrayList;



public class Exercicio1 
{
	ArrayList misc;
	

	public Exercicio1() 
	{
		misc = new ArrayList();
		loadMockupDataEx1();
		visualizarData();
		
	}
	
	
	public void loadMockupDataEx1()
	{
		System.out.print("Exercicio 1.1 \n \n");
		misc.add("b");
		misc.add(3);
		misc.add("Carruagens");
		misc.add(8.6);
		misc.add("caixa de armazenamentos \n");
	}
	
	public void visualizarData()
	{
		
		for(int i = 0; i < misc.size(); i++)
		{
			System.out.println(misc.get(i));
		}
		
	}
	
	
	

}
