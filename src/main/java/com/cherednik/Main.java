package com.cherednik;

import com.cherednik.dao.UsersDao;
import com.cherednik.model.User;

public class Main {

    public static void main(String[] args) {
        UsersDao usersDao = new UsersDao();

        usersDao.removeAll();
        usersDao.addUser(new User("Lina", 30));
        usersDao.addUser(new User("Bracket", 60));
        usersDao.addUser(new User("Bottle", 5));
        usersDao.addUser(new User("Homer", 50));
        usersDao.addUser(new User("Yoda", 200));
        usersDao.addUser(new User("Ben", 25));
        System.out.println(usersDao.getAllUsers());
        System.out.println(usersDao.getUser(52));
        usersDao.removeUserByName("Bottle");
        System.out.println(usersDao.getAllUsers());
        User someUser = usersDao.getUser(47);
        someUser.setAge(80);
        someUser.setName("Barmoley");
        usersDao.updateUser(someUser);
        System.out.println(usersDao.getAllUsers());
        usersDao.close();
    }
}