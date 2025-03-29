package pl.edu.pjwstk.s30291.jaz.zjazd3.homework;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/homework")
public class HomeworkController {

	private StudentService service;
	
	public HomeworkController(StudentService service) {
		this.service = service;
	}
	
	@GetMapping
	public ResponseEntity<Student> getStudentByParam(@RequestParam UUID uuid) {
		return ResponseEntity.of(service.get(uuid));
	}
	
	@GetMapping("/{uuid}")
	public ResponseEntity<Student> getStudentByPath(@PathVariable UUID uuid) {
		return ResponseEntity.of(service.get(uuid));
	}
	
	@PostMapping
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		return ResponseEntity.ok(service.create(student));
	}
	
	@PutMapping
	public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
		return ResponseEntity.ok(service.update(student));
	}
	
	@DeleteMapping("/{uuid}")
	public ResponseEntity deleteStudent(@PathVariable UUID uuid) {
		service.delete(uuid);
		return ResponseEntity.ok().build();
	}
	
}
