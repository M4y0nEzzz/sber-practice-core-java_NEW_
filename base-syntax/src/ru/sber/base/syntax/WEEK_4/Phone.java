package ru.sber.base.syntax.WEEK_4;


public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }


    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(){
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + " (" + callerNumber + ")");
    }

    public void sendMessage(String[] phoneNumbers) {
        System.out.println("Отправка сообщения на следующие номера:");
        for (String number : phoneNumbers) {
            System.out.println(number);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("89218296164", "Vivo", 0.15);
        phone1.receiveCall("Michael");
        System.out.println("Phone number: " + phone1.getNumber());

        Phone phone2 = new Phone("88005553535", "Nokia", 0.2);
        phone2.receiveCall("Scammers", "33333333333");

        String[] phoneNumbers = {"11111111111", "22222222222"};
        phone2.sendMessage(phoneNumbers);

        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
    }
}