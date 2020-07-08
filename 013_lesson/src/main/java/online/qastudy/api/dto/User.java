package online.qastudy.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private Long id;
    @JsonProperty(value = "username")
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private Integer userStatus;

    public User() {
    }

    public User(Long id, String userName, String firstName, String lastName, String email, String password, String phone, Integer userStatus) {
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.userStatus = userStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userStatus != user.userStatus) return false;
        if (!id.equals(user.id)) return false;
        if (!userName.equals(user.userName)) return false;
        if (!firstName.equals(user.firstName)) return false;
        if (!lastName.equals(user.lastName)) return false;
        if (!email.equals(user.email)) return false;
        if (!password.equals(user.password)) return false;
        return phone.equals(user.phone);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 33 * result + userName.hashCode();
        result = 33 * result + firstName.hashCode();
        result = 33 * result + lastName.hashCode();
        result = 33 * result + email.hashCode();
        result = 33 * result + password.hashCode();
        result = 33 * result + phone.hashCode();
        result = 33 * result + (userStatus.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "User{" + "\n" +
                "id=" + id + "\n" +
                ", username='" + userName + '\'' + "\n" +
                ", firstName='" + firstName + '\'' + "\n" +
                ", lastName='" + lastName + '\'' + "\n" +
                ", email='" + email + '\'' + "\n" +
                ", password='" + password + '\'' + "\n" +
                ", phone='" + phone + '\'' + "\n" +
                ", userStatus=" + userStatus + "\n" +
                '}';
    }

    public static class UserBuilder {
        private Long id;
        private String username;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private String phone;
        private Integer userStatus;

        public UserBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public UserBuilder withUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder withPassword(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder withUserStatus(boolean userStatus) {
            if (userStatus == true) {
                this.userStatus = 1;
            } else {
                this.userStatus = 0;
            }
            return this;
        }

        public User build() {
            return new User(this.id,
                    this.username,
                    this.firstName,
                    this.lastName,
                    this.email,
                    this.password,
                    this.phone,
                    this.userStatus);
        }
    }
}
