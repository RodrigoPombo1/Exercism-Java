public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        double multiplier = daysSkipped >= 7 ? 0.85 : 1;
        return multiplier;
    }

    public int multiplierPerProductsSold(int productsSold) {
        int multiplier = productsSold > 20 ? 13 : 10;
        return multiplier;
    }

    public double bonusForProductSold(int productsSold) {
        return productsSold * multiplierPerProductsSold(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = 1000 * multiplierPerDaysSkipped(daysSkipped) + bonusForProductSold(productsSold);
        return salary > 2000 ? 2000 : salary;
    } 
}
