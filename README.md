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
# 🚀 user-list-springboot - Aplicación Spring Boot con Thymeleaf

Estructura del proyecto:

```bash
user-list-springboot/
├── src/
│   ├── main/
│   │   ├── java/com/actividadas13/springboot/web/user_list_springboot/
│   │   │   ├── Controller/                  # 🎮 Controladores (Manejan endpoints)
│   │   │   ├── Modelos/                     # 🏗️  Entidades de datos
│   │   │   ├── Service/                     # ⚙️ Lógica de negocio
│   │   │   └── UserListSpringbootApplication.java  # 🚀 Clase principal
│   │   └── resources/
│   │       ├── static/css/                  # 🎨 Estilos CSS
│   │       ├── templates/                   # 📄 Plantillas Thymeleaf
│   │       └── application.properties       # ⚙️ Configuración
│   └── test/                               # 🧪 Pruebas unitarias
├── target/                                 # 🏗️  Artefactos generados
├── pom.xml                                 # 📦 Dependencias Maven
└── README.md                               # 📌 Este archivo
