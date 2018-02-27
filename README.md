- Please make sure that you have docker on your machine.


1) **docker run --name cool_project-psql  -p 5432:5432  -e POSTGRES_DB=cool-project  -e POSTGRES_PASSWORD=password  -d postgres**

2) **run spring boot (run the class CoolProjectApplication.java)

- The rest endpoint to get all the users: **http://localhost:9090/users**
