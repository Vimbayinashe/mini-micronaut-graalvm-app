package example.micronaut.controller;

import example.micronaut.entities.Drink;
import example.micronaut.service.DrinkService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/drinks")
public class DrinkController {

    private final DrinkService drinkService;


    public DrinkController(DrinkService drinkService) {
        this.drinkService = drinkService;
    }

    @Get("/random")
    public Drink randomDrink() {
        return drinkService.randomDrink();
    }
}
