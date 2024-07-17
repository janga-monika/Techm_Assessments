package com.example.curtainmodel.curtain_model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurtainController {
	
	@Autowired
	private CurtainRepository curtainRepository;
	 
	@GetMapping("/curtains/byPrice")
    public List<Curtain> getCurtainsByPrice(@RequestParam int price) {
        return curtainRepository.getIdByPrice(price);
    }

    @GetMapping("/curtains/byBrand")
    public List<Curtain> getCurtainsByBrand(@RequestParam String brand) {
        return curtainRepository.getIdByBrand(brand);
    }
}
