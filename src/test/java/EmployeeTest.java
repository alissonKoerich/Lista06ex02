import br.cesul.ex02.Employee;
import br.cesul.ex02.Sex;
import br.cesul.ex02.Shareholder;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    void testIncomeCalculation() {
        var employee = new Employee("Gabriel",
                "111111111",
                "00000000000",
                LocalDate.of(2002, 2, 21),
                Sex.MALE,
                5000.0,
                "11111111",
                "111111111");

        assertEquals(3914.36, employee.calculateIncome());
    }




    @Test
    void shareholderIncomeCalculationWith20participation(){

        var shareholder = new Shareholder("Alisson","11111111","11111111",LocalDate.of(2004, 8, 12),
                Sex.MALE,20.0,800.0);

        assertEquals(160.0,shareholder.calculateIncome());


    }

    @Test
    void shareholderIncomeCalculationWith70participation(){

        var shareholder = new Shareholder("Alisson","11111111","11111111",LocalDate.of(2004, 8, 12),
                Sex.MALE,70.0,2000.0);

        assertEquals(14000.0,shareholder.calculateIncome());


    }



}
