package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 4/30/17.
 */
public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {

        switch (cardType){
            case GOLD:
                return new VisaGoldCreditCard();
            case PLATINUM:
                return new VisaPlatinumCreditCard();
            default:
                break;
        }

        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return null;
    }
}
