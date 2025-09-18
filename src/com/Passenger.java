package com;

public class Passenger {
    private String bookingId;

    private String name;

    private int age;

    private int seatsBooked;

    public String getBookingId(){
        return bookingId;
    }

    public int getSeatsBooked(){
        return seatsBooked;
    }

    @Override
    public String toString(){
        return "Passenger{ Booking ID: " + bookingId + ", Name: " + name + ", Age: " + age + ", Seats Booked: " + seatsBooked + " }";
    }
}
