package es.acaex.recursosjunit.services;

import java.time.LocalDate;

import es.acaex.recursosjunit.models.Copy;
import es.acaex.recursosjunit.models.Loan;
import es.acaex.recursosjunit.models.Member;

public class CalculateNewLoanService {

    public Loan execute(Member member, Copy copy, String dateString) {
        
        validacionesQueImpidenElPrestamo(member, copy);
        
        return Loan.builder()
                .member(member)
                .copy(copy)
                .startedAt(LocalDate.parse(dateString))
                .expiredAt(LocalDate.parse(dateString).plusDays(getLoanDays(member, copy)))
                .build();
        
    }

    private int getLoanDays(Member member, Copy copy) {
        int loanDays = 21;
        
        if(copy.isNew()){
            loanDays = 14;
        }else{
            if(member.isPremium()){
                loanDays = 35;
            }
        }
        return loanDays;
    }

    private void validacionesQueImpidenElPrestamo(Member member, Copy copy) {
        if(copy.isBorrowed()){
            throw new RuntimeException("La copia ya está prestada");
        }

        if(member.isLoanLimitReached()){
            throw new RuntimeException("El Socio ha alcanzado el límite de préstamos abiertos");
        }

        if(member.getAge() < copy.getRecommendedAge()){
            throw new RuntimeException("La Copia no se puede prestar a ese Socio por la edad");
        }

        if(  copy.getReservedBy() != null && !copy.getReservedBy().equals(member.getUsername())){
            throw new RuntimeException("La copia ya está reservada");
        }
    }
        
    
    
}
