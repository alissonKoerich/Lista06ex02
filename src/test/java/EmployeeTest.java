import br.cesul.ex02.Employee;
import br.cesul.ex02.Sex;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    void testIncomeCalculation() {
        var employee = new Employee("Gabriel",
                "111111111",
                "00000000000",
                LocalDate.of(2002, 02, 21),
                Sex.MALE,
                5000.0,
                "11111111",
                "111111111");

        assertEquals(3944.36, employee.calculateIncome());
    }
}
