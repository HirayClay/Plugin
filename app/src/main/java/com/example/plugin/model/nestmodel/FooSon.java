package com.example.plugin.model.nestmodel;

/**
 * Created by CJJ on 2017/3/16.
 */

public class FooSon {
    String identy;
    int money;
    FooSonChild fooSonChild;

    public String getIdenty() {
        return identy;
    }

    public void setIdenty(String identy) {
        this.identy = identy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public FooSonChild getFooSonChild() {
        return fooSonChild;
    }

    public void setFooSonChild(FooSonChild fooSonChild) {
        this.fooSonChild = fooSonChild;
    }
}
