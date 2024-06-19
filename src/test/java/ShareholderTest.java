import br.cesul.ex02.Sex;
import br.cesul.ex02.Shareholder;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShareholderTest {


    @Test
    void shareholderIncomeCalculationWith20participation(){

        var shareholder = new Shareholder("Alisson","11111111","11111111", LocalDate.of(2004, 8, 12),
                Sex.MALE,20.0,800.0);

        assertEquals(160.0,shareholder.calculateIncome());


    }

    @Test
    void shareholderIncomeCalculationWith70participation(){

        var shareholder = new Shareholder("Alisson","11111111","11111111",LocalDate.of(2004, 8, 12),
                Sex.MALE,70.0,2000.0);

        assertEquals(14000.0,shareholder.calculateIncome());


    }

    @Test
    void shareholderIncomeCalculationWith30participation(){

        var shareholder = new Shareholder("Alisson","11111111","11111111",LocalDate.of(2004, 8, 12),
                Sex.MALE,30.0,5000.0);

        assertEquals(7500.0,shareholder.calculateIncome());


    }

    @Test
    void getCapitalTest() {
        var getCapital = new Shareholder("Gabriel",
                "1111111",
                "095.428.233.23",
                LocalDate.of(2002, 2, 21),
                Sex.MALE,
                20D,
                800D);
        assertEquals(16000D, getCapital.getCapital());
    }



}
