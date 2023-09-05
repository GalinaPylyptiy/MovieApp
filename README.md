# Movie Database RESTful API

This is a RESTful API for a movie database built using Spring Boot, Hibernate, and MongoDB as the non-relational database. 
It allows users to perform CRUD operations on movies, actors, and directors. Movies have attributes such as title, release date,
runtime, and associated actors and directors. Users can also search for movies by title or release date.

## Technologies Used

- Spring Boot
- Spring Data MongoDB
- MongoDB (as the non-relational database)
- Hibernate
- Java

## Prerequisites

Before running the application, make sure you have the following installed on your system:

- Java Development Kit (JDK) 8 or later
- Docker (for running MongoDB in a container)
- Maven or Gradle (for building the application)

## Running the Application

### Step 1: Start MongoDB with Docker
You can start a MongoDB instance in a Docker container using the following command:
docker run -d -p 27017:27017 --name mongodb mongo
### Step 2: Clone the Repository
Clone this repository to your local machine:
git clone <repository-url>
cd movie-database-api
### Step 3: Build and Run the Application
Using Maven:
mvn spring-boot:run
The application should start, and you will be able to access the endpoints via http://localhost:8080/api.
## API Endpoints

### Movies
GET /api/movies: Get all movies
GET /api/movies/{id}: Get a movie by ID
POST /api/movies: Create a new movie
PUT /api/movies/{id}: Update a movie by ID
DELETE /api/movies/{id}: Delete a movie by ID
GET /api/movies/title?title={title}: Search for movies by title
GET /api/movies/releaseDate?releaseDate={releaseDate}: Search for movies by release date

### Actors
GET /api/actors: Get all actors
GET /api/actors/{id}: Get an actor by ID
POST /api/actors: Create a new actor
PUT /api/actors/{id}: Update an actor by ID
DELETE /api/actors/{id}: Delete an actor by ID

### Directors
GET /api/directors: Get all directors
GET /api/directors/{id}: Get a director by ID
POST /api/directors: Create a new director
PUT /api/directors/{id}: Update a director by ID
DELETE /api/directors/{id}: Delete a director by ID

### Application Configuration
You can configure the application by editing the application.properties file in the src/main/resources director.

###Code Quality Checks
This project includes code quality checks using JaCoCo for code coverage and Checkstyle for code style checking. You can run these checks using the following commands:
JaCoCo Code Coverage Report:
mvn jacoco:report
Checkstyle Code Style Check:
mvn checkstyle:check

### Feedback on using ChatGPT to complete the task:
-It was easier to complete this task using chatGPT in comparison with the previous task, I think, this is due to 
the fact that I got used to using chatGPT and learned to form my requests more accurately;
-It took me 4 hours to complete this task.
-My code run appropriate after I used the suggested by ChatGPT code, however I had to do a little additional configurations and additional edits to make it run as it was expected.
Mostly, I had to change additional configuration changes to make it run;
- There were some difficulties and challenges I faced, while working on this task: 
- The responses I got were not always what I wanted to get, that is why I had to rephrase my requests several times;
- To complete the task I mostly used such prompts as attach my code to my request, ask follow up questions, ask for examples and for being more specific;



