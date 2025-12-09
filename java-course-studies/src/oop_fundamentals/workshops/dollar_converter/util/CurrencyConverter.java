package oop_fundamentals.workshops.dollar_converter.util;

public class CurrencyConverter {

    public static final double IOF = 0.06;
    public static double dollarToReal(double amount, double dollarPrice){
        double total = amount * dollarPrice;
        return total + (total * IOF);

    }
}
