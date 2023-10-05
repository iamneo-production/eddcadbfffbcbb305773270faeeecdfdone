package com.examly.springapp.service;

import com.examly.springapp.model.Laptop;

import java.util.ArrayList;
import java.util.List;

public class ApiService {
    private List<Laptop> laptops = new ArrayList<>();

    public boolean addLaptop(Laptop laptop) {
        // Implement the logic to add a new laptop to the list
        // You can return true if the laptop is successfully added, or false if there's an issue.
        laptops.add(laptop);
        return true; // Modify this logic accordingly.
    }

    public Laptop getLaptopById(int laptopid) {
        // Implement the logic to retrieve a laptop by its ID
        // You should search the list of laptops and return the corresponding laptop object.
        for (Laptop laptop : laptops) {
            if (laptop.getLaptopid() == laptopid) {
                return laptop;
            }
        }
        return null; // Return null if the laptop with the specified ID is not found.
    }

    public List<Laptop> getAllLaptops() {
        // Implement the logic to retrieve a list of all laptops
        return laptops; // Return the list of all laptops stored in the "laptops" list.
    }
}
