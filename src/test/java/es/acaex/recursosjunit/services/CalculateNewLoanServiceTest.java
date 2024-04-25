package es.acaex.recursosjunit.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import es.acaex.recursosjunit.models.Copy;
import es.acaex.recursosjunit.models.Loan;
import es.acaex.recursosjunit.models.Member;

@SpringBootTest
public class CalculateNewLoanServiceTest {
    
    CalculateNewLoanService calculateNewLoanService;

    @MockBean Member member;
    @MockBean Copy copy;

    String dateString = "2024-01-01";

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
        calculateNewLoanService = new CalculateNewLoanService();
    }

    @Test
    void unPrestamoLePoneFechaDeDevolucionATresSemanas(){
        dateString = "2024-04-01";

        Loan loan = calculateNewLoanService.execute(member, copy, dateString);

        assertEquals("2024-04-22", loan.getExpiredAt().toString());
    }

    @Test
    void unPrestamoLePoneFechaDeDevolucionADosSemanasSiEsUnaNovedad(){
        Mockito.doReturn(true).when(copy).isNew();
        dateString = "2024-04-01";

        Loan loan = calculateNewLoanService.execute(member, copy, dateString);

        assertEquals("2024-04-15", loan.getExpiredAt().toString());
    }
}
