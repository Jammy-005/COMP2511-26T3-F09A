package restaurant.chargingStrategies;

import java.util.List;

import restaurant.Meal;

/**
 * Prize Draw: A special promotion 
 * where every 100th customer (since the start of the promotion) gets their meal for free!
 */
public class PrizeChargingStrategy implements ChargingStrategy {
    private final double STANDARD_RATE = 1.0;
    private int numCustomers = 0;

    @Override
    public double cost(List<Meal> order, boolean isMember) {
        numCustomers++;
        if (numCustomers % 100 == 0) {
            return 0;
        } else {
            return order.stream().mapToDouble(meal -> meal.getCost()).sum();
        }
    }

    @Override
    public double getModifier() {
        return STANDARD_RATE;
    }
}
