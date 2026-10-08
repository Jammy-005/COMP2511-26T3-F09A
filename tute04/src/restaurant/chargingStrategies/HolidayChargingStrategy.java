package restaurant.chargingStrategies;

import java.util.List;

import restaurant.Meal;

public class HolidayChargingStrategy implements ChargingStrategy {
    private final double HOLIDAY_RATE = 1.15;

    @Override
    public double cost(List<Meal> order, boolean isMember) {
        return order.stream().mapToDouble(meal -> meal.getCost() * HOLIDAY_RATE).sum();
    }

    @Override
    public double getModifier() {
        return HOLIDAY_RATE;
    }
}
