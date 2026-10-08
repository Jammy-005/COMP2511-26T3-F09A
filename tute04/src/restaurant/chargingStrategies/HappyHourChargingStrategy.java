package restaurant.chargingStrategies;

import java.util.List;

import restaurant.Meal;

public class HappyHourChargingStrategy implements ChargingStrategy {
    private final double HAPPY_HOUR_RATE = 0.7;

    @Override
    public double cost(List<Meal> order, boolean isMember) {
        if (isMember) {
            return order.stream().mapToDouble(meal -> meal.getCost() * 0.6).sum();
        } else {
            return order.stream().mapToDouble(meal -> meal.getCost() * 0.7).sum();
        }
    }

    @Override
    public double getModifier() {
        return HAPPY_HOUR_RATE;
    }
}