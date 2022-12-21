package br.com.fuzus.gerenciador.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.fuzus.gerenciador.model.Empresa;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	
	static {
		Empresa empresa1 = new Empresa(1, "Alura");
		Empresa empresa2 = new Empresa(2, "Google");
		lista.addAll(Arrays.asList(empresa1, empresa2));
	}

	public void adicionar(Empresa empresa) {
		lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

}
