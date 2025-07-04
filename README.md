# Gestión de Incidencias - Cliente Service

![Java](https://img.shields.io/badge/Java-17-blue.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.2-brightgreen)
![Maven](https://img.shields.io/badge/Maven-3.9.6-orange)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.1.1.RELEASE-blueviolet)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

Aplicación web desarrollada con **Spring Boot** que gestiona una lista de clientes. Se muestra la información en una interfaz HTML utilizando **Thymeleaf**, aplicando estilos personalizados con CSS. Este proyecto sigue una estructura Maven estándar y está versionado con Git.

---

## 📌 Funcionalidades principales

- 🧠 Backend en **Java** con **Spring Boot**.
- 📋 Gestión de **clientes** (visualización en tabla).
- 🖼️ Plantillas **Thymeleaf** para renderizado HTML.
- 🎨 Estilos personalizados con **CSS**.
- 📁 Estructura organizada según **proyecto Maven**.
- 🗃️ Control de versiones con **Git**.

---

## 📂 Estructura del proyecto

```
GestionDeIncidencias/
│
├── src/
│   ├── main/
│   │   ├── java/com/miike96/gestiondeincidencias/
│   │   │   ├── GestionDeIncidenciasApplication.java   # Clase principal
│   │   │   ├── controller/
│   │   │   │   └── ClienteController.java             # Controlador web
│   │   │   ├── model/
│   │   │   │   └── Cliente.java                       # Clase modelo Cliente
│   │   │   └── service/
│   │   │       └── ClienteService.java                # Lógica de negocio
│   │   ├── resources/
│   │   │   ├── templates/
│   │   │   │   └── clientes.html                      # Plantilla HTML
│   │   │   └── static/css/
│   │   │       └── estilos.css                        # Estilo visual
│   └── test/
│       └── ... (pendiente de implementación)
│
├── pom.xml                                            # Dependencias Maven
└── README.md                                          # Documentación
```

---

## ⚙️ Tecnologías utilizadas

- **Java 17**
- **Spring Boot 3.1.2**
- **Maven 3.9.x**
- **Thymeleaf 3.1.x**
- **CSS3**
- **HTML5**
- **Git / GitHub**

---

## 🚀 Cómo ejecutar el proyecto

1. **Clona el repositorio**:

   ```bash
   git clone https://github.com/miike96/GestionDeIncidencias.git
   cd GestionDeIncidencias
   ```

2. **Compila el proyecto con Maven**:

   ```bash
   mvn clean install
   ```

3. **Ejecuta la aplicación**:

   ```bash
   mvn spring-boot:run
   ```

4. **Accede desde el navegador**:

   ```
   http://localhost:8080/clientes
   ```

---

## 🧩 Detalles por clase

### `GestionDeIncidenciasApplication.java`
- Punto de entrada de la aplicación.
- Arranca Spring Boot.

### `ClienteController.java`
- Controlador que mapea la ruta `/clientes`.
- Llama al `ClienteService` para obtener los datos.
- Envía los datos a la plantilla `clientes.html`.

### `ClienteService.java`
- Proporciona la lógica de negocio.
- Devuelve la lista de clientes (de momento estática).
- Preparado para futuras integraciones con base de datos.

### `Cliente.java`
- Modelo con los atributos: `nombre`, `email`, `telefono`.
- Incluye getters, setters y constructores.

### `clientes.html`
- Plantilla HTML con integración Thymeleaf.
- Muestra los datos del cliente en una tabla.

### `estilos.css`
- Define estilos personalizados para la vista HTML.

---

## 🧱 Futuras mejoras (roadmap)

- ✅ CRUD completo (Crear, Editar, Eliminar clientes).
- 🔜 Persistencia en base de datos (MySQL/PostgreSQL).
- 🔐 Seguridad con login (Spring Security + JWT).
- 🧪 Pruebas unitarias y de integración.
- 📄 Documentación con Swagger/OpenAPI.

---

## 📌 Repositorio

🔗 [https://github.com/miike96/GestionDeIncidencias](https://github.com/miike96/GestionDeIncidencias)

---

## 📜 Licencia

Este proyecto está bajo licencia **MIT**. Consulta el archivo `LICENSE` para más información.

---

## ✍️ Autor

**Miguel López**  
Desarrollador Java | Spring Boot | Frontend  
📫 [LinkedIn](https://www.linkedin.com/in/miguel-lopez96)