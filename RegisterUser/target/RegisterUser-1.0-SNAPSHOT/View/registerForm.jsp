<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register new account</title>
    <link href="../stylesheet.css" rel="stylesheet" type="text/css">

</head>
<body>
<div class="outer_container">
    <div class="register_form_container">
        <form action="<%=request.getContextPath()%>/register-servlet" method="POST">

            <div class="input_container">

                <label>
                    <input type="text" placeholder="First name" name="firstName" required>
                </label>
                <label>
                    <input type="text" placeholder="Last name" name="lastName" required>
                </label>

                <br>

                <label for="choosePsw">
                    <input type="password" placeholder="Choose Password" name="psw1" id="choosePsw" required>
                </label>
                <label for="repeatPsw">
                    <input type="password" placeholder="Repeat Password" name="psw" id="repeatPsw" required>
                </label>
                <br>
                <label for="registerEmail">
                    <input type="email" placeholder="Register e-mail" name="email1" id="registerEmail" required>
                </label>
                <label for="repeatEmail">
                    <input type="email" placeholder="Repeat e-mail" name="email" id="repeatEmail" required>
                </label>
                <br>
                <div class="login_btn_section">
                    <button class="login_button" type="submit">Submit</button>
                    <span class="newUserCancelBtn"><button type="button" class="registerHomeBtn" onClick="location.href='../index.jsp';">Home</button></span>
                    <div>

                    </div>
                </div>

            </div>

        </form>
    </div>

</div>

</body>
</html>
