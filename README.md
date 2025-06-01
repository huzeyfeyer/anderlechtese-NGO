# Anderlechtse NGO Webapp

Deze webapplicatie is een prototype voor een ngo in Anderlecht die zich inzet voor gemeenschapsvorming en hulp aan mensen met minder middelen. De applicatie is gemaakt in het kader van een schoolopdracht (Java Spring + Thymeleaf).

---

##  Functionaliteit

-  Overzicht van evenementen (laatste 10)
-  Nieuw evenement toevoegen via formulier
-  Detailpagina per evenement
-  Over ons-pagina (statisch)
-  Gebruik van `Event` en `Location` modellen met relatie

---

##  Gebruikte technologieën

- Java 17
- Spring Boot 3.5.0
- Spring Web, Spring Data JPA
- Thymeleaf (voor frontend templates)
- MySQL (voor persistente opslag)
- Maven (build tool)

---

##  Installatie & Starten

1. **Project clonen**

```bash
git clone https://github.com/huzeyfeyer/anderlechtese-NGO.git
cd anderlechtese-NGO
```

2. **Database aanmaken in MySQL**

```sql
CREATE DATABASE evenementen;
```

3. **Pas je `application.properties` aan**

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/evenementen
spring.datasource.username=root
spring.datasource.password=test1234
spring.jpa.hibernate.ddl-auto=update
```

4. **Start de app**

```bash
./mvnw spring-boot:run
```

Toegang tot de applicatie via `http://localhost:8080`

---

##  Voorbeelddata

Gebruik `/new` om test-evenementen toe te voegen. Vul daarbij een geldige locatie in.

---

##  Gebruikte bronnen

### AI & hulpmiddelen

- **ChatGPT**:
    - Hulp bij foutmeldingen (`Spring Boot 500 error`, `JPA bidirectional mapping`, Thymeleaf fouten)
    - Uitleg van repository methodes zoals `findTop10ByOrderByIdDesc()`
    - Opbouw controller logica met `@GetMapping`, `@PostMapping`
    - Validatie en debug tips (`ifPresent`, `.get()` vermijden, etc.)
    - Voorstel van commits op logische momenten
    - README.md aan te maken

- **Terminal van IntelliJ**: gebruikt voor alle `git`- en `mvnw`-commando’s (`git init`, `git commit`, `git push`, `./mvnw spring-boot:run`, `CTRL+C`, ...)

- **StackOverflow**: voor foutoplossingen zoals `Communications link failure`, `JDBC Dialect error`, `TemplateInputException`

- **Spring Boot officiële documentatie**

### Tutorials & Voorbeelden

- **Vorige klasopdrachten**: structuur van DAO, models en services
- **Voorbeeldcode van les**

