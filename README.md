# 🐱‍🏍 Desafío Técnico - Backend Java Jr

## 📌 Descripción

Este proyecto consiste en una aplicación desarrollada con **Spring Boot** que expone un endpoint para consultar información de Pokémon utilizando la [PokeAPI](https://pokeapi.co/).  
El objetivo principal es demostrar el consumo de una API externa y el uso básico de Spring Boot.

---

## 🚀 Funcionalidad principal

- **GET `/pokemon/{name}`**  
  Consulta un Pokémon por su nombre y devuelve:
  - ✅ Nombre
  - ✅ Imagen (`front_default`)
  - ✅ Tipos (por ejemplo: `agua`, `fuego`, etc.)

Ejemplo de respuesta:

```json
{
  "nombre": "squirtle",
  "imagen": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/7.png",
  "tipo": ["water"]
}
```

---

## 🧠 Extras implementados

- 💾 **Registro de búsquedas**: cada consulta se guarda en el archivo `busquedas.txt`, incluyendo la fecha y hora.
- 📄 **Swagger UI**: la documentación del endpoint se encuentra disponible en:  
  👉 `http://localhost:8080/swagger-ui/index.html`

---

## 🛠️ Tecnologías usadas

- Java 17  
- Spring Boot  
- Maven  
- Swagger (SpringDoc OpenAPI)  
- PokeAPI

---

## ▶️ Cómo ejecutar la app

1. Cloná el repositorio:
   ```
   git clone https://github.com/CiroM77/Jemer-Java-
   ```

2. Ingresá al proyecto:
   ```
   cd Jemer
   ```

3. Ejecutá la aplicación:
   ```
   ./mvnw spring-boot:run
   ```

4. Accedé al endpoint:
   ```
   GET http://localhost:8080/pokemon/{nombre}
   ```

5. Documentación Swagger:
   ```
   http://localhost:8080/swagger-ui/index.html
   ```

---

## 📁 Estructura del proyecto

- `model/` → Clases que representan el JSON de la PokeAPI  
- `dto/` → Objeto intermedio que devuelve el endpoint  
- `service/` → Lógica para consumir la API y construir la respuesta  
- `controller/` → Controlador con el endpoint `/pokemon/{name}`  
- `Almacenamiento.java` → Clase que guarda búsquedas en `busquedas.txt`

---
