package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller            // <1> The controller annotation indicates that this class is a Spring MVC controller
public class HomeController {

  @GetMapping("/")     // <2> Handles requests for the root path ("/")
  public String home() {
    return "home";     // <3> Returns the view name
  }

}
