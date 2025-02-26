
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign In</title>
</head>
<body>
    <style>
body {
    font-family: sans-serif;
    background-color: #f0f0f0;  /* Light gray background for the body */
    margin: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    min-height: 100vh;
}

.container {
    background-color: #ffffff;   /* White background for the container */
    padding: 20px;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    width: 300px; /* Adjust width as needed */
}

.header {
    display: flex;
    justify-content: space-between;
    align-items: center;
    margin-bottom: 20px;
}

.logo {
    font-weight: bold;
}

.sign-buttons button {
    background-color: #4CAF50; /* Green */
    border: none;
    color: white;
    padding: 8px 16px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 14px;
    margin: 4px 2px;
    cursor: pointer;
    border-radius: 4px;
}

.form-wrapper h2 {
    text-align: center;
    margin-bottom: 20px;
}

 .form-wrapper input[type="tel"],
.form-wrapper input[type="password"] {
    width: calc(100% - 10px); /* Occupy full width with padding adjustment */
    padding: 10px;
    margin-bottom: 15px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box; /* Include padding in width calculation */
}

.forget-password {
    display: block;
    text-align: center;
    margin-bottom: 20px;
    color: #337ab7;
    text-decoration: none;
}

.signin-button {
    background-color: #337ab7; /* Blue */
    border: none;
    color: white;
    padding: 10px 20px;
    text-align: center;
    text-decoration: none;
    display: block;
    font-size: 16px;
    margin: 0 auto; /* Center the button */
    cursor: pointer;
    border-radius: 4px;
    width: 100%; /* Make the button occupy full width */
}

    </style>
    <div class="container">
        <div class="header">
            <div class="logo">logo</div>
            <div class="sign-buttons">
                <button>sign in</button>
                <button>sign up</button>
            </div>
        </div>
        <div class="form-wrapper">
            <h2>sign in</h2>
            <form action="#" method="post">
                <input type="tel" id="phone" placeholder="enter your ph num:" required>
                <input type="password" id="password" placeholder="enter ur password:" required>
                <a href="#" class="forget-password">forget password</a>
                <button type="submit" class="signin-button">sign in</button>
            </form>
        </div>
    </div>
</body>
</html>
