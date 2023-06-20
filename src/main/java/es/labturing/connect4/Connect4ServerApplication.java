package es.labturing.connect4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.labturing.connect4.dispatchers.DispatcherPrototype;


@SpringBootApplication
@RestController
public class Connect4ServerApplication {

  private DispatcherPrototype dispatcherPrototype;

	private Logic logic;

	private Connect4ServerApplication() {
		this.dispatcherPrototype = new DispatcherPrototype();
		this.logic = new Logic();
		this.logic.createDispatchers(this.dispatcherPrototype);
	}

	private void serve() {
		this.dispatcherPrototype.serve();
	}
  
	public static void main(String[] args) {
		SpringApplication.run(Connect4ServerApplication.class, args);
    new Connect4ServerApplication().serve();
	}

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello %s!", name);
    }

}
