public class ATM20 implements ATM {
    public ATM NextAtm;

    public void setNextAtm(ATM nextAtm) {
        NextAtm = nextAtm;
    }

    public void getMoney (int amountMoney) {
        if(amountMoney/20>0){
            int numberBanknotes=  amountMoney/20;
            int balanceBanknotes=amountMoney-numberBanknotes*20;
            if(balanceBanknotes!=0){
                NextAtm.getMoney(balanceBanknotes);
            }
            System.out.println(numberBanknotes +" notes worth 20 were issued");
            return;
        }
        NextAtm.getMoney(amountMoney);
    }
}
