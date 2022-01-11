package com.laptop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptop.entity.Laptop;
import com.laptop.repository.LaptopRepository;

@RestController

public class LaptopController {
	@Autowired
	private LaptopRepository repo;
	@PostMapping("/Laptops/save")
	public Laptop saveData(@RequestBody Laptop laptop) {
		return repo.save(laptop);
		
	}
@GetMapping("/Laptops")
public List<Laptop> readData(){
	return repo.getAllRecords();
}

}
