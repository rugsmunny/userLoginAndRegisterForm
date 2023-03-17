package model;

import jakarta.servlet.http.Cookie;

import java.util.ArrayList;
import java.util.Iterator;

public class UserDataBase {

    static ArrayList<User> userDB = new ArrayList<User>();


    public ArrayList<User> getUserDB() {
        return userDB;
    }

    public boolean validateUserInDB(User user) {
        System.out.println("we are in validate");
        System.out.println("UserDB contains size " + userDB.size());

        for (User userInDB : userDB) {
            System.out.println("For each !!");
            if (userInDB.getUserName().equals(user.getUserName()) &&
                    userInDB.getUserPassword().equals(user.getUserPassword())) {
                System.out.println("userDB true");
                return true;
            }
        }   System.out.println("USERDATABASE: FALSE = ?");
            return false;
    }




    public void addUserToDB(User user) {
        System.out.println("adding user to db");
        this.userDB.add(user);
    }

    public void removeUserInDB(User user) {

        for (int i = 0; i < userDB.size(); i++) {
            if (userDB.get(i).getUserName().equals(user.getUserName()) &&
                    userDB.get(i).getUserPassword().equals(user.getUserPassword())) {
                System.out.println("Remove User In DB found");
                userDB.remove(i);
            }
        }

/*        System.out.println("Inside removeUserInDB() method:");
        Iterator<User> userToDelete = userDB.iterator();
        int x = 0;
        while (userToDelete.hasNext()) {
            System.out.println("removeUserInDB loop #" + x);
            User temp = userToDelete.next();
            x++;
            if (userToDelete.next().getUserName().equals(user.getUserName()) &&
                    userToDelete.next().getUserPassword().equals(user.getUserPassword())) {
                System.out.println("Remove User In DB found");
                userDB.remove(temp);

            }
        }*/

    }

}
