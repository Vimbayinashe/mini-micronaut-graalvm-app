package example.micronaut.entities;

import io.micronaut.core.annotation.Introspected;

@Introspected   // creates a BeanIntrospection
public class Drink {

    private final String name;

    public Drink(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

// BeanIntrospection:
// This interface allows you to instantiate and read and write to bean properties without using reflection or caching reflective metadata,
// which is expensive from a memory consumption perspective.
