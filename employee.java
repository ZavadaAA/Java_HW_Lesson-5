package ru.geekbrains.Lesson_6;

public class employee {

            String firstname, lastname, position, email, phone;
            int salary, age;

        employee(String firstname,
                 String lastname,
                 String position,
                 String email,
                 String phone,
                 int salary,
                 int age) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        void getFullInfo() {
            System.out.println("firstname: " + firstname + " lastname: " + lastname
                    + " position: " + position + " email: " + email + " phone " + phone + " salary: " + salary + " age: "
                    + age);
        }

        int getAge() {
            return age;
        }
    }
