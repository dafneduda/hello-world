package com.generation.helloworld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!!!";
	}

	@GetMapping("/bsm")
	public List<String> bsm() {
		List<String> bsmGeneration = new ArrayList<>();
		bsmGeneration.add("Comunicação");
		bsmGeneration.add("Orientação ao detalhe");
		bsmGeneration.add("Proatividade");
		bsmGeneration.add("Trabalho em equipe");
		bsmGeneration.add("Mentalidade de crescimento");
		bsmGeneration.add("Orientação ao futuro");
		bsmGeneration.add("Persistência");
		bsmGeneration.add("Responsabilidade pessoal");

		return bsmGeneration;
	}

	@GetMapping("/objetivos-semana")
	public List<String> objetivos() {
		List<String> objetivosSemana = new ArrayList<>();
		objetivosSemana.add("1- Revisar Banco de Dados com SQL.");
		objetivosSemana.add("2- Fazer os 6 exercícios propostos de Banco de Dados.");
		objetivosSemana.add("3- Revisar Introdução ao Spring.");
		objetivosSemana.add("4- Reler cookbook para fixar conteúdos da semana.");

		return objetivosSemana;
	}

}