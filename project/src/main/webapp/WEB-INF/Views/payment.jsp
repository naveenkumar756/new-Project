<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Movie Booking - Payment</title>
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
            gap: 10px;
        }

        .box {
            width: 250px;
            height: 300px;
            border: 3px solid orange;
            padding: 10px;
        }

        .info {
            width: 250px;
            border: 2px solid black;
            padding: 10px;
        }

        .payment-section {
            flex-grow: 1;
            display: flex;
            flex-direction: column;
            gap: 15px;
            border: 2px solid black;
            padding: 20px;
            width: 100%;
            height: 350px;
        }

        .payment-options {
            display: flex;
            flex-direction: column;
            gap: 10px;
        }

        .payment-options button {
            padding: 15px;
            font-weight: bold;
            cursor: pointer;
            border: 2px solid black;
            background: white;
            color: black;
        }

        .payment-options button:hover {
            background-color: red;
            color: white;
        }

        .buttons-container {
            display: flex;
            justify-content: center;
            gap: 15px;
            margin-top: 10px;
            width: 100%;
            padding-bottom: 70px;
        }

        .button {
            padding: 15px 25px;
            font-weight: bold;
            cursor: pointer;
            border: 2px solid black;
            background: white;
            color: black;
        }

        .button:hover {
            background-color: red;
            color: white;
        }

        footer {
            text-align: center;
            padding: 15px;
            margin-top: auto;
            background: white;
            border-top: 2px solid black;
            width: 100%;
        }
    </style>
</head>

<body>
    
        <a href="#" class="logo">Logo</a>
        <div class="nav-links">
            <input type="text" placeholder="Search Movie">
            <input type="text" placeholder="Search Theatre">
        </div>
        <button class="profile-btn">Profile</button>
    <main class="main-container">
        <div class="left-section">
            <div class="box"></div>
            <div class="info">Movie info</div>
        </div>
        <div class="payment-section">
            <h4>Select Payment Methods:</h4>
            <div class="payment-options">
                <button>Debit/Credit Card</button>
                <button>UPI</button>
            </div>
            <div class="payment-details">Card Fields to fill or UPI QR code, based on the Selection</div>
        </div>
    </main>

    <div class="buttons-container">
        <button class="button">Pay</button>
        <button class="button">Cancel</button>
    </div>

    <footer>
        <p>&copy; 2024 My Movie Booker</p>
    </footer>
</body>

</html>
    