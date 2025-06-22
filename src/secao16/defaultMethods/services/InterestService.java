package secao16.defaultMethods.services;

import java.security.InvalidParameterException;

public interface InterestService {
    double getInterestRate();

    default double payment(double amount, int months){
        if (amount < 1){
            throw new InvalidParameterException("Must be above zero");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100, months);
    }

}
