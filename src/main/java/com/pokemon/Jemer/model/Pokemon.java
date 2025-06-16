package com.pokemon.Jemer.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pokemon {
	
	@JsonProperty("name")
    private String nombre;
    @JsonProperty("sprites")
    private Sprites sprites;
    @JsonProperty("types")
    private List<TipoSlot> tipos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<TipoSlot> getTipos() {
        return tipos;
    }

    public void setTipos(List<TipoSlot> tipos) {
        this.tipos = tipos;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    public static class Sprites {
        @JsonProperty("front_default")
        private String frontDefault;

        public String getFrontDefault() {
            return frontDefault;
        }

        public void setFrontDefault(String frontDefault) {
            this.frontDefault = frontDefault;
        }
    }

    public static class TipoSlot {
    	
    	@JsonProperty("type")
        private Tipo tipo;

        public Tipo getTipo() {
            return tipo;
        }

        public void setTipo(Tipo tipo) {
            this.tipo = tipo;
        }

        public static class Tipo {
        	@JsonProperty("name")
            private String nombre;

            public String getNombre() {
                return nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }
        }
    }
}

