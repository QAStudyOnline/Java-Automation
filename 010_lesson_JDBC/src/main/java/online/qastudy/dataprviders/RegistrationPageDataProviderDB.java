package online.qastudy.dataprviders;

import online.qastudy.dao.AccountDAO;
import online.qastudy.dao.AccountDAOImpl;
import org.testng.annotations.DataProvider;

import java.sql.SQLException;

public class RegistrationPageDataProviderDB {

    @DataProvider
    public Object[][] accountFromDb() throws SQLException {
        AccountDAO accountDAO = new AccountDAOImpl();
        return new Object[][]{{accountDAO.getById(1L)}, {accountDAO.getById(2L)}, {accountDAO.getById(3L)}};
    }
}
