package com.stemlink.app;

public interface Payable {
    boolean validate();
    String getReference();
}
