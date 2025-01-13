package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Victor", "Frolov", (byte) 44);
        userService.saveUser("Elena", "Smirnova", (byte) 26);
        userService.saveUser("Petr", "Popov", (byte) 23);
        userService.saveUser("Daria", "Morozova", (byte) 31);

        System.out.println(userService.getAllUsers());

        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
