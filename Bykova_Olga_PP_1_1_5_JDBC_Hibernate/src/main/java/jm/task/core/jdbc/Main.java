package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        // Создание таблицы пользователей
        userService.createUsersTable();

        // Добавление пользователей
        userService.saveUser("Иван", "Иванов", (byte) 50);
        userService.saveUser("Альфия", "Дулькина", (byte) 35);
        userService.saveUser("Глафира", "Репина", (byte) 18);
        userService.saveUser("Петр", "Долгорукий", (byte) 32);


        // Получение всех пользователей и вывод в консоль
        userService.getAllUsers();

        // Удаление пользователя по ID
        userService.removeUserById(2L);

        // Очистка таблицы пользователей
        userService.cleanUsersTable();

        // Удаление таблицы пользователей
        userService.dropUsersTable();
    }
}
