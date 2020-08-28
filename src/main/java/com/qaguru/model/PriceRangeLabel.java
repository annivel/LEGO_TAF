package com.qaguru.model;

public enum PriceRangeLabel {
    RANGE_100("$100+"), RANGE_75_100("$75 - $100");

    private String price;

    PriceRangeLabel(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }
}
