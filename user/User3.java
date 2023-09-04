package com.Lyambda.user;

import java.util.Objects;

public class User3 {
    private static String login, password;

    public static class Query
    {
        public void printLog() {
            System.out.printf("User with login %s and password %s sent query\n " ,
                    login , password);

        }
    }
/*
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

 */
//альтернатива конструктору для сатичного вложеного класу
    public static void initialize(String login, String password)
    {
        User3.login = login;
        User3.password = password;
    }



/*
    public void createQuery () {
        //User.Query =new User.Query();
        User.Query query = new User.Query();
        query.printLog();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

 */

    public static void main(String[] args) {
       initialize("Login" , "Password");
        User3.Query query = new User3.Query();
        query.printLog();

    }
}
