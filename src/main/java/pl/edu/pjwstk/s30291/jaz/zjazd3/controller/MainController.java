package pl.edu.pjwstk.s30291.jaz.zjazd3.controller;

import java.time.LocalDate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pl.edu.pjwstk.s30291.jaz.zjazd3.model.Car;

@RestController
@RequestMapping("/")
public class MainController {

	@GetMapping("/test/hello")
	public ResponseEntity<String> getHelloWorld(@RequestParam String reqParam) {
		return ResponseEntity.ok(reqParam);
	}
	
	@GetMapping("/test/model")
	public ResponseEntity<Car> getCarModel() {
		return ResponseEntity.ok(new Car("Tesla", "Model X", LocalDate.now()));
	}
	
	@GetMapping("/test/hello/{someValue}")
	public ResponseEntity<String> getHelloWorldWithSomeValue(@PathVariable String someValue) {
		return ResponseEntity.ok(someValue);
	}
	
	@PostMapping("/test/model")
	public ResponseEntity<Car> getCarModelByBody(@RequestBody Car car) {
		return ResponseEntity.ok(new Car(car.getMark(), car.getModel(), car.getProduction()));
	}
	
	
	
}
