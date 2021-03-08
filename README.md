# Airline Reservation System

Created: Mar 6, 2021 9:43 AM
Created By: Akhilesh Kumar
Last Edited By: Ashish Verma
Last Edited Time: Mar 8, 2021 12:57 PM
Stakeholders: ashish.verma@quinbay.com, Akhilesh Kumar, Jashwanth R Dodda, Adarsh R
Status: Achieved 🔥
Team Name: Qlinbay Travel - Group 1
Type: Project Kickoff 🚀

# Problem Statement

Design a Airline Booking System which has following function requirements. 

1. Take user inputs for Source, Destination, Date, Passenger number.
2. Show details for the available flights between two cities. Details should include Airline Name, Flight Number, Departure, Arrival, number of vacant seats and Price. It should have a book button which would perform the checkout functionality.
3. Support two different seat classes. Support Round Trip as well as One way journey.
4. Authenticate the users at Checkout. If authenticated proceed to Booking functionality else prompt user for signin/signup.
5. Post authentication proceeds to Payment. [We are simply displaying a dummy payment page and then redirecting it to Booking confirmation and not handling the payments.]

# Approach

Flight Reservation System contains functionalities like login , register , search, checkout, admin login, adding flight, saving user booking data and display user booking data. We have used postgresql for storing data about users and flight details. The system allows the airline passenger to search for flights that are available between the two travel cities, namely the “Departure city” and “Arrival city” for  particular departure date. The system displays all the flight’s details such as flight no, name, price  duration of journey etc. After search the system display list of available flights and allows customer to choose a particular flight. Then the system checks for the availability of seats on the flight. If the seats are available then the system allows the passenger to book a seat. OtherWise it will not display the data. It has a functionality of viewing user history which will store the info about the flight the user has booked. The user booking history is stored in the database so that the user can access the data whenever he wants. There is a seperate login page for Users and Admin. Admins has access to special functionalities like adding flights in flight database etc. There is a seperate database and login page for user and admins. To book a flight the system asks the customer to enter his details such as name, Username, credit card number and contact number. Then it checks whether the validity of user and books the flight and update the airline database and user database.

# Qlinbay Travel Flowchart

Logical flowchart of the platform.

[https://miro.com/app/board/o9J_lQnDqCc=/](https://miro.com/app/board/o9J_lQnDqCc=/)

# Wireframing

Miro has been used for creating the wireframes after the initial whiteboard wireframing.

[https://miro.com/app/board/o9J_lQg6r08=/](https://miro.com/app/board/o9J_lQg6r08=/)

# Prototyping

We have used Figma to prototype the UX. We chose Figma to do the Mockup because it was collaborative and helped us follow the product-centric approach. The overall exact design has been achieved on the Client-side as documented. 

[https://www.figma.com/embed?embed_host=notion&url=https%3A%2F%2Fwww.figma.com%2Ffile%2F9WKyXYPkIzvzNj6Pjmn084%2FQlinbay-Travel%3Fnode-id%3D0%253A1](https://www.figma.com/embed?embed_host=notion&url=https%3A%2F%2Fwww.figma.com%2Ffile%2F9WKyXYPkIzvzNj6Pjmn084%2FQlinbay-Travel%3Fnode-id%3D0%253A1)

# Dependencies

Following technologies have been used in the project.

- Java Spring Boot, PostgreSQL for server side and Database.
- Vue for client side.

# Qlinbay Travel Client

Vue client for the project has following pages

- "/" - Root Page of the FE Client. Has the search card. Takes inputs from the user and then using Axios calls the API on written on the server-side and sends the user input in the Request body

    ![Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screen_Shot_2021-03-08_at_10.59.53.png](Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screen_Shot_2021-03-08_at_10.59.53.png)

- "/login" - Login page has a form

    ![Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screen_Shot_2021-03-08_at_10.58.18.png](Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screen_Shot_2021-03-08_at_10.58.18.png)

- "/registration"  -This is for registration of the user. Here we are using post method for storing in the database.

    ![Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screenshot_2021-03-08_at_12.46.17_PM.png](Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screenshot_2021-03-08_at_12.46.17_PM.png)

- "/search".     -   Based on the details entered in the home page user can see the details of every flight. Once the flight is selected it redirects to checkout page.

    ![Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screenshot_2021-03-08_at_12.45.19_PM.png](Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screenshot_2021-03-08_at_12.45.19_PM.png)

- "/checkout"  -    Here user can see the details of selected flight. We are getting this data from the local storage.

    ![Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screenshot_2021-03-08_at_12.25.53_PM.png](Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screenshot_2021-03-08_at_12.25.53_PM.png)

- "/details"        -     Here user can  take the details of the passenger. Here we are using post method and storing in the database

    ![Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screenshot_2021-03-08_at_12.27.18_PM.png](Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screenshot_2021-03-08_at_12.27.18_PM.png)

- "/confirmation"- This the confirmation and we can see ticket her

    ![Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screenshot_2021-03-08_at_12.55.24_PM.png](Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screenshot_2021-03-08_at_12.55.24_PM.png)

- "/history"      - Here user can see the past flight booking details. We are using get method to get the data .
- "/admin-login" -   This is for admin login. Post method is used
- "/addflights"   -    Adding of new flights is done here by the admin.

![Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screenshot_2021-03-08_at_12.20.16_PM.png](Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screenshot_2021-03-08_at_12.20.16_PM.png)

## Setup:

1)Firstly create Vue project in the terminal using command "Vue create"

2)Use Manual select features

3)select requirements that are Babel,Router,Vuex,Css Pre-processors,Linter

4)Select version as "2.x"

5)use history mode for router

6)Then select ESLint Standard Config

7)Then select Lint on Save

8)Place config of Babel,Router,Vuex,Css Pre-processors in dedicated config files

9)Then project will be created.

10)Clone the repository using "git.clone"

11)commit changes

12)push to git repository

13)Start all the services

14)Run the code using command "npm run serve"

# Qlinbay Travel Server

Server-side has microservices-based architecture and we are using API Gateway to route and filter the API service requests.

## Microservices used:

1. Booking Service
    - Search API: This API takes input from users and performs a search based on user input on flight table and return a response that contains flight details.
    - Checkout API: This API reduces the number of seats from flight table after user has made the payment and booked the flight ticket after performing a check on flight table.
2. Login Service
    - Login API:  Used for authentication part so that user can login into our website. Login API fetched data from login table and checks whether the data user data is valid. Based  on  user data login API returns response after validation.
    - Register API : Performs user registration. The user data is stored in login database so that user can access our website after registration
3. Admin Services
    - Admin Login: This API is used for Admin Authentication so that admin can access certain additional permissions like making changes in flight database, adding flights.
    - Add Flights: Add flights API is used for adding flights into our flight table. Here only admin can add  the details about flights after authentication.
4. Booking Details

### Dependencies:

- PostgreSQL
- Java
- Spring Boot
- Netflix Zuul

## **API's**

Used Swagger-UI and Postman to develop and test our APIs. 

1. Login Services APIs
    1. POST "/login-services/register" 

        ![Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screen_Shot_2021-03-08_at_12.33.45.png](Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screen_Shot_2021-03-08_at_12.33.45.png)

        2. POST "/login-services/login"

        ![Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screen_Shot_2021-03-08_at_12.22.38.png](Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screen_Shot_2021-03-08_at_12.22.38.png)

2. Admin Services APIs

1. POST "/flight" (Add flight functionality)

    ![Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screenshot_2021-03-08_at_12.11.19_PM.png](Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screenshot_2021-03-08_at_12.11.19_PM.png)

3. Booking Details APIs  - 

1. POST "/history"

    ![Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screen_Shot_2021-03-08_at_12.03.21.png](Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screen_Shot_2021-03-08_at_12.03.21.png)

    Request :

    Response:

    ![Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screen_Shot_2021-03-08_at_12.04.38.png](Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screen_Shot_2021-03-08_at_12.04.38.png)

2. GET "/history/getHistory/{userName}

    Wrote a GET API which takes userName and then returns the complete booking details in response. 

    Response: 

    ![Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screen_Shot_2021-03-08_at_12.07.02.png](Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screen_Shot_2021-03-08_at_12.07.02.png)

4 . Booking Services APIs

1. POST "/search"

    Search API uses the composite key feature of JPA to combine two primary keys to form one individual primary key. We have used "Date" and "Flight Id" to form our composite key since same flights can be scheduled multiple times in multiple days.

    ![Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screen_Shot_2021-03-08_at_12.13.45.png](Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screen_Shot_2021-03-08_at_12.13.45.png)

    ![Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screen_Shot_2021-03-08_at_12.08.56.png](Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screen_Shot_2021-03-08_at_12.08.56.png)

2. POST "/checkout"

5. Admin login API : 

HTTP Method:

Request:

Response: 

## API Gateway

We have used Netflix Zuul for creating dynamic routing and monitoring of Microservices used.

![Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screen_Shot_2021-03-08_at_11.46.46.png](Airline%20Reservation%20System%20e894d171a18d48febdd29b224277084e/Screen_Shot_2021-03-08_at_11.46.46.png)

Go to the path

```sql
 /airline-reservation/airline-reservation-server/api-gateway
```

# Database

Create DBs in PostgreSQL with following names:

- "registration" (used for flight details, search, checkout)
- "booking-details" (Flight Booking History and User booking history )
- "login" (used for login Services)

1. login

    ```sql
    - Table Definition ----------------------------------------------

    CREATE TABLE login (

    user_name character varying(255) PRIMARY KEY,

    email character varying(255) UNIQUE,

    mobile_number character varying(255),

    name character varying(255),

    password character varying(255)

    );

    - Indices -------------------------------------------------------

    CREATE UNIQUE INDEX login_pkey ON login(user_name text_ops);

    CREATE UNIQUE INDEX uk_3cs7dxhnine2f6x5ic4741s6e ON login(email text_ops);
    ```

2. Flight Master Database (Used for Search ( "/search" ), Booking Details ( "/details" ) and Checkout APIs ( "/checkout" ) )

    ```sql
    -- Table Definition ----------------------------------------------

    CREATE TABLE flight (
        date date,
        f_id character varying(255),
        airline character varying(255),
        arrival time without time zone,
        departure time without time zone,
        destination character varying(255),
        duration character varying(255),
        price double precision,
        seats integer,
        source character varying(255),
        CONSTRAINT flight_pkey PRIMARY KEY (date, f_id)
    );

    -- Indices -------------------------------------------------------

    CREATE UNIQUE INDEX flight_pkey ON flight(date date_ops,f_id text_ops);
    ```

3. admin_login

    ```sql
    CREATE TABLE admin_login (
        admin_name character varying(255) PRIMARY KEY,
        password character varying(255)
    );

    -- Indices -------------------------------------------------------

    CREATE UNIQUE INDEX admin_login_pkey ON admin_login(admin_name text_ops);
    ```

4. booking_details
    - Flight History ("history" table)

    ```sql
    -- Table Definition ----------------------------------------------

    CREATE TABLE history (
        id integer PRIMARY KEY,
        date date,
        flight_name character varying(255),
        mobile_number character varying(255),
        name character varying(255),
        price integer,
        user_name character varying(255)
    );

    -- Indices -------------------------------------------------------

    CREATE UNIQUE INDEX history_pkey ON history(id int4_ops);
    ```

    - User Booking History (user_tbl)

    ```sql
    -- Table Definition ----------------------------------------------

    CREATE TABLE user_tbl (
        id integer PRIMARY KEY,
        email character varying(255),
        password character varying(255),
        user_name character varying(255)
    );

    -- Indices -------------------------------------------------------

    CREATE UNIQUE INDEX user_tbl_pkey ON user_tbl(id int4_ops);
    ```

5. Add Flights (flights table)

    ```sql
    -- Table Definition ----------------------------------------------

    CREATE TABLE flights (
        date date,
        f_id character varying(255),
        airline character varying(255),
        arrival character varying(255),
        departure character varying(255),
        destination character varying(255),
        price integer,
        source character varying(255),
        CONSTRAINT flights_pkey PRIMARY KEY (date, f_id)
    );

    -- Indices -------------------------------------------------------

    CREATE UNIQUE INDEX flights_pkey ON flights(date date_ops,f_id text_ops);
    ```