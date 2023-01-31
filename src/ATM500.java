public class ATM500 implements ATM {
    public ATM NextAtm;

    public void setNextAtm(ATM nextAtm) {
        NextAtm = nextAtm;
    }

    public void getMoney (int amountMoney) {
        if(amountMoney/500>0){
            int numberBanknotes=  amountMoney/500;
            int balanceBanknotes=amountMoney-numberBanknotes*500;
            if(balanceBanknotes!=0){
                NextAtm.getMoney(balanceBanknotes);
            }
            System.out.println(numberBanknotes +" notes worth 500 were issued");
            return;
        }
        NextAtm.getMoney(amountMoney);
    }
}
