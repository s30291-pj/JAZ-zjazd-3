package pl.edu.pjwstk.s30291.jaz.zjazd3.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Car {
	@Getter 
	private String mark;
	
	@Getter 
	private String model;
	
	@Getter 
	private LocalDate production;
}
