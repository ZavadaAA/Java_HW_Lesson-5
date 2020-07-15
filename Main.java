package ru.geekbrains.Lesson_6;

public class Main {

    public static void main(String[] args) {
        employee [] employee = new employee[5];
        employee[0] = new employee("Ivanov", "Ivan","Director General", "ivanov_ivan@mail.ru", "89111111111", 150000, 45);
        employee[1] = new employee("Petrova", "Olga", "Manager","petrova_olga@mail.ru", "89212121212", 60000, 32);
        employee[2] = new employee("Sidorov", "Vasiliy","Sales Manager", "sidorov_vasiliy@mail.ru", "89555555555", 40000, 28);
        employee[3] = new employee("Kotikov", "Zakhar","Commercial Manager", "kotikov_zakhar@mail.ru", "89609609696", 70000, 43);
        employee[4] = new employee("Budeniy", "Semen","Engineer", "budeniy_semen@mail.ru", "7857858", 450000, 31);

        for (employee e : employee) if (e.getAge() > 40) e.getFullInfo();
    }
}