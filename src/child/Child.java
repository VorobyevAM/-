package child;

import food.Food;
import food.foodCharacteristics.TastyFoodCharacteristics;
import myException.NotTastyException;

public class Child {

    public String childCheckFood(Food food) throws NotTastyException {
            //Дети любят вкусную еду. Ребенок пробует еду и говорит вкусно или нет.
            if (food.getCharacterTasty()== TastyFoodCharacteristics.VERYTASTELESS | food.getCharacterTasty()==TastyFoodCharacteristics.TASTELESS | food.getCharacterTasty()==TastyFoodCharacteristics.SMALL_TASTY){
                throw new NotTastyException("Не вкусно! Но мама заставляет... Ребенок всю порцию не съел....");
            }
        String eatChildState = "Покушал";
        System.out.println(eatChildState);
        return eatChildState;
    }

}