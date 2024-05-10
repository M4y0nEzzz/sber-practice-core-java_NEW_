package ru.sber.base.syntax.WEEK_9;




class Weapon{
    private static final long serialVersionUID = 1L;
    String type;

    public Weapon(String type) {
        this.type = type;
    }
}

class Armor {
    private static final long serialVersionUID = 1L;
    String material;

    public Armor(String material) {
        this.material = material;
    }
}
public class Safe_AND_Load {
    String name;
    int lvl;
    Weapon weapon;
    Armor armor;
}
//Пока не доделал
