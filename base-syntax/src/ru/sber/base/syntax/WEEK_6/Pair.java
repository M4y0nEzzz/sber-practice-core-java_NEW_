package ru.sber.base.syntax.WEEK_6;
import java.util.ArrayList;
import java.util.List;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void set(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "[" + key + ", " + value + "]";
    }
    public static class Main {
        public static void main(String[] args) {
            List<Pair<String, Integer>> months = new ArrayList<>();
            months.add(new Pair <> ("Январь", 31));
            months.add(new Pair <>("Февраль", 28));
            months.add(new Pair<> ("Март", 31));
            months.add(new Pair<> ("Апрель", 30));
            months.add(new Pair<> ("Май", 31));
            months.add(new Pair<> ("Июнь", 30));
            months.add(new Pair<> ("Июль", 31));
            months.add(new Pair<> ("Август", 31));
            months.add(new Pair<> ("Сентябрь", 30));
            months.add(new Pair<> ("Октябрь", 31));
            months.add(new Pair<> ("Ноябрь", 30));
            months.add(new Pair<> ("Декабрь", 31));

            for (Pair<String, Integer> month : months) {
                System.out.println(month);
            }


            List<Pair<Integer, String>> countries = new ArrayList<>();
            countries.add(new Pair <> (7, "='Россия'"));
            countries.add(new Pair <> (228, "='Того'"));
            countries.add(new Pair <> (1, "='США'"));
            countries.add(new Pair <> (355, "='Албания'"));
            countries.add(new Pair <> (263, "='Зимбабве'"));

            for (Pair<Integer, String> countrie : countries) {
                System.out.println(countrie);
            }
        }
    }
}