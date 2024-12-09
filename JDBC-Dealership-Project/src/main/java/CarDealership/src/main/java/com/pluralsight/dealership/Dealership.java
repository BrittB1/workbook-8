package CarDealership.src.main.java.com.pluralsight.dealership;

import java.util.ArrayList;

public class Dealership {
    private int dealership_id;
    private String name;
    private String address;
    private String phone;
    private ArrayList<Dealership> dealership;

    public int getDealership_id() {return dealership_id;}

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public ArrayList<Dealership> getVehicle() {
        return dealership;
    }

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        dealership = new ArrayList<>();
    }

    }