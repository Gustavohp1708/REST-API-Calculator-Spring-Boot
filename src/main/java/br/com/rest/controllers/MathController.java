package br.com.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.rest.exceptions.UnsupportedMathOperationException;
import br.com.rest.functions.Converter;
import br.com.rest.functions.SimpleMath;

@RestController
public class MathController {	
	
	@GetMapping(value = "/sum/{numberOne}/{numberTwo}")
	public Double sum(@PathVariable(value = "numberOne")String numberOne, @PathVariable(value = "numberTwo")String numberTwo) throws Exception{
		
		if (!Converter.isNumeric(numberOne) || !Converter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value.");
		}
		return SimpleMath.sum(Converter.convertToDouble(numberOne), Converter.convertToDouble(numberTwo));
		
	}
	
	@GetMapping(value = "/subtraction/{numberOne}/{numberTwo}")
	public Double subtraction(@PathVariable(value = "numberOne")String numberOne, @PathVariable(value = "numberTwo")String numberTwo) throws Exception{
		
		if (!Converter.isNumeric(numberOne) || !Converter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value.");
		}
		return SimpleMath.subtraction(Converter.convertToDouble(numberOne), Converter.convertToDouble(numberTwo));
		
	}
	
	@GetMapping(value = "/multiplication/{numberOne}/{numberTwo}")
	public Double multiplication(@PathVariable(value = "numberOne")String numberOne, @PathVariable(value = "numberTwo")String numberTwo) throws Exception{
		
		if (!Converter.isNumeric(numberOne) || !Converter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value.");
		}
		return SimpleMath.multiplication(Converter.convertToDouble(numberOne), Converter.convertToDouble(numberTwo));
		
	}
	@GetMapping(value = "/division/{numberOne}/{numberTwo}")
	public Double division(@PathVariable(value = "numberOne")String numberOne, @PathVariable(value = "numberTwo")String numberTwo) throws Exception{
		
		if (!Converter.isNumeric(numberOne) || !Converter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value.");
		}
		return SimpleMath.division(Converter.convertToDouble(numberOne), Converter.convertToDouble(numberTwo));
		
	}

	
}
