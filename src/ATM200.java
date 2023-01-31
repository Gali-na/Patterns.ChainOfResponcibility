public class ATM200 implements ATM {
    public ATM NextAtm;

    public void setNextAtm(ATM nextAtm) {
        NextAtm = nextAtm;
    }

    public void getMoney (int amountMoney) {
        if(amountMoney/200>0){
            int numberBanknotes=  amountMoney/200;
            int balanceBanknotes=amountMoney-numberBanknotes*200;
            if(balanceBanknotes!=0){
                NextAtm.getMoney(balanceBanknotes);
            }
            System.out.println(numberBanknotes +" notes worth 200 were issued");
            return;
        }
        NextAtm.getMoney(amountMoney);
    }
}
