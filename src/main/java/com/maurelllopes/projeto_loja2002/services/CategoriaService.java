package com.maurelllopes.projeto_loja2002.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maurelllopes.projeto_loja2002.domain.Categoria;
import com.maurelllopes.projeto_loja2002.repositories.CategoriaRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CategoriaService {
 	@Autowired
 	private CategoriaRepository repo; 


 	public Categoria buscar(Integer id) throws ObjectNotFoundException {
 		Optional<Categoria> obj = repo.findById(id); 
 		return obj.orElseThrow(() -> new ObjectNotFoundException(
 				"OBJETO NÃO ENCONTRADO! Id: " + id + ", TIPO: " + Categoria.class.getName()));


 	}

}
