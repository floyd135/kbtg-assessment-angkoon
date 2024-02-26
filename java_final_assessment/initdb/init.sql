-- Drop tables if they exist
DROP TABLE IF EXISTS wallet CASCADE;
DROP TABLE IF EXISTS users CASCADE;
DROP TABLE IF EXISTS lottery CASCADE;
DROP TABLE IF EXISTS user_ticket CASCADE;

CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    email VARCHAR(255) UNIQUE NOT NULL,
    name VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    role boolean NOT NULL
);

CREATE TABLE wallet (
    id SERIAL PRIMARY KEY,
    wallet_name VARCHAR(255) UNIQUE NOT NULL,
    active BOOLEAN NOT NULL,
    profile_email VARCHAR(255) REFERENCES users(email) ON DELETE CASCADE
);

CREATE TABLE lottery (
                         ticket_id SERIAL PRIMARY KEY,
                         ticket_number VARCHAR(6) NOT NULL,
                         price DECIMAL NOT NULL,
                         belong_to_cust INT NOT NULL
);

CREATE TABLE user_ticket (
                             user_ticket_id SERIAL PRIMARY KEY,
                             user_id SERIAL NOT NULL,
                             ticket_id INT NOT NULL,
                             FOREIGN KEY (ticket_id) REFERENCES lottery(ticket_id),
                             FOREIGN KEY (user_id) REFERENCES users(id)
);


-- Initial data
-- INSERT INTO profile(email, name) VALUES('sample@email.com', 'John Doe');
-- INSERT INTO wallet(wallet_name, active, profile_email) VALUES('JohnWallet1', true, 'sample@email.com');
-- INSERT INTO wallet(wallet_name, active, profile_email) VALUES('JohnWallet2', false, 'sample@email.com');

INSERT INTO users(email, name, password, role) VALUES('admin@gmail.com', 'Admin Admin', '0000', true)