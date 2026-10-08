package restaurant;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import restaurant.chargingStrategies.ChargingStrategy;
import restaurant.chargingStrategies.HappyHourChargingStrategy;
import restaurant.chargingStrategies.PrizeChargingStrategy;
import restaurant.chargingStrategies.StandardChargingStrategy;

public class Restaurant {
    private ChargingStrategy chargingStrategy = new StandardChargingStrategy();
    private String name;
    private List<Meal> menu = new ArrayList<Meal>();
    private List<String> members = new ArrayList<String>();

    public Restaurant(String name) {
        this.name = name;
        JSONArray menuJSON = JSONHelper.readInData("src/restaurant/prices.json");

        for (Object Meal : menuJSON) {
            JSONObject jsonMeal = (JSONObject) Meal;
            menu.add(new Meal(jsonMeal.getString("meal"), jsonMeal.getInt("cost")));
        }
    }

    public void setChargingStrategy(ChargingStrategy chargingStrategy) {
        this.chargingStrategy = chargingStrategy;
    }

    public double cost(List<Meal> order, String payee) {
        return chargingStrategy.cost(order, members.contains(payee));
    }

    public void displayMenu() {
        double modifier = chargingStrategy.getModifier();

        for (Meal meal : menu) {
            System.out.println(meal.getName() + " - " + meal.getCost() * modifier);
        }
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant("XS");
        r.setChargingStrategy(new PrizeChargingStrategy());
        for (int i = 0; i < 99; i++) {
            r.cost(new ArrayList<Meal>(), "test");
        }
        r.displayMenu();
    }
}
