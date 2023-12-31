package com.examly.springapp.controller;

import com.examly.springapp.model.Laptop;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/laptops")
public class LaptopController {
    private List<Laptop> laptops = new ArrayList<>();

    @PostMapping
    public boolean addLaptop(@RequestBody Laptop laptop) {
        // Initialize the list if it's not already created (assuming it's declared as an instance variable).
        if (laptops == null) {
            laptops = new ArrayList<>();
        }
    
        // Add the provided laptop to the list.
        laptops.add(laptop);
    
        // Return true to indicate that the laptop was successfully added.
        return true;
    }
    
    @GetMapping("/{laptopid}")
    public Laptop getLaptopById(@PathVariable int laptopid) {
        // Implement the logic to retrieve a laptop by its ID
        // You should search the list of laptops and return the corresponding laptop object.
        for (Laptop laptop : laptops) {
            if (laptop.getLaptopid() == laptopid) {
                return laptop;
            }
        }
        return null; // Return null if the laptop with the specified ID is not found.
    }

    @GetMapping
    public List<Laptop> getAllLaptops() {
        // Implement the logic to retrieve a list of all laptops
        return laptops; // Return the list of all laptops stored in the "laptops" list.
    }
}
