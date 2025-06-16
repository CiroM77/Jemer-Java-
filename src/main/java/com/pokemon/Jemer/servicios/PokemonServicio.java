package com.pokemon.Jemer.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.pokemon.Jemer.DTO.PokemonDTO;
import com.pokemon.Jemer.excepciones.NotFoundException;
import com.pokemon.Jemer.model.Pokemon;
import com.pokemon.Jemer.storage.Almacenamiento;

@Service
public class PokemonServicio {
	 	private final RestTemplate restTemplate = new RestTemplate();
	    private final Almacenamiento storage = Almacenamiento.obtenerInstancia();

	    public PokemonDTO buscarPorNombre(String nombre) {
	        try {
	            Pokemon p = restTemplate.getForObject(
	                "https://pokeapi.co/api/v2/pokemon/{name}", Pokemon.class, nombre);
	            
	            // mapear a DTO
	            
	            PokemonDTO dto = new PokemonDTO();
	            dto.setNombre(p.getNombre());
	            dto.setImagen(p.getSprites().getFrontDefault());
	            dto.setTipos(
	            		 Optional.ofNullable(p.getTipos())
	            	        .orElse(List.of()) // lista vacía si es null
	            	        .stream()
	            	        .filter(slot -> slot.getTipo() != null && slot.getTipo().getNombre() != null)
	            	        .map(slot -> slot.getTipo().getNombre())
	            	        .toList()                               
	            	);

	            storage.guardar(nombre);
	            return dto;
	        } catch (HttpClientErrorException.NotFound nf) {
	            throw new NotFoundException("Pokemon no encontrado: " + nombre);
	        }
	    }
}
