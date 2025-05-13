# Prueba Técnica QA Automatizador

Este repositorio contiene la solución a la prueba técnica presentada para el rol de QA Automatizador para Inetum.

---

## ✅ Tecnologías utilizadas

- Java 17
- Maven
- Serenity BDD `4.2.16`
- Selenium WebDriver `4.28.0`
- JUnit 4
- Cucumber
- GitHub Actions para CI/CD
- Jmeter ( prueba de redimiento basica)
- OWASP ZAP (escaneo básico)

---

## 📦 Estructura del proyecto

```text
src
├── main
│   └── java
│       └── com.pruebaAutomatizacion.pages
├── test
│   └── java
│       └── com.pruebaAutomatizacion.stepdefinitions
│       └── com.pruebaAutomatizacion.runners
│   └── resources
│       └── features
.github
└── workflows
    └── serenity-tests.yml
```

---

## 🧪 Pruebas implementadas

### Funcionalidad: Web Tables - DemoQA

Se implementaron tres escenarios automatizados:

1. **Buscar usuario por nombre** existente.
2. **Eliminar un usuario existente** de la tabla.
3. **Editar usuario existente**

Los pasos están definidos en archivos `.feature` siguiendo el lenguaje Gherkin, y sus respectivos `StepDefinitions`.

---

## 🚀 Ejecución local

### Requisitos:
- Java 17
- Maven

### Comando:

```bash
mvn clean verify serenity:aggregate
```

El reporte de pruebas estará disponible en:

```
target/site/serenity/index.html
```

---
## ⚡ Prueba de rendimiento con JMeter

Se creó un plan de pruebas básico con **Apache JMeter** para validar la respuesta de la aplicación DemoQA ante una solicitud HTTP.

- Escenario: realizar una solicitud GET a `https://demoqa.com/webtables`
- Archivo JMeter: `demoqa-test-plan.jmx`
- Resultado: la página respondió con éxito en tiempos razonables bajo carga mínima (1 hilo, 1 iteración)
- Se adjunta archivo .jmx en los entregables

---
## ⚙️ CI/CD con GitHub Actions

Cada push a la rama `main` ejecuta automáticamente los escenarios de prueba y genera el reporte de Serenity. Puedes revisar los resultados en la pestaña **Actions** del repositorio.

---

## 🔒 Escaneo de seguridad básico (OWASP ZAP)

Se realizó un escaneo básico sobre `https://demoqa.com/webtables` utilizando OWASP ZAP (modo automático).

### Hallazgos comunes:

- Faltan cabeceras de seguridad (`X-Frame-Options`, `Content-Security-Policy`)
- Las cookies no tienen la bandera `Secure` ni `HttpOnly`
- No se detectaron vulnerabilidades críticas
- Se adjunta el reporte completo en zap-report.pdf


---

## 📁 Reportes

El reporte de Serenity se genera automáticamente en cada ejecución y puede abrirse desde:

```
target/site/serenity/index.html
```

---

## 👨‍💻 Autor

Hernando Molina  
[GitHub](https://github.com/hernandomolina)
