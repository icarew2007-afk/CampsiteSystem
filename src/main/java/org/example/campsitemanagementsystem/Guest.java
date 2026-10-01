package org.example.campsitemanagementsystem;

public class Guest {
    private int identifier;
    private String name;
    private String dateOfBirth;
    private String email;
    private int phoneNumber;
    private LinkedList<Booking> bookings;

    public Guest(int identifier,String name,String dateOfBirth,String email, int phoneNumber){

        this.identifier=identifier;
        this.name=name;
        this.dateOfBirth=dateOfBirth;
        this.email=email;
        this.phoneNumber=phoneNumber;
        bookings = new LinkedList<>();

    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LinkedList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(LinkedList<Booking> bookings) {
        this.bookings = bookings;
    }
}
