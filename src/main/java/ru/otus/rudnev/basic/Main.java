package ru.otus.rudnev.basic;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(100, "Желтый", false, true);
        box.changeColor("Красный");
        box.openBox();
        box.putItem();
        box.boxInfo();



        User[] users = new User[10];
        users[0] = new User("Иванов", "Иван", "Иванович", 1980, "ivan@example.com");
        users[1] = new User("Петров", "Петр", "Петрович", 1975, "petr@example.com");
        users[2] = new User("Сидоров", "Сидор", "Сидорович", 1990, "sidor@example.com");
        users[3] = new User("Козлов", "Константин", "Александрович", 1965, "konstantin@example.com");
        users[4] = new User("Смирнова", "Ольга", "Андреевна", 1970, "olga@example.com");
        users[5] = new User("Морозов", "Андрей", "Валентинович", 1985, "andrey@example.com");
        users[6] = new User("Антонов", "Антон", "Петрович", 2000, "anton@example.com");
        users[7] = new User("Кузнецов", "Алексей", "Игоревич", 1995, "aleksei@example.com");
        users[8] = new User("Егорова", "Мария", "Васильевна", 1960, "maria@example.com");
        users[9] = new User("Зайцев", "Валентин", "Валентинович", 1988, "valentin@example.com");




        for (User user : users){
            if (user.getAge() > 40){
                user.userInfo();
            }
        }
    }
}