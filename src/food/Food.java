package food;

import food.foodCharacteristics.HealthyFoodCharecteristics;
import food.foodCharacteristics.TastyFoodCharacteristics;

public class Food {

    private String nameFood;

    private HealthyFoodCharecteristics characterHealt; //Характеристика полезности еды

    private TastyFoodCharacteristics characterTasty; //Характеристика вкусности еды

    public Food(String nameFood, HealthyFoodCharecteristics healthyFoodCharecteristicsForThisFood, TastyFoodCharacteristics tastyFoodCharacteristicsForThisFood) {
        this.nameFood = nameFood;
        this.characterHealt = healthyFoodCharecteristicsForThisFood;
        this.characterTasty = tastyFoodCharacteristicsForThisFood;
    }

    public HealthyFoodCharecteristics getCharacterHealt() {
        return characterHealt;
    }

    public TastyFoodCharacteristics getCharacterTasty() {
        return characterTasty;
    }
}