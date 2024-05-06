package ru.sber.base.syntax.WEEK_8;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class BankOnline {
    private static final String BLOCKED_CARDS_FILE = "blocked_cards.txt";
    private static final double TRANSFER_LIMIT = 50000;


    public void send(String cardNumber, Double money) {

        // Проверка на null
        if (cardNumber == null || money == null) {
            throw new IllegalArgumentException("Не указан номер карты или сумма перевода");
        }

        //Проверка на правильность ввода номера карты
        if (!cardNumber.matches("\\d{16}")) {
            throw new IllegalArgumentException("Не указан номер карты или сумма перевода");
        }

        //Проверка на перевод на заблокированные карты
        try {
            List<String> blockedCards = Files.readAllLines(Paths.get(BLOCKED_CARDS_FILE));
            if (blockedCards.contains(cardNumber)) {
                throw new IllegalArgumentException("Карта заблокирована");
            }
        } catch (IOException e) {
            System.err.println("Ошибка ввода-вывода при попытке доступа к списку заблокированных карт: " + e.getMessage());
            return; //Если не смогли прочитать файл
        }

        //Проверка на отрицательную сумму перевода
        if (money < 0) {
            throw new IllegalArgumentException("Введена отрицательная сумма перевода");
        }

        //Проверка на превышение лимита
        if (money > TRANSFER_LIMIT) {
            throw new IllegalArgumentException("Сумма перевода превышает лимит");
        }

        // Вывод сообщения о переводе
        System.out.println("Перевод на сумму "
                + money + " на карту "
                + cardNumber + " выполнен успешно");
    }

    public static class Main {
        public static void main(String[] args) {
            BankOnline bankOnline = new BankOnline();
            try {
                bankOnline.send("1234567890123456", 10000.0);
            } catch (IllegalArgumentException e) {
                System.err.println("Ошибка при переводе: " + e.getMessage());
            }
        }
    }
}