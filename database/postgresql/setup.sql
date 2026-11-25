CREATE TABLE customers (
    custId SERIAL PRIMARY KEY,
    custName VARCHAR(50) NOT NULL,
    userName VARCHAR(50) NOT NULL,
    freeze BOOLEAN NOT NULL DEFAULT FALSE
);

CREATE TABLE employees (
    empId SERIAL PRIMARY KEY,
    empName VARCHAR(50) NOT NULL,
    empUserName VARCHAR(50) NOT NULL
);

CREATE TABLE bankAccounts (
      accNum SERIAL PRIMARY KEY,
      custId INTEGER REFERENCES customers(custId),
      balance NUMERIC(12, 2) NOT NULL,
      acctType VARCHAR(20)
);

CREATE TABLE transactions (
    transId SERIAL PRIMARY KEY,
    accNum INTEGER REFERENCES bankAccounts(accNum),
    transType VARCHAR(50) NOT NULL,
    date DATE NOT NULL,
    amount NUMERIC(12, 2) NOT NULL,
    resBalance NUMERIC(12, 2) NOT NULL
);