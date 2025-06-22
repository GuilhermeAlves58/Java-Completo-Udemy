package secao16.defaultMethods.services;

import secao14.Exerficacao00.exception.InvalidOperationException;

import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestService {
    private double interestRate;

    public BrazilInterestService(double interestRate){
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

}
