# 🤖 Bon-Bonite Automation

Proyecto de automatización de pruebas para el sitio web [Bon-bonite](https://www.bon-bonite.com), desarrollado como prueba técnica práctica.

---

## 🛠️ Stack Tecnológico

| Herramienta | Versión |
|---|---|
| Java | 21 |
| Serenity BDD | 4.1.20 |
| Selenium | 4.20.0 |
| Cucumber | 7.11.1 |
| WebDriverManager | 5.8.0 |
| Maven | 3.x |

---

## 📁 Estructura del Proyecto

```
src/
├── main/java/com/bonbonite/
│   ├── tasks/               # Tareas del patrón Screenplay
│   ├── questions/           # Preguntas/validaciones
│   └── userinterfaces/      # Locators de elementos UI
└── test/
    ├── java/com/bonbonite/
    │   ├── runners/          # TestRunner
    │   └── stepdefinitions/ # Step definitions de Cucumber
    └── resources/
        └── features/        # Escenarios Gherkin
```

---

## 🧪 Escenarios Automatizados

| # | Feature | Escenario | Tag |
|---|---|---|---|
| 1 | Navegación menú | Navegar al módulo Zapatos | @menu |
| 2 | Navegación menú | Navegar al módulo Bolsos | @menu |
| 3 | Navegación menú | Navegar al módulo Cinturones | @menu |
| 4 | Navegación menú | Navegar al módulo Accesorios | @menu |
| 5 | Registro de usuario | Registro exitoso de nuevo usuario | @registro |
| 6 | Actualización de datos | Actualizar datos del usuario registrado | @actualizar |

---

## ⚙️ Requisitos Previos

- **Java JDK 21** instalado
- **Maven** instalado (o usar el wrapper de IntelliJ)
- **Google Chrome** instalado (cualquier versión — WebDriverManager descarga el driver automáticamente)
- **IntelliJ IDEA** (recomendado)

---

## 🚀 Cómo Ejecutar

### Opción 1 — Desde IntelliJ IDEA (recomendado)

1. Clonar el repositorio:
```bash
git clone https://github.com/cordovabarbara/bon-bonite-automation.git
```

2. Abrir el proyecto en IntelliJ IDEA

3. Esperar que Maven descargue las dependencias automáticamente

4. Crear el archivo de credenciales `src/test/resources/test.properties`:
```properties
usuario.login=TU_CEDULA
usuario.password=TU_PASSWORD
```

5. En el panel de Maven → **Lifecycle** → doble clic en **`clean`** luego **`verify`**

### Opción 2 — Por Tags (correr solo un módulo)

En `TestRunner.java` agregar el tag deseado:
```java
@CucumberOptions(
    tags = "@menu"        // Solo navegación menú
    // tags = "@registro" // Solo registro
    // tags = "@actualizar" // Solo actualizar datos
)
```

---

## 📊 Ver Reporte de Serenity

Después de ejecutar con `mvn clean verify`, el reporte se genera automáticamente en:

```
target/site/serenity/index.html
```

Abrir con Chrome para ver resultados detallados con capturas de pantalla.

---

## ⚠️ Nota sobre Credenciales

El archivo `test.properties` está incluido en `.gitignore` por seguridad. Para ejecutar los escenarios de login y actualización de datos, debes crearlo manualmente con tus propias credenciales.

---

## 👩‍💻 Autora

**Barbara Anais Cordova Aliendo**  
QA Automation Analyst  
[GitHub](https://github.com/cordovabarbara)
