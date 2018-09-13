package food.foodCharacteristics;

public enum TastyFoodCharacteristics {

    HIGH_TASTY ("Очень вкусная"),MIDDLE_TASTY("Вкусная"),SMALL_TASTY("Почти вкусная"), TASTELESS("Невкусная"), VERYTASTELESS("Отвратительная");

    private String nameTastyFoodCharacteristic;

    TastyFoodCharacteristics(String nameTastyFoodCharacteristic) {
        this.nameTastyFoodCharacteristic = nameTastyFoodCharacteristic;
    }
}