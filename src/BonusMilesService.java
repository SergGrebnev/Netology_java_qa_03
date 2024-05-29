public class BonusMilesService {
    public int calculate(int price) {
        int bonusMilePrice = 20;  // количество рублей для одной бонусной мили

        int bonus_mile = price / bonusMilePrice; // количество бонусных миль
        return (bonus_mile);
    }
}
