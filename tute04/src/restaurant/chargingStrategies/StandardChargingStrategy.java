package restaurant.chargingStrategies;

import java.util.List;

import restaurant.Meal;

public class StandardChargingStrategy implements ChargingStrategy {
    private final double STANDARD_RATE = 1.0;

    @Override
    public double cost(List<Meal> order, boolean isMember) {
        return order.stream().mapToDouble(meal -> meal.getCost()).sum();
    }

    @Override
    public double getModifier() {
        return STANDARD_RATE;
    }
}