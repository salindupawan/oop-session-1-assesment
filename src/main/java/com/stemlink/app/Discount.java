package com.stemlink.app;

public interface Discount {
    double applyDiscount(double percent);
    double finalAmount();
}
