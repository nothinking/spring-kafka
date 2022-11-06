package com.example.springkafka;

public class Bye {
    private String itemid;

    @Override
    public String toString() {
        return "Bye{" +
                "item='" + itemid + '\'' +
                '}';
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public Bye() {
    }

    public Bye(String itemid) {
        this.itemid = itemid;
    }
}
