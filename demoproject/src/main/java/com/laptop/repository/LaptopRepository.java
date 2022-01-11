package com.laptop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.laptop.entity.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long>{
	
	@Query(value = "select * from Laptops",nativeQuery = true)
	List<Laptop>getAllRecords();
	

}
