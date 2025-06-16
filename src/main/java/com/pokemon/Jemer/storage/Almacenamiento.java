package com.pokemon.Jemer.storage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;


public class Almacenamiento {
	
	
    private static Almacenamiento instancia;
	private final List<String> nombres = new ArrayList<>();
    private final File archivo = new File("busquedas.txt");
	
    private Almacenamiento() {
        cargar();
    }

    public static synchronized Almacenamiento obtenerInstancia() {
        if (instancia == null) instancia = new Almacenamiento();
        return instancia;
    }
    
	 public void guardar(String nombre) {
	        nombres.add(nombre);
	        String fechaHora = LocalDateTime.now().toString();
	        try (FileWriter escritor = new FileWriter(archivo, true)) {
	            escritor.write(nombre + " - " + fechaHora + "\n");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    private void cargar() {
	        if (!archivo.exists()) return;
	        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
	            String linea;
	            while ((linea = lector.readLine()) != null) {
	                nombres.add(linea);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public List<String> buscarTodas() {
	        return new ArrayList<>(nombres);
	    }
	
}
