package model;

import jakarta.servlet.http.HttpSession;

public class User implements java.io.Serializable {
    private String firstName;
    private String lastName;
    private String userName;
    private String userPassword;
    private String userEmail;
    private HttpSession httpSession;

    public User() {

    }

    public User(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;

    }

    public User(String firstName, String lastName, String userPassword, String userEmail) {
        this.userName = firstName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public HttpSession getHttpSession() {
        return httpSession;
    }

    public void setHttpSession(HttpSession httpSession) {
        this.httpSession = httpSession;
    }

    public boolean isUserLogInInputValid(User user) {
        return new UserDataBase().validateUserInDB(user);
    }

    public void registerNewUser(){
        new UserDataBase().addUserToDB(new User(this.firstName, this.lastName, this.userPassword, this.userEmail));
    }

    public void removeUser(User user){
        new UserDataBase().removeUserInDB(user);
    }

}
