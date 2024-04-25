package es.acaex.recursosjunit.services;

import java.time.LocalDate;

import es.acaex.recursosjunit.models.Copy;
import es.acaex.recursosjunit.models.Loan;
import es.acaex.recursosjunit.models.Member;

public class CalculateNewLoanService {

    public Loan execute(Member member, Copy copy, String dateString) {
        int loanDays = 21;

        if(copy.isNew()){
            loanDays = 14;
        }

        return Loan.builder()
                .member(member)
                .copy(copy)
                .startedAt(LocalDate.parse(dateString))
                .expiredAt(LocalDate.parse(dateString).plusDays(loanDays))
                .build();
    }
    
}
