public class ATM50 implements ATM {
    public ATM NextAtm;

    public void setNextAtm(ATM nextAtm) {
        NextAtm = nextAtm;
    }

    public void getMoney (int amountMoney) {
        if(amountMoney/50>0){
            int numberBanknotes=  amountMoney/50;
            int balanceBanknotes=amountMoney-numberBanknotes*50;
            if(balanceBanknotes!=0){
                NextAtm.getMoney(balanceBanknotes);
            }
            System.out.println(numberBanknotes +" notes worth 50 were issued");
            return;
        }
        NextAtm.getMoney(amountMoney);
    }
}
