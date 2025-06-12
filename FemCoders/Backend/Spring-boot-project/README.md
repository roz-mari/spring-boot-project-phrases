# Inspirational Phrases API

This is a simple RESTful API built with Spring Boot and MySQL. It allows users to manage a collection of inspirational phrases.

## Features

- View all phrases
- Add a new phrase
- Edit an existing phrase
- Delete a phrase
- Get a phrase by its ID

## Technologies Used

- Java 21
- Spring Boot 3.5.0
- Spring Data JPA
- MySQL
- Maven
- IntelliJ IDEA
- Git & GitHub

## Database Schema

Database: `phrases`  
Table: `quotes`

Fields:
- `id` (Long, auto-generated)
- `text` (String) — the phrase text
- `author` (String) — the author of the phrase

## API Endpoints

Base URL: `http://localhost:8080/phrases`

| Method | Endpoint          | Description              |
|--------|-------------------|--------------------------|
| GET    | `/phrases`        | Get all phrases          |
| GET    | `/phrases/{id}`   | Get phrase by ID         |
| POST   | `/phrases`        | Add a new phrase         |
| PUT    | `/phrases/{id}`   | Update a phrase          |
| DELETE | `/phrases/{id}`   | Delete a phrase          |

## Example JSON Body for POST/PUT

```json
{
  "text": "The only limit to our realization of tomorrow is our doubts of today.",
  "author": "Franklin D. Roosevelt"
}