package com.Lyambda.user;

import java.util.Objects;

public class User {

    public String login, password;

    public class Query
    {
        public void printLog() {
            System.out.printf("User with login %s and password %s sent query\n " ,
                    login , password);

        }
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void createQuery () {
        //User.Query =new User.Query();
    Query query = new Query();
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

    public static void main(String[] args) {
        User user = new User("Login" , "Password");
        User.Query query = user.new Query();
        query.printLog();


        //це ще один варіат створення нашого query
        User.Query query2  = new User("Login2" , "password2").new Query(); //цей рядок поясни
        query2.printLog();

        //третій варіант
        user.createQuery();


    }

}
