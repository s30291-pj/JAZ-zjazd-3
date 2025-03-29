package pl.edu.pjwstk.s30291.jaz.zjazd3.homework;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private StudentRepository repository;
	
	public StudentService(StudentRepository repository) {
		this.repository = repository;
	}
	
	public Optional<Student> get(UUID uuid) {
		return repository.get(uuid);
	}
	
	public boolean contains(UUID uuid) {
		return repository.contains(uuid);
	}
	
	public boolean contains(Student student) {
		return repository.contains(student);
	}
	
	public Student create(Student student) {
		return repository.create(student);
	}
	
	public Student update(Student student) {
		return repository.update(student);
	}
	
	public void delete(UUID uuid) {
		repository.delete(uuid);
	}
}
