# SimpleWebApp - Product REST API

A simple REST API built using Java and Spring Boot to manage products. This project demonstrates basic REST API operations and Spring Boot fundamentals.

## 🚀 Technologies Used

- Java 21
- Spring Boot
- Maven
- REST API
- Postman

## ✨ Features

- Retrieve all products
- Retrieve product by ID
- Add new products
- Delete products
- JSON-based API responses

## 📌 API Endpoints

| HTTP Method | Endpoint | Description |
|---|---|---|
| GET | `/products` | Get all products |
| GET | `/product/{proId}` | Get product by ID |
| POST | `/products` | Add a new product |
| DELETE | `/products/{prodId}` | Delete a product |

## 📦 Sample Product JSON

```json
{
  "prodId": 101,
  "prodName": "iPhone",
  "price": 50000
}
```

## ▶️ How to Run

1. Clone this repository.
2. Open the project in IntelliJ IDEA.
3. Ensure Java 21 is installed.
4. Run `SimpleWebAppApplication.java`.
5. The application starts at:

   `http://localhost:8080`

## 🛠️ Future Improvements

- Update Product API
- Database integration
- Exception handling
- Automatic product ID generation

---

**Developed by Harsh**
