package aulaja.aulajava;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class localizaçãospring {

	@GetMapping("obtemlocal")
	
	public String obtemlocalização() {
		return "ULALAU";
		
	}
}
