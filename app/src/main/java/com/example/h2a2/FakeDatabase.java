package com.example.h2a2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FakeDatabase {

    public static Menu getMenuByID(int menuID) {
        return menus.get(menuID);
    }

    public static ArrayList<Menu> getAllMenus() {
        return new ArrayList<Menu>((List) Arrays.asList(menus.values().toArray()));
    }

    private static final HashMap<Integer, Menu> menus = new HashMap<>();

    static {
        menus.put(1, new Menu(
                1,
                "10",
                "Bopper",
                "The Whopper is the signature sandwich and an associated product line sold by international fast food restaurant chain Burger King and its Australian franchise, Hungry Jack's. Introduced in 1957, the sandwich has undergone several reformulations such as portion resizing and bread changes",
                0
        ));
        menus.put(2, new Menu(
                2,
                "5",
                "Rebel Whopper",
                "Rebel Whopper® features a patty made from plants, flame-grilled to give the irresistible smoky, BBQ flavour just like our classic Whopper. Loaded with crisp fresh lettuce, ripe hand-cut tomatoes, onion, pickles, mayo and tomato sauce on a toasted sesame seed bun.",
                0
        ));
        menus.put(3, new Menu(
                3,
                "12",
                "Whopper Cowboy your way",
                "Try our new Whopper® Cowboy Your Way range. Pick a Whopper Cowboy and stack with single, double or triple flame-grilled beef. It's your Whopper, your way!",
                0
        ));
        menus.put(4, new Menu(
                4,
                "15",
                "Double Whopper",
                "Think of a Whopper®. Think of the crispy lettuce and ripe tomato. Think of the freshly-toasted sesame seed bun. Think of the flame-grilled Aussie beef. Now double it",
                0
        ));
        menus.put(5, new Menu(
                5,
                "14",
                "Rebel Whopper",
                "Rebel Whopper® features a patty made from plants, flame-grilled to give the irresistible smoky, BBQ flavour just like our classic Whopper. Loaded with crisp fresh lettuce, ripe hand-cut tomatoes, onion, pickles, mayo and tomato sauce on a toasted sesame seed bun.",
                0
        ));
        menus.put(6, new Menu(
                6,
                "10",
                "WHOPPER® CHEESE",
                "All the flame-grilled, flavour-packed perfection of a Whopper®, but topped with a slice of cheese.",
                0
        ));
        menus.put(7, new Menu(
                7,
                "12",
                "DOUBLE WHOPPER® CHEESE",
                "Double the flavour with two flame-grilled Australian beef patties with no added hormones. Topped with cheese, ripe hand-cut tomato, fresh lettuce, onion, pickles, mayo and tomato sauce on a toasted sesame seed bun.",
                0
        ));
        menus.put(8, new Menu(
                8,
                "8",
                "WHOPPER® JUNIOR",
                "It's just like the legendary Whopper®, only smaller. Same great flame-grilled Australian beef with no added hormones, ripe hand-cut tomato, fresh lettuce, onion, pickles, mayo and tomato sauce on a toasted sesame seed bun.",
                0
        ));
        menus.put(9, new Menu(
                9,
                "13",
                "WHOPPER® JUNIOR CHEESE",
                "The legendary Whopper® but smaller with a slice of melted cheese for added burger bliss. Same great flame-grilled Australian beef, ripe hand-cut tomato, fresh lettuce, onion, pickles, mayo and tomato sauce on a toasted sesame seed bun.",
                0
        ));
        menus.put(10, new Menu(
                10,
                "14",
                "ULTIMATE DOUBLE WHOPPER®",
                "Hold onto your taste buds, this Whopper® has got the lot. Two flame-grilled 100% Australian beef patties with no added hormones, two slices of cheese, premium eye bacon, hand-cut tomatoes, lettuce, pickles, onion, mayo and tomato sauce on a toasted sesame seed bun.",
                0

        ));        menus.put(11, new Menu(
                11,
                "85",
                "VEGAN CHEESEBURGER",
                "Yes, 100% Vegan! Double vegan patty (made from corn, capsicum and carrot), vegan cheese and vegan mayonnaise with tomato sauce, onions, fresh tomato and crisp lettuce on a delicious seeded bun.",
                0
        ));        menus.put(12, new Menu(
                12,
                "10",
                "ANGRY WHOPPER®",
                "We took the world’s happiest burger and got it all riled up with onion, jalapeno and ketchup. This could be the first burger to bite back.",
                0
        ));        menus.put(13, new Menu(
                13,
                "13",
                "CHEESY BACON LOADED CHIPS",
                "Crispy, Thick Cut Chips, topped with cheesy sauce and real crumbled bacon",
                0
        ));
        menus.put(14, new Menu(
                14,
                "7",
                "OVERLOADED CHEESY BACON LOADED CHIPS",
                "Our Crispy, Thick Cut Chips, overloaded with double the cheesy Sauce and real crumbled bacon.",
                0
        ));        menus.put(15, new Menu(
                15,
                "6",
                "CHICKEN NUGGETS (3, 6, 12 PACK)",
                "Crispy, golden nuggets made with 100% chicken breast, cooked in sunflower and canola oil for a better tasting golden finish. Our nuggets are as good as gold. Choose from our delicious dipping sauces BBQ, Spicy, Honey Mustard or Sweet 'n Sour sauce. Available 3, 6 or 12 pack.",
                0
        ));





    }

}
