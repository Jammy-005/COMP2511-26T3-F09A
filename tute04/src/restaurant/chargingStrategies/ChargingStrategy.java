package restaurant.chargingStrategies;

import java.util.List;

import restaurant.Meal;

public interface ChargingStrategy {
    public abstract double cost(List<Meal> order, boolean isMember);

    public abstract double getModifier();
}
