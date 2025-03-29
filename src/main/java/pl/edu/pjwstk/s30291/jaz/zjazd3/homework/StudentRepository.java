package pl.edu.pjwstk.s30291.jaz.zjazd3.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
	private Map<UUID, Student> students = new HashMap<>();
	
	public Optional<Student> get(UUID uuid) {
		Student student = students.get(uuid);
		
		return (student != null) ? Optional.of(student) : Optional.empty();
	}
	
	public boolean contains(UUID uuid) {
		return uuid != null && get(uuid).isPresent();
	}
	
	public boolean contains(Student student) {
		return student != null && contains(student.getUuid());
	}
	
	public Student create(Student student) {
		UUID uuid = UUID.randomUUID();
		Student clone = new Student(uuid, 
								student.getName(), 
								student.getSurname(), 
								student.getAge());
		
		students.put(uuid, clone);
		
		return clone;
	}
	
	public Student update(Student student) {
		if(!contains(student.getUuid())) throw new IllegalArgumentException("Nie odnaleziono studenta o danym ID!");
		
		students.put(student.getUuid(), student);
		
		return student;
	}
	
	public void delete(UUID uuid) {
		if(!contains(uuid)) throw new IllegalArgumentException("Nie odnaleziono studenta o danym ID!");
		
		students.remove(uuid);
	}
		
	
}
