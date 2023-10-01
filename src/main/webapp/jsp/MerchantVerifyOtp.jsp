<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Merchant Verify OTP</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            background-color: #f0f0f0;
        }

        h1 {
            color: #333;
        }
        h2{
            color: red;
        }

        h3 {
            color: green;
        }

        form {
            background-color: #fff;
            border-radius: 5px;
            padding: 20px;
            margin: 20px auto;
            max-width: 400px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        input[type="number"] {
            width: 90%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        input[type="submit"] {
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            border: none;
            cursor: pointer;
            border-radius: 5px;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <h2>${fail}</h2>
    <h3>${pass}</h3>
    <h1>Merchant Verify OTP</h1>
    <form action="/merchant/verify" method="post">
        <input type="hidden" name="id" value="${id}">
        Enter OTP: <input type="number" name="otp" required>
        <input type="submit" value="Submit">
    </form>
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
