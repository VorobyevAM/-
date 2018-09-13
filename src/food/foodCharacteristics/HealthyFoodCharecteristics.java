package food.foodCharacteristics;

public enum HealthyFoodCharecteristics {

    HIGH_HEALTHY("Очень полезная"),MIDDLE_HEALTHY("Полезная"),SMALL_HEALTY("Мало полезная"), JUNK("Вредная"), VERYJUNK("Очень вредная");

    private String nameHealthyFoodCharecteristic;

    HealthyFoodCharecteristics(String nameHealthyFoodCharecteristic) {
        this.nameHealthyFoodCharecteristic = nameHealthyFoodCharecteristic;
    }
}