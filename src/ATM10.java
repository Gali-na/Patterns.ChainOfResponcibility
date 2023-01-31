public class ATM10 implements ATM {
    public ATM NextAtm;

    public void setNextAtm(ATM nextAtm) {
        NextAtm = nextAtm;
    }

    public void getMoney (int amountMoney) {
        if(amountMoney/10>0){
            int numberBanknotes=  amountMoney/10;
            int balanceBanknotes=amountMoney-numberBanknotes*10;
            if(balanceBanknotes!=0){
                NextAtm.getMoney(balanceBanknotes);
            }
            System.out.println(numberBanknotes +" notes worth 10 were issued");
            return;
        }
        NextAtm.getMoney(amountMoney);
    }
}
