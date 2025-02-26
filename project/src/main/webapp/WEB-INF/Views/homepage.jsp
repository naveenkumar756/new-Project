<%@ page import="java.util.ArrayList" %>


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Homepage</title>
    <style>
    
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, sans-serif;
        }

        body {
            background-color: #f5f5f5;
            display: flex;
            flex-direction: column;
            min-height: 100vh;
            align-items: center;
        }

        header {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 15px 30px;
            background: white;
            border: 2px solid black;
            width: 100%;
        }

        .logo {
            font-size: 20px;
            font-weight: bold;
            color: red;
            border: 2px solid red;
            padding: 10px;
            text-decoration: none;
        }

        .nav-links {
            display: flex;
            gap: 15px;
        }

        .nav-links input {
            padding: 10px;
            border: 2px solid black;
        }

        .profile-btn {
            border: 2px solid black;
            padding: 10px 15px;
            font-weight: bold;
            cursor: pointer;
        }

        .content {
            display: grid;
            grid-template-columns: repeat(4, 1fr);
            gap: 70px;
            padding: 40px;
            width: fit-content;
            margin: 0 auto;
        }

        .box {
            width: 200px;
            height: 250px;
            border: 2px solid orange;
            background: white;
            display: flex;
            align-items: center;
            justify-content: center;
            text-align: center;
            font-size: 18px;
            font-weight: bold;
            cursor: pointer;
            text-decoration: none;
            color: black;
        }

        .box:hover {
            background-color: red;
            color: white;
        }

        footer {
            text-align: center;
            padding: 15px;
            background: white;
            border-top: 2px solid black;
            width: 100%;
            margin-top: auto;
        }
    </style>
</head>

<body>
    <header>
        <a href="#" class="logo">Logo</a>
        <div class="nav-links">
            <input type="text" placeholder="Search Movie">
            <input type="text" placeholder="Search Theatre">
        </div>
        <button class="profile-btn">Profile</button>
    </header>

    <div class="content">
        <%
            ArrayList<Movie> movieList = (ArrayList<Movie>) request.getAttribute("movieList");
            if (movieList != null) {
                for (Movie movie : movieList) {
        %>
        <a href="#" class="box">
            <%= movie.getMovieName() %>
        </a>
        <%
                }
            } else {
                response.getWriter().print("Movies Not Available");
            }
        %>
    </div>

    <footer>
        <p>&copy; 2024 My Movie Booker</p>
    </footer>
</body>

</html>