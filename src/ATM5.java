public class ATM5 implements ATM {
    public ATM NextAtm;

    public void setNextAtm(ATM nextAtm) {
        NextAtm = nextAtm;
    }

    public void getMoney (int amountMoney) {
        if(amountMoney/5>0){
            int numberBanknotes=  amountMoney/5;
            int balanceBanknotes=amountMoney-numberBanknotes;
            System.out.println(numberBanknotes +" notes worth 5 were issued");
        }
    }
}
