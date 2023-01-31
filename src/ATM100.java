public class ATM100 implements ATM {
    public ATM NextAtm;

    public void setNextAtm(ATM nextAtm) {
        NextAtm = nextAtm;
    }

    public void getMoney (int amountMoney) {
        if(amountMoney/100>0){
            int numberBanknotes=  amountMoney/100;
            int balanceBanknotes=amountMoney-numberBanknotes*100;
            if(balanceBanknotes!=0){
                NextAtm.getMoney(balanceBanknotes);
            }
            System.out.println(numberBanknotes +" notes worth 100 were issued");
            return;
        }
        NextAtm.getMoney(amountMoney);
    }
}
