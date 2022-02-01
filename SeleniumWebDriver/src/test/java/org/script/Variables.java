package org.script;

import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Variables {
    String title;
    String size;
    String vendor_code;
    int quantity;
    double price;

    public double getPrice() { return price; }
    public void setPrice(double price) {this.price = price;}

    public String getVendorCode() { return vendor_code; }
    public void setVendorCode(String vendor_code) {
        this.vendor_code = vendor_code;
    }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) {this.quantity = quantity;}

    public String getSize() { return size; }
    public void setSize(String size) {
        this.size = size;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) {
        this.title = title;
    }
}
