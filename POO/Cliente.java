package Arraylist;

import java.util.*;

public class Cliente {
	
	public void cliente() {
		
		ArrayList<String> clientes = new ArrayList<String>();
		clientes.add("Paulo");
		clientes.add("Tereza");
		clientes.add("João");
		clientes.add("Maria");
		if (clientes.contains("Maria")) {
		clientes.remove(1);	
		}
		System.out.println(clientes);
	}
}
