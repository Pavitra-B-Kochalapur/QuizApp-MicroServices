# QuizApp-MicroServices
QuizApp (MicroServices Project)
Tech Stack: 
Java 17
Spring Boot
Spring Data JPA
Spring Web
Lombok
Eureka Server
Eureka Discovery Client
OpenFeign
Gateway
MySQL Database.

# Web API Test Links:
API Testing Tool Used : Postman

# Question-Service
1) GET: http://localhost:8080/question/allQuestions
2) GET: http://localhost:8080/question/category/{category}
3) POST: http://localhost:8080/question/add
   RequestBody(JSON):
   
  [ {
        "question_title": " ",
        "option": " ",
        "option2": " ",
        "option3": " ",
        "option4": " ",
        "right_answer": " ",
        "difficulty_level": " ",
        "category": " "
    }]
    
 4) POST: http://localhost:8080/question/generate?categoryName=Java&numQuestions=5

 5) POST: http://localhost:8080/question/getQuestions
    RequestBody:
     Id's: [1,2,3]
 6) POST: http://localhost:8080/question/getScore
    RequestBody:
    {
        "id":" ",
        "response":" "
    }
   
   

# Quiz-Service
1) Post: http://localhost:8090/quiz/create
   RequestBody(JSON):
   {
           "categoryName":" ",
           "numQuestions":" ",
           "title":" "
   }               

2) GET: http://localhost:8090/quiz/get/{id}

3) POST: http://localhost:8090/quiz/submit/{id}
   RequestBody:
   {
        "id":" ",
        "response":" "
   }

 
 # API-Gateway
 1) GET: http://localhost:8765/quiz-service/quiz/get/{id}
