package com.ms.hotel_reservation.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calc")
public class CalculationsController {

	@RequestMapping("/power")
	public @ResponseBody Calculation power(@RequestParam(value = "base") String base,@RequestParam(value = "exponent")String exponent) {
		List<String> input = new ArrayList<>();
		List<String> output = new ArrayList<>();
		input.add(base);
		input.add(exponent);
		
		output.add(String.valueOf(Math.pow(Double.valueOf(base), Double.valueOf(exponent))));
		return new Calculation(input,output,"power");
	}
	
	@RequestMapping(path = "/sqrt/{value}",produces = "application/json")
	public @ResponseBody Calculation sqrt(@PathVariable(value = "value") double value) {
		List<String> input = new ArrayList<>();
		List<String> output = new ArrayList<>();
		input.add(String.valueOf(value));
		output.add(String.valueOf(Math.sqrt(Double.valueOf(value))));
		return new Calculation(input,output,"sqrt");
	}
	
	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
}
