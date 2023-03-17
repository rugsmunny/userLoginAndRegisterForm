<!DOCTYPE html>
<html>
<head>
    <link href="stylesheet.css" rel="stylesheet" type="text/css">
    <title>Project: Login and create user content</title>
</head>
<body>
<div class="outer_container">
    <div class="form_container">
        <form action="main-servlet" method="POST">
            <div class="imgcontainer">
                <img src="media/img_avatar2.png" alt="Avatar" class="avatar">
            </div>
            <div style="display: flex; justify-content: center">

            <%
                String message;
                if (request.getAttribute("errorMessage") != null) {
                    message = (String) request.getAttribute("errorMessage");
                    out.print("<span style=\"color: darkred; position: absolute\">" + message + "</span>");
                } else if (request.getAttribute("registerMessage") != null) {
                    message = (String) request.getAttribute("registerMessage");
                    out.print("<span style=\"color: blue; position: absolute\">" + message + "</span>");
                }
            %>

            </div>
            <div class="input_container">

                <label>
                    <input type="text" placeholder="Enter Username" name="userName" id="userName" required>
                </label>


                <label for="psw"></label>
                <input type="password" placeholder="Enter Password" name="password" id="psw" required>
                <label>
                    <input type="checkbox" onclick="pswFunction()">
                </label> Show Password
                <label style="margin: 0 10px;">Remember me
                    <input type="checkbox" checked="checked" name="remember">
                </label>
                <br>
                <div class="login_btn_section">
                    <button class="login_button" type="submit">Login</button>

                </div>


            </div>


            <div class="forgot_container" style="background-color:#f1f1f1">
                <button type="button" class="cancelbtn" onclick="clearFormFunction()">Cancel</button>
                <span class="newUserBtn"><button type="button" class="forgot_btn"
                                                 onClick="location.href='View/registerForm.jsp';">Register new user.</button></span>
                <span class="psw forgot_btn"><button type="button" class="forgot_btn" onClick="resetPswFunction()">Forgot password?</button></span>
            </div>

            <div class="reset_psw_container" id="resetPsw" style="display:none;">
                <label>
                    <input type="text" placeholder="Enter e-mail to reset password" name="resetPsw">
                </label>
                <span><button type="button" class="send_btn">Send</button></span>
            </div>


        </form>
    </div>

</div>

<script type="text/javascript">
    function clearFormFunction() {
        let psw = document.getElementById("psw");
        let userName = document.getElementById("userName");
        if (psw.value != "") {
            psw.value = "";
        }
        if (userName.value != "") {
            userName.value = "";
        }
    }
</script>

<script type="text/javascript">
    function pswFunction() {
        let x = document.getElementById("psw");
        if (x.type === "password") {
            x.type = "text";
        } else {
            x.type = "password";
        }
    }
</script>
<script type="text/javascript">

    function resetPswFunction() {

        if (document.getElementById("resetPsw").style.display === "none") {
            document.getElementById("resetPsw").style.display = "block";
        } else {
            document.getElementById("resetPsw").style.display = "none";
        }
    }
</script>

</body>
</html>