package org.example.server;

import javax.xml.ws.Endpoint;

public class CountryServicePublisher {

    public static void main(String[] args) {
        Endpoint endpoint = Endpoint.create(new CountryServiceImpl());
        endpoint.publish("http://localhost:8888/ws/country");

        System.out.println("Country web service ready to consume requests!");
    }
}