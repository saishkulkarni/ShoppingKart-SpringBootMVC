<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Merchant Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            background-color: #f0f0f0;
        }

        h1 {
            color: #333;
        }

        h3{
            color:green;
        }
        h2{
            color:red;
        }

        form {
            background-color: #fff;
            border-radius: 5px;
            padding: 20px;
            margin: 20px auto;
            max-width: 500px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        legend {
            font-weight: bold;
        }

        table {
            width: 100%;
            margin-top: 10px;
        }

        th {
            text-align: left;
        }

        input[type="email"],
        input[type="password"] {
            width: 90%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        button {
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            border: none;
            cursor: pointer;
            border-radius: 5px;
            margin-bottom: 10px;
        }

        button[type="reset"] {
            background-color: #ccc;
            color: #333;
        }

        button:hover {
            background-color: #0056b3;
        }

        a {
            text-decoration: none;
            color: #007bff;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <h1>Merchant Login</h1>
    <form action="/merchant/login" method="post">
        <h3>${pass}</h3>
        <h2>${fail}</h2>
        <fieldset>
            <legend>Login Here,</legend>
            <table>
                <tr>
                    <th>Email:</th>
                    <th><input type="email" name="email" required></th>
                </tr>
                <tr>
                    <th>Password:</th>
                    <th><input type="password" name="password" required></th>
                </tr>
                <tr>
                    <th><button>Login</button></th>
                    <th><button type="reset">Cancel</button></th>
                </tr>
                <tr>
                    <th colspan="2">
                        <a href="/merchant/signup">Click here to Create Account</a>
                    </th>
                </tr>
            </table>
        </fieldset>
    </form>
    <br>
    <a href="/"><button>Back</button></a>
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