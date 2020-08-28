package com.qaguru.model;

public enum ProductPriceLabel {
    RANGE_PRICE("$249.99");
    private String price;

    ProductPriceLabel(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }
}
