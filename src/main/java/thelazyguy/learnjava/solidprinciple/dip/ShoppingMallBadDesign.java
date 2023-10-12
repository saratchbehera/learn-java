package thelazyguy.learnjava.solidprinciple.dip;

public class ShoppingMallBadDesign {private BankCard bankCard;public ShoppingMallBadDesign(BankCard bankCard) {
        this.bankCard = bankCard;
    }public void doPayment(Object order, int amount){
        bankCard.doTransaction(amount);
    }public static void main(String[] args) {
        BankCard bankCard= (BankCard) new CreditCard();
        ShoppingMallBadDesign shoppingMallBadDesign1 =new ShoppingMallBadDesign(bankCard);
        shoppingMallBadDesign1.doPayment("do some order", 10000);
    }
}