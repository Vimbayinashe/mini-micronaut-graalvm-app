package example.micronaut.service;

import example.micronaut.entities.Drink;
import jakarta.inject.Singleton;

import java.util.List;
import java.util.Random;

@Singleton
public class DrinkService {

    private static final List<Drink> DRINK_LIST = List.of(
            new Drink("Sprite"),
            new Drink("Coca Cola"),
            new Drink("Fanta"),
            new Drink("Sparletta"),
            new Drink("Oracle Code One"),
            new Drink("CommitConf"),
            new Drink("Codemotion Madrid")
    );

    public Drink randomDrink() {
        return DRINK_LIST.get(new Random().nextInt(DRINK_LIST.size()));
    }
}
