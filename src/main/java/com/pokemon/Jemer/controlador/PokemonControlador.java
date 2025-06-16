package com.pokemon.Jemer.controlador;

import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokemon.Jemer.DTO.PokemonDTO;
import com.pokemon.Jemer.servicios.PokemonServicio;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/pokemon")
public class PokemonControlador {

	
	 private final PokemonServicio servicio;
	 public PokemonControlador(PokemonServicio servicio) {
		 this.servicio = servicio;
	 }
	    @Operation(summary = "Obtener Pokémon por nombre")
	    @GetMapping(value = "/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
	    public PokemonDTO getPokemon(@PathVariable String nombre) {
	        return servicio.buscarPorNombre(nombre.toLowerCase());
	    }
	}

