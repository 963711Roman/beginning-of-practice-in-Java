package com.Lyambda.user;

import java.util.Objects;

public class User2 {
    public String login, password;

    public class Query
    {
        public void printLog() {
            System.out.printf("User with login %s and password %s sent query\n " ,
                    login , password);

        }
    }

    public User2(String login, String password) {
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
        class Query
        {
            public void printLog() {
                System.out.printf("User with login %s and password %s sent query\n " ,
                        login , password);

            }
        }
        Query query = new Query();
        query.printLog();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User2 user = (User2) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "User2{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    public static void main(String[] args) {
        User2 user = new User2("Login" , "Password");

        user.createQuery();


    }
}
