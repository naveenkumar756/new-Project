<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Movie Booking</title>
    <style>
    
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, sans-serif;
        }

        body {
            background-color: #f9fafb;
            display: flex;
            flex-direction: column;
            min-height: 100vh;
            width: 100%;
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

        .main-container {
            display: flex;
            padding: 20px;
            gap: 20px;
            width: 100%;
            flex-grow: 1;
        }

        .left-section {
            display: flex;
            flex-direction: column;
            gap: 20px;
            flex: 1;
        }

        .box {
            width: 250px;
            height: 250px;
            border: 3px solid orange;
            padding: 10px;
        }

        .info {
            width: 250px;
            border: 2px solid black;
            padding: 10px;
        }

        .theatre-selection {
            flex: 2;
            display: flex;
            flex-direction: column;
            gap: 20px;
        }

        .theatre-selection h1 {
            font-size: 24px;
            color: black;
        }

        .theatre-selection button {
            padding: 15px 20px;
            border: 2px solid black;
            background-color: white;
            font-size: 18px;
            font-weight: bold;
            cursor: pointer;
            width: 100%;
        }

        footer {
            text-align: center;
            padding: 15px;
            background: white;
            border-top: 2px solid black;
            width: 100%;
        }

        .theatre-selection button:hover {
        background-color: red;
        color: white;
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

    <main class="main-container">
        <div class="left-section">
            <div class="box"></div>
            <div class="info">Movie Cast Info</div>
        </div>
        <div class="theatre-selection">
            <h1>Select Theatre:</h1>
            <button>Theatre 1</button>
            <button>Theatre 2</button>
            <button>Theatre 3</button>
            <button>Theatre 4</button>
            <button>Theatre 5</button>
            <button>Theatre 6</button>
        </div>
    </main>

    <footer>
        <p>&copy; 2024 My Movie Booker</p>
    </footer>
</body>
</html>