package com.example.springkafka;

public class Greeting {
    public Greeting() {
    }

    public Greeting(String itemid) {
        this.itemid = itemid;
    }

    private String itemid;

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "itemid='" + itemid + '\'' +
                '}';
    }
}
