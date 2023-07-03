
public class Main {
    public static void main(String[] args) {

        int rechargeAmount = 1100; // сумма пополнения
        int balance = 100; // начальный баланс
        double bonusAmount = 0;
        if (rechargeAmount >= 1000){

            bonusAmount = (double) rechargeAmount / 100;

        }
        double total = balance + rechargeAmount + bonusAmount;

        System.out.println(bonusAmount + " начисленных бонусов");
        System.out.println(" итоговая сумма на счету " + total);


    }
}