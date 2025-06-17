package secao16.ExerFixacao.servicesContract;

import secao16.ExerFixacao.entitiesContract.Contract;
import secao16.ExerFixacao.entitiesContract.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
    public void processContract(Contract contract,int moths){
         double basicQuota = contract.getTotalValue() / moths;
        for (int i = 0; i < moths; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = onlinePaymentService.interrest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;

            contract.getInstallments().add(new Installment(dueDate,quota));

        }
    }
}
