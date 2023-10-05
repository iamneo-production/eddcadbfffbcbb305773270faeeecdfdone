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
        // Implement the logic to add a new laptop to the list
        // You can return true if the laptop is successfully added, or false if there's an issue.
        laptops.add(laptop);
        return true; // Modify this logic accordingly.
    }

    @GetMapping("/{laptopid}")
    public Laptop getLaptopById(@PathVariable int laptopid) {
        // Implement the logic to retrieve a laptop by its ID
        // You should search the list of laptops and return the corresponding laptop object.
        return laptops.stream()
                .filter(laptop -> laptop.getLaptopid() == laptopid)
                .findFirst()
                .orElse(null);
    }

    @GetMapping
    public List<Laptop> getAllLaptops() {
        // Implement the logic to retrieve a list of all laptops
        return laptops;
    }
}
