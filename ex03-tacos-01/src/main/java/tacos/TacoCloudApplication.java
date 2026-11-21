package tacos;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import tacos.Ingredient.Type;
import tacos.data.IngredientRepository;

@SpringBootApplication
public class TacoCloudApplication {

  public static void main(String[] args) {
    SpringApplication.run(TacoCloudApplication.class, args);
  }

  @Bean
  public CommandLineRunner dataLoader(IngredientRepository repo) {
    return new CommandLineRunner() {
      @Override
      public void run(String... args) throws Exception {
        repo.save(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP, new BigDecimal("1.50")));
        repo.save(new Ingredient("COTO", "Corn Tortilla", Type.WRAP, new BigDecimal("1.50")));
        repo.save(new Ingredient("WWTO", "Whole Wheat Tortilla", Type.WRAP, new BigDecimal("1.75")));
        repo.save(new Ingredient("GRBF", "Ground Beef", Type.PROTEIN, new BigDecimal("2.50")));
        repo.save(new Ingredient("CARN", "Carnitas", Type.PROTEIN, new BigDecimal("2.75")));
        repo.save(new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES, new BigDecimal("0.75")));
        repo.save(new Ingredient("LETC", "Lettuce", Type.VEGGIES, new BigDecimal("0.50")));
        repo.save(new Ingredient("CHED", "Cheddar", Type.CHEESE, new BigDecimal("1.00")));
        repo.save(new Ingredient("JACK", "Monterrey Jack", Type.CHEESE, new BigDecimal("1.00")));
        repo.save(new Ingredient("SLSA", "Salsa", Type.SAUCE, new BigDecimal("0.50")));
        repo.save(new Ingredient("SRCR", "Sour Cream", Type.SAUCE, new BigDecimal("0.75")));
        repo.save(new Ingredient("COLA", "Cola", Type.DRINK, new BigDecimal("1.25")));
        repo.save(new Ingredient("WATR", "Mineral Water", Type.DRINK, new BigDecimal("1.00")));
      }
    };
  }
  
}
