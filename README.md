# Waste_Sorting_App_Springboot

# Waste Categories Management System

## Overview
The Waste Categories Management System is a RESTful API designed to manage waste categories effectively. This system allows users to create, retrieve, update, and delete waste category records. It ensures smooth interaction with waste-related data, promoting better waste management practices.

## Features
- Add new waste categories with specific details.
- Retrieve a list of all available waste categories.
- Fetch details of a specific waste category by its ID.
- Delete a waste category.

## Technologies Used
- **Java 17**: Primary programming language.
- **Spring Boot 3.3.4**: Framework for building and running the application.
- **Hibernate**: ORM tool for database interactions.
- **H2 Database**: In-memory database used for development and testing.
- **Postman**: API testing tool.

## Project Structure
The project follows the MVC (Model-View-Controller) architecture:

1. **Model**
    - Represents the data structure and database entities.
    - Located in the `model` package.
    - Class: `WasteCategory`

2. **Controller**
    - Handles HTTP requests and maps them to service methods.
    - Located in the `controller` package.
    - Class: `WasteCategoryController`

3. **Service**
    - Contains the business logic for the application.
    - Located in the `service` package.
    - Class: `WasteCategoryService`

4. **DTO (Data Transfer Object)**
    - Facilitates the transfer of data between layers.
    - Located in the `dto` package.
    - Class: `WasteCategoryDTO`

## Endpoints
Below are the available API endpoints:

### 1. Create a Waste Category
- **URL**: `POST /api/waste-categories`
- **Request Body**:
  ```json
  {
    "categoryName": "Plastic",
    "disposalGuidelines": "Recycling or disposal in designated plastic bins",
    "recyclingTips": "Clean before recycling"
  }
  ```
- **Response**:
  ```json
  {
    "id": 1,
    "categoryName": "Plastic",
    "disposalGuidelines": "Recycling or disposal in designated plastic bins",
    "recyclingTips": "Clean before recycling"
  }
  ```

### 2. Retrieve All Waste Categories
- **URL**: `GET /api/waste-categories`
- **Response**:
  ```json
  [
    {
      "id": 1,
      "categoryName": "Plastic",
      "disposalGuidelines": "Recycling or disposal in designated plastic bins",
      "recyclingTips": "Clean before recycling"
    },
    {
      "id": 2,
      "categoryName": "Glass",
      "disposalGuidelines": "Use designated glass bins",
      "recyclingTips": "Avoid breaking glass before recycling"
    }
  ]
  ```

### 3. Retrieve a Waste Category by ID
- **URL**: `GET /api/waste-categories/{id}`
- **Example**:
    - **Request**: `GET /api/waste-categories/1`
    - **Response**:
      ```json
      {
        "id": 1,
        "categoryName": "Plastic",
        "disposalGuidelines": "Recycling or disposal in designated plastic bins",
        "recyclingTips": "Clean before recycling"
      }
      ```

### 4. Delete a Waste Category
- **URL**: `DELETE /api/waste-categories/{id}`
- **Example**:
    - **Request**: `DELETE /api/waste-categories/1`
    - **Response**: HTTP 204 No Content

## How to Run the Project
### Prerequisites
- Java 17 or higher
- Maven 3.8+
- IDE (e.g., IntelliJ IDEA, Eclipse)
- Postman (for API testing)

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/MbakzArr/Waste_Sorting_App_Springboot.git
   ```
2. Navigate to the project directory:
   ```bash
   cd waste-categories-management
   ```
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```
5. Access the application at `http://localhost:8080`.

### Testing the API
- Use Postman or any HTTP client to test the endpoints.
- Start with the `POST /api/waste-categories`
- Example: http://localhost:8080/api/waste-categories
- Use `GET` endpoints to fetch data.

## Example Data
Below is an example payload for creating a waste category:
```json
{
  "categoryName": "Metal",
  "disposalGuidelines": "Recycle or dispose in designated metal bins",
  "recyclingTips": "Ensure no paint or chemicals are left on the metal before recycling"
}
```

## Common Issues
1. **404 Not Found**:
    - Ensure the endpoint URL is correct (e.g., `/api/waste-categories` instead of `/api/wastecategories`).

2. **Empty Responses**:
    - Check the database or logs to confirm data persistence.

