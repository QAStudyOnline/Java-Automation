# DROP SCHEMA IF EXISTS automation;
# CREATE SCHEMA IF NOT EXISTS automation DEFAULT CHARACTER SET utf8;

# DROP TABLE automation.accounts;

CREATE TABLE automation.accounts
(
  id                BIGINT PRIMARY KEY AUTO_INCREMENT,
  gender            VARCHAR(100) NOT NULL,
  firstCustomerName VARCHAR(100) NOT NULL,
  lastCustomerName  VARCHAR(100) NOT NULL,
  pass              VARCHAR(100) NOT NULL,
  email             VARCHAR(100) NOT NULL,
  day               VARCHAR(100) NOT NULL,
  month             VARCHAR(100) NOT NULL,
  year              VARCHAR(100) NOT NULL,
  firstName         VARCHAR(100) NOT NULL,
  lastName          VARCHAR(100) NOT NULL,
  company           VARCHAR(100) NOT NULL,
  address1          VARCHAR(100) NOT NULL,
  address2          VARCHAR(100) NOT NULL,
  city              VARCHAR(100) NOT NULL,
  state             VARCHAR(100) NOT NULL,
  postcode          VARCHAR(100) NOT NULL,
  country           VARCHAR(100) NOT NULL,
  phone_mobile      VARCHAR(100) NOT NULL,
  alias             VARCHAR(100) NOT NULL
);
