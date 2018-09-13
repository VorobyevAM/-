import child.Child;
import food.Food;
import food.foodCharacteristics.HealthyFoodCharecteristics;
import food.foodCharacteristics.TastyFoodCharacteristics;
import myException.ChildDontWantItException;
import myException.NotTastyException;

public class Main {

    public static void main(String[] args) {

        System.setErr(System.out);

        Food apple = new Food("Яблоко", HealthyFoodCharecteristics.HIGH_HEALTHY, TastyFoodCharacteristics.MIDDLE_TASTY);

        Food chips = new Food("Чипсы", HealthyFoodCharecteristics.VERYJUNK, TastyFoodCharacteristics.HIGH_TASTY);

        Food soap = new Food("Суп", HealthyFoodCharecteristics.HIGH_HEALTHY, TastyFoodCharacteristics.VERYTASTELESS);

        try {
            momCheck(soap);
        } catch (ChildDontWantItException e) {
            e.printStackTrace();
            return;
        }
        System.out.println("Мама: \"Обед окончен!\"");
    }

    private static void momCheck(Food food) throws ChildDontWantItException {
        Child alex = new Child();
        if (food.getCharacterHealt()==HealthyFoodCharecteristics.JUNK | food.getCharacterHealt()==HealthyFoodCharecteristics.VERYJUNK) {
            throw new ChildDontWantItException("Мама не разрешает есть вредную еду!");
        } else {
            try {
                alex.childCheckFood(food);
            } catch (NotTastyException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Спасибо мама!");
            }
        }
    }
}