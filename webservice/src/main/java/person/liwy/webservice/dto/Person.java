package person.liwy.webservice.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Person {
    public String name;
    public Date date;
    public LocalDateTime localDateTime;
    public int age;
    public BigDecimal money;
    public boolean man;
    public ArrayList<String> trait;
    public HashMap<String, String> cards;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public boolean isMan() {
        return man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }

    public ArrayList<String> getTrait() {
        return trait;
    }

    public void setTrait(ArrayList<String> trait) {
        this.trait = trait;
    }

    public HashMap<String, String> getCards() {
        return cards;
    }

    public void setCards(HashMap<String, String> cards) {
        this.cards = cards;
    }
}
