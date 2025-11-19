package Mastery;
public class InvestmentTime {
    public static void main(String[] args) {
        double startingMoney = 2500;
        double annualIncrease = 0.075;  
        double moneygoals = 5000;
         int years = 0;
 double currentAmount = startingMoney;
        while (currentAmount < moneygoals) {
            currentAmount += currentAmount * annualIncrease;  
            years++;
        }
        System.out.println("It will take you " + years + " years for your intitial investment to reach $5,000");
    }
}

