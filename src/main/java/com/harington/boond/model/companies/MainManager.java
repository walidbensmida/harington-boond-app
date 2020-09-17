package com.harington.boond.model.companies;

public class MainManager {

    public Data data;

    public MainManager() {
    }

    public MainManager(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
