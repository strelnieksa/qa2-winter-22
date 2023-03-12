import dao.UserDAO;
import myPageObject.myModel.MyUserEmail;
import myPageObject.myModel.User;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class DataBaseTest {
    @Test
    public void dataBaseCheck() throws SQLException, ClassNotFoundException {
        User expectedUser = new User();
        expectedUser.setFirstName("Dmitry");
        expectedUser.setLastName("Tester");
        expectedUser.setEmail("test@test.com");

        String firstN = (RandomStringUtils.randomAlphabetic(3, 15)).toLowerCase();
        String name = firstN.substring(0, 1).toUpperCase() + firstN.substring(1);

        String lastN = (RandomStringUtils.randomAlphabetic(3, 15)).toLowerCase();
        String surname = lastN.substring(0, 1).toUpperCase() + lastN.substring(1);

        MyUserEmail userEmail = new MyUserEmail();

        String mail = firstN.substring(0,1) + "." +lastN + "@" + userEmail.getDomain() + "." + userEmail.getTLD();

        User randomUser = new User();
        randomUser.setFirstName(name);
        randomUser.setLastName(surname);
        randomUser.setEmail(mail);

        UserDAO randomDAO = new UserDAO();
        randomDAO.saveUser(randomUser);


//        UserDAO userDAO = new UserDAO();
//        userDAO.saveUser(expectedUser);
    }
}
