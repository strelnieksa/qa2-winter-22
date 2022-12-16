package myPageObject;

import org.junit.jupiter.api.Test;

public class TicketsTestHomeworkByMyself {
    private final String URL = "www.qaguru.lv:8089/tickets";

    private BasicFunctions basicFunctions = new BasicFunctions();
    @Test
    public void mySuccesfullRegistrationTest() {
        basicFunctions.openUrl(URL);


    }
}
