echo "# Qinko CRUD API

A Spring Boot application that provides RESTful CRUD operations for managing Qinko entities.

## Features

- Create, Read, Update, and Delete Qinkos
- RESTful API endpoints
- H2 in-memory database
- Sample data initialization

## API Endpoints

- GET /api/qinkos - Get all Qinkos
- GET /api/qinkos/{id} - Get a specific Qinko
- POST /api/qinkos - Create a new Qinko
- PUT /api/qinkos/{id} - Update a Qinko
- DELETE /api/qinkos/{id} - Delete a Qinko

## Technologies

- Spring Boot 3.2.4
- Spring Data JPA
- H2 Database
- Maven
- Java 17

## How to Run

1. Clone this repository
2. Navigate to the project directory
3. Run \`mvn spring-boot:run\`
4. Access the application at http://localhost:8080
" > README.md

git add README.md
git commit -m "Add README.md"
git push
