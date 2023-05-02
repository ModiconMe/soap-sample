package org.example.server;

public enum Currency {

    EUR, INR, USD;

    public String value() {
        return name();
    }

    public static Currency fromValue(String v) {
        return valueOf(v);
    }

}
