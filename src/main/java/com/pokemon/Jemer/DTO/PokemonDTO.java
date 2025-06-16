package com.pokemon.Jemer.DTO;

import java.util.List;

public class PokemonDTO {

	private String nombre;
    private String imagen;
    private List<String> tipos;  
    
    
    
	public PokemonDTO() {
		super();
	}

	public PokemonDTO(String nombre, String imagen, List<String> tipos) {
		super();
		this.nombre = nombre;
		this.imagen = imagen;
		this.tipos = tipos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public List<String> getTipo() {
		return tipos;
	}

	public void setTipos(List<String> tipos) {
		this.tipos = tipos;
	}

	
	
	
	
}
