# 📋 Lista de Usuarios - Spring Boot + Thymeleaf

Este proyecto es una aplicación web desarrollada con **Spring Boot** y **Thymeleaf** que muestra una lista de usuarios (nombre, apellido y correo electrónico) en una tabla HTML.

---

## 🚀 Tecnologías utilizadas

- Java 17 o superior (compatible con Java 21 o 23)
- Spring Boot 3.x
- Thymeleaf
- Maven

---

## 📂 Estructura del proyecto
Spirit-Boot-main/
└── Spirit-Boot-main/
    └── user-list-springboot/
        ├── src/
        │   ├── main/
        │   │   ├── java/
        │   │   │   └── com/actividadas13/springboot/web/user_list_springboot/
        │   │   │       ├── Controller/                  # Controladores (Manejan peticiones HTTP)
        │   │   │       ├── Modelos/                     # Entidades/Modelos de datos
        │   │   │       ├── Service/                     # Lógica de negocio
        │   │   │       └── UserListSpringbootApplication.java  # Clase principal de Spring Boot
        │   │   └── resources/
        │   │       ├── static/Css/                      # Archivos CSS estáticos
        │   │       ├── templates/                       # Plantillas Thymeleaf (HTML)
        │   │       └── application.properties           # Configuración de la aplicación
        │   └── test/
        │       └── java/
        │           └── com/actividadas13/springboot/web/user_list_springboot/
        │               └── UserListSpringbootApplicationTests.java  # Pruebas unitarias
        ├── target/                                      # Archivos compilados (generado automáticamente)
        │   ├── classes/                                 # Clases compiladas
        │   └── test-classes/                            # Clases de prueba compiladas
        ├── mvnw                                         # Script Maven para Unix/Linux
        ├── mvnw.cmd                                     # Script Maven para Windows
        └── pom.xml                                      # Configuración de dependencias de Maven
