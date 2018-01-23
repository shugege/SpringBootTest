package sprint_boot_helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2Controller {
	
	@RequestMapping("/helloNew")
	public String helloNew() {
		return "new hello-2018-01-23 00";
	}

}
