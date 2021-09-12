package com.maurelllopes.projeto_loja2002;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.maurelllopes.projeto_loja2002.domain.Categoria;
import com.maurelllopes.projeto_loja2002.repositories.CategoriaRepository;

@SpringBootApplication
public class ProjetoLoja2022Application implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoLoja2022Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		 
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
	}

}
