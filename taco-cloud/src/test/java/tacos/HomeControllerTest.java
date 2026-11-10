package tacos;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

// import tacos.HomeController;

@WebMvcTest(HomeController.class)   // <1> Web test for HomeController
public class HomeControllerTest {

  @Autowired
  private MockMvc mockMvc;   // <2> Inject MockMvc

  @Test
  public void testHomePage() throws Exception {
    mockMvc.perform(get("/"))    // <3> Perform GET /
      .andExpect(status().isOk())  // <4> Expects HTTP 200 OK
      .andExpect(view().name("home"))  // <5> Expects home view to be returned
      .andExpect(content().string(           // <6> Expects content to contain "Welcome to..."
          containsString("Welcome to...")));
  }

}
