import java.util.*;
public class pizz {
    public static void main(String args[]) {
        String pizza, veg, extra_cheese, extra_topping, take_away, ketchup, bottle, soft_drink, bag;
        Scanner bc = new Scanner(System.in);
        System.out.println("enter your pizza[normal/delux]");
        pizza = bc.next();
        System.out.println("what type you want[veg/non veg]");
        veg = bc.next();
        System.out.println("you want cheese[yes/no]");
        extra_cheese = bc.next();
        System.out.println("do you want extra topping[yes/no]");
        extra_topping = bc.next();
        System.out.println("do you take away[yes/no]");
        take_away = bc.next();
        System.out.println("do you wany ketchup[yes/no]");
        ketchup = bc.next();
        System.out.println("do you want bottle[yes/no]");
        bottle = bc.next();
        System.out.println("do you want soft drinks[yes/no]");
        soft_drink = bc.next();
        System.out.println("do you want bag[yes/no]");
        bag = bc.next();
        if (pizza.equals("normal")) {
            if (veg.equals("veg")) {
                System.out.println("normal veg-pizza:300/-");
            } else {
                System.out.println("normal non veg-pizza: 400/-");
            }

        }

        if (pizza.equals("delux")) {
            if (veg.equals("veg")) {
                System.out.println("delux veg pizza: 600/_");
            } else {
                System.out.println("delux non veg pizza: 800/-");
            }
        }

        if (extra_cheese.equals("yes")) {
            System.out.println("extra cheese costs: 100-");
        } else {
            System.out.println("no cheese added");
        }

        if (extra_topping.equalsIgnoreCase("yes")) {
            System.out.println("extra topping costs :100/-");
        } else {
            System.out.println("no extra topping");
        }

        if (take_away.equals("yes")) {
            System.out.println("take away costs: per bag 20/-");
        } else {
            System.out.println("no bags want");
        }

        if (ketchup.equals("yes")) {
            System.out.println("ketchup costs : 5/-");
        }
    }
}












