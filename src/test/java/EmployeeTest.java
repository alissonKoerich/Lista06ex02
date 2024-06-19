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
                5000D,
                "11111111",
                "111111111");

        assertEquals(3914.36, employee.calculateIncome(),0.01);
    }

    @Test

    void testTotalSalary(){
        var totalSalary = new Employee("Gabriela","11111111","1111111111",
                LocalDate.of(1999, 4, 15),Sex.FEMALE,
                5000D,"1111111","1111111");

        assertEquals(5000.0, totalSalary.getSalary());

    }
    @Test
    void totalIrCalculation(){
        var totalIr = new Employee("Jessica","11111111","1111111111",
                LocalDate.of(2009, 6, 11),Sex.FEMALE,
                5000D,"1111111","1111111");

        assertEquals(535.64, totalIr.getIr());

    }

    @Test
    void testInssValue() {
        var totalInss = new Employee("Lucas",
                "5555555",
                "55555555",
                LocalDate.of(2000,3,16),
                Sex.MALE,
                2850D,
                "444444",
                "4444444");

        assertEquals(313.5, totalInss.getInss());
    }
}
