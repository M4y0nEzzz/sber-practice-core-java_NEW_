package ru.sber.base.syntax.WEEK_4;

public class Book {

    static class Author {
        private String name;
        private String gender;
        private String email;

        // Конструктор класса Author
        public Author(String name, String gender, String email) {
            this.name = name;
            this.gender = gender;
            this.email = email;
        }

        // Геттеры и сеттеры для полей класса Author
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        // Метод toString() для класса Author
        @Override
        public String toString() {
            return "Автор: " + name + ", Пол: " + gender + ", Почта: " + email;
        }
    }








    static class book {
        private String title;
        private Author author;
        private int year;

        // Конструктор класса Book
        public book(String title, Author author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        // Геттеры и сеттеры для полей класса Book
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Author getAuthor() {
            return author;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        // Метод toString() для класса Book
        @Override
        public String toString() {
            return "Название: " + title + " , автор " + author + ", год: " + year;
        }
    }

    public static class Main {
        public static void main(String[] args) {
            // Создание объекта класса Author
            Author author1 = new Author("Тролль Рофлович", "Муж", "TrofL@mail.ru");
            System.out.println(author1);

            // Создание объекта класса Book с использованием объекта Author
            book book1 = new book("Повесть о Некоше", author1, 2024);
            System.out.println(book1);

            // Изменение имени автора и вывод обновленной информации о книге
            author1.setName("Тролль Рофлович");
            System.out.println(book1);
        }
    }
}
