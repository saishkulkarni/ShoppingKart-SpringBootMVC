<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" href="../images/favicon.png" type="image/x-icon">
    <title>Shopping Kart</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }

        header {
            background-color: #4b90e4; /* Soft Blue */
            color: #fff;
            padding: 20px 0;
        }

        .navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 0 20px;
        }

        .logo {
            font-size: 24px;
            font-weight: bold;
            text-decoration: none;
            color: #fff;
        }

        .nav-links {
            list-style: none;
            margin: 0;
            padding: 0;
            display: flex;
        }

        .nav-links li {
            margin-right: 20px;
        }

        .nav-links a {
            text-decoration: none;
            color: #fff;
            font-weight: bold;
        }

        h1 {
            font-size: 36px;
            margin: 20px 0;
        }

        h2 {
            color: red;
            font-size: 24px;
            margin: 10px 0;
        }

        h3 {
            color: green;
            font-size: 24px;
            margin: 10px 0;
        }

        a {
            text-decoration: none;
            margin: 10px;
        }

        button {
            padding: 10px 20px;
            background-color: #4b90e4; /* Soft Blue */
            color: #fff;
            border: none;
            cursor: pointer;
            border-radius: 5px;
            font-size: 18px;
        }

        button:hover {
            background-color: #357ebd; /* Darker Soft Blue on Hover */
        }

        .container {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
        }
    </style>
</head>
<body>
    
    <header>
        <div class="navbar">
            <a class="logo" href="/">Shopping Kart</a>
            <ul class="nav-links">
                <li><a href="/admin/login">Admin</a></li>
                <li><a href="/customer/login">Customer</a></li>
                <li><a href="/merchant/login">Merchant</a></li>
            </ul>
        </div>
    </header>

    <div class="container">
        <h1>Explore Our Products</h1>
        <h2>${neg}</h2>
        <h3>${pos}</h3>
        <a href="/shop"><button>Shop Now</button></a>
    </div>

    <script>
        setTimeout(function () {
            var h2Element = document.querySelector("h2");
            var h3Element = document.querySelector("h3");
            if (h2Element) {
                h2Element.style.display = "none";
            }
            if (h3Element) {
                h3Element.style.display = "none";
            }
        }, 1000);
    </script>

</body>
</html>
