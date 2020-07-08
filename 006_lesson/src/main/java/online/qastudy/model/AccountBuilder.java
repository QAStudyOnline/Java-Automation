package online.qastudy.model;

public class AccountBuilder {
    private String gender;
    private String firstCustomerName;
    private String lastCustomerName;
    private String pass;
    private String email;
    private String day;
    private String month;
    private String year;
    private String firstName;
    private String lastName;
    private String company;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String postcode;
    private String country;
    private String phone_mobile;
    private String alias;

    public AccountBuilder withGender(String gender) {
        this.gender = gender;
        return this;
    }

    public AccountBuilder withFirstCustomerName(String firstCustomerName) {
        this.firstCustomerName = firstCustomerName;
        return this;
    }

    public AccountBuilder withLastCustomerName(String lastCustomerName) {
        this.lastCustomerName = lastCustomerName;
        return this;
    }

    public AccountBuilder withPassword(String pass) {
        this.pass = pass;
        return this;
    }

    public AccountBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public AccountBuilder withBirthdayDay(String day) {
        this.day = day;
        return this;
    }

    public AccountBuilder withBirthdayMonth(String month) {
        this.month = month;
        return this;
    }

    public AccountBuilder withBirthdayYear(String year) {
        this.year = year;
        return this;
    }

    public AccountBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public AccountBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public AccountBuilder withCompany(String company) {
        this.company = company;
        return this;
    }

    public AccountBuilder withAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    public AccountBuilder withAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    public AccountBuilder withCity(String city) {
        this.city = city;
        return this;
    }

    public AccountBuilder withState(String state) {
        this.state = state;
        return this;
    }

    public AccountBuilder withZipCode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    public AccountBuilder withCountry(String country) {
        this.country = country;
        return this;
    }

    public AccountBuilder withPhoneMobile(String phone_mobile) {
        this.phone_mobile = phone_mobile;
        return this;
    }

    public AccountBuilder withAliasAddress(String alias) {
        if (alias.isEmpty()) {
            this.alias = "default value";
        } else {
            this.alias = alias;
        }
        return this;
    }

    public Account build() {
        return new Account(gender, firstCustomerName, lastCustomerName, pass, email, day, month, year, firstName, lastName, company, address1, address2, city, state, postcode, country, phone_mobile, alias);
    }
}
