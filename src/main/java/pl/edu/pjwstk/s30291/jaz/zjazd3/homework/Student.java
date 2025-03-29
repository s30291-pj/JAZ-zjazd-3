package pl.edu.pjwstk.s30291.jaz.zjazd3.homework;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Student {
	private UUID uuid;
	private String name;
	private String surname;
	private int age;
}
