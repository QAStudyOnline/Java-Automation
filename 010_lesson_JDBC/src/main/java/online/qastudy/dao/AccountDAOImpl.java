package online.qastudy.dao;

import online.qastudy.model.Account;
import online.qastudy.utils.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountDAOImpl implements AccountDAO {
    @Override
    public Account getById(Long id) throws SQLException {
        String sql = "SELECT * FROM accounts WHERE id = " + id;
        Statement statement = null;
        try {
            statement = ConnectionUtil.getConnection().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet resultSet = statement.executeQuery(sql);


        Account account = new Account();

        while (true) {
            if (!resultSet.next()) break;
            account.setGender(resultSet.getString("gender"));
            account.setFirstCustomerName(resultSet.getString("firstCustomerName"));
            account.setLastCustomerName(resultSet.getString("lastCustomerName"));
            account.setPass(resultSet.getString("pass"));
            account.setEmail(resultSet.getString("email"));
            account.setDay(resultSet.getString("day"));
            account.setMonth(resultSet.getString("month"));
            account.setYear(resultSet.getString("year"));
            account.setFirstName(resultSet.getString("firstName"));
            account.setLastName(resultSet.getString("lastName"));
            account.setCompany(resultSet.getString("company"));
            account.setAddress1(resultSet.getString("address1"));
            account.setAddress2(resultSet.getString("address2"));
            account.setCity(resultSet.getString("city"));
            account.setState(resultSet.getString("state"));
            account.setPostcode(resultSet.getString("postcode"));
            account.setCountry(resultSet.getString("country"));
            account.setPhone_mobile(resultSet.getString("phone_mobile"));
            account.setAlias(resultSet.getString("alias"));
        }

        try {
            statement.getConnection().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return account;
    }

    @Override
    public List<Account> getAll() {
        String sql = "SELECT * FROM accounts";
        List<Account> accountList = new ArrayList<>();
        Statement statement = null;

        try {
            statement = ConnectionUtil.getConnection().createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Account account = new Account();
                account.setGender(resultSet.getString("gender"));
                account.setFirstCustomerName(resultSet.getString("firstCustomerName"));
                account.setLastCustomerName(resultSet.getString("lastCustomerName"));
                account.setPass(resultSet.getString("pass"));
                account.setEmail(resultSet.getString("email"));
                account.setDay(resultSet.getString("day"));
                account.setMonth(resultSet.getString("month"));
                account.setYear(resultSet.getString("year"));
                account.setFirstName(resultSet.getString("firstName"));
                account.setLastName(resultSet.getString("lastName"));
                account.setCompany(resultSet.getString("company"));
                account.setAddress1(resultSet.getString("address1"));
                account.setAddress2(resultSet.getString("address2"));
                account.setCity(resultSet.getString("city"));
                account.setState(resultSet.getString("state"));
                account.setPostcode(resultSet.getString("postcode"));
                account.setCountry(resultSet.getString("country"));
                account.setPhone_mobile(resultSet.getString("phone_mobile"));
                account.setAlias(resultSet.getString("alias"));
                accountList.add(account);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                statement.getConnection().close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return accountList;
    }

    @Override
    public void save(Account account) {
        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO accounts (gender," +
                "firstCustomerName," +
                "lastCustomerName," +
                "pass," +
                "email," +
                "day," +
                "month," +
                "year," +
                "firstName," +
                "lastName," +
                "company," +
                "address1," +
                "address2," +
                "city," +
                "state," +
                "postcode," +
                "country," +
                "phone_mobile," +
                "alias) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            preparedStatement = ConnectionUtil.getConnection().prepareStatement(sql);

            preparedStatement.setString(1, account.getGender());
            preparedStatement.setString(2, account.getFirstCustomerName());
            preparedStatement.setString(3, account.getLastCustomerName());
            preparedStatement.setString(4, account.getPass());
            preparedStatement.setString(5, account.getEmail());
            preparedStatement.setString(6, account.getDay());
            preparedStatement.setString(7, account.getMonth());
            preparedStatement.setString(8, account.getYear());
            preparedStatement.setString(9, account.getFirstName());
            preparedStatement.setString(10, account.getLastName());
            preparedStatement.setString(11, account.getCompany());
            preparedStatement.setString(12, account.getAddress1());
            preparedStatement.setString(13, account.getAddress2());
            preparedStatement.setString(14, account.getCity());
            preparedStatement.setString(15, account.getState());
            preparedStatement.setString(16, account.getPostcode());
            preparedStatement.setString(17, account.getCountry());
            preparedStatement.setString(18, account.getPhone_mobile());
            preparedStatement.setString(19, account.getAlias());

            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement.getConnection() != null) {
                    try {
                        preparedStatement.getConnection().close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @Override
    public void update(Account account) {
        PreparedStatement preparedStatement = null;
        String sql =
                "UPDATE developers " +
                        "SET gender=?, " +
                        "firstCustomerName=?, " +
                        "lastCustomerName=?, " +
                        "pass=?, " +
                        "email=?, " +
                        "day=?, " +
                        "month=?, " +
                        "year=?, " +
                        "firstName=?, " +
                        "lastName=?, " +
                        "company=?, " +
                        "address1=?, " +
                        "address2=?, " +
                        "city=?, " +
                        "state=?, " +
                        "postcode=?, " +
                        "country=?, " +
                        "phone_mobile=?, " +
                        "alias=? " +
                        "WHERE email=?";

        int resultExecution;
        try {
            preparedStatement = ConnectionUtil.getConnection().prepareStatement(sql);

            preparedStatement.setString(1, account.getGender());
            preparedStatement.setString(2, account.getFirstCustomerName());
            preparedStatement.setString(3, account.getLastCustomerName());
            preparedStatement.setString(4, account.getPass());
            preparedStatement.setString(5, account.getEmail());
            preparedStatement.setString(6, account.getDay());
            preparedStatement.setString(7, account.getMonth());
            preparedStatement.setString(8, account.getYear());
            preparedStatement.setString(9, account.getFirstName());
            preparedStatement.setString(10, account.getLastName());
            preparedStatement.setString(11, account.getCompany());
            preparedStatement.setString(12, account.getAddress1());
            preparedStatement.setString(13, account.getAddress2());
            preparedStatement.setString(14, account.getCity());
            preparedStatement.setString(15, account.getState());
            preparedStatement.setString(16, account.getPostcode());
            preparedStatement.setString(17, account.getCountry());
            preparedStatement.setString(18, account.getPhone_mobile());
            preparedStatement.setString(19, account.getAlias());
            preparedStatement.setString(5, account.getEmail());


            resultExecution = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement.getConnection() != null) {
                    preparedStatement.getConnection().close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void delete(Account account) {
        PreparedStatement preparedStatement = null;
        String sql = "DELETE FROM accounts WHERE ID=?";

        try {
            preparedStatement = ConnectionUtil.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, account.getEmail());

            preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement.getConnection() != null) {
                    preparedStatement.getConnection().close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
