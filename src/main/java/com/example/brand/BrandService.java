package com.example.brand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BrandService {

	private List<Brand> brands = new ArrayList<>(Arrays.asList(
			new Brand("Maruti","swift"),
			new Brand("Hyundai","verna")
			));
	
	public List<Brand> getAllBrands(){
		return brands; 
	}

	public void addBrand(Brand brand) {
		brands.add(brand);
		
	}
}
