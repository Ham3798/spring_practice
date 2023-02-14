package prg.prgrms.kdtspringdemo;

import java.sql.*;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class jdbcCustomerRepository {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(jdbcCustomerRepository.class);

    public static void main(String[] args) {
        try(
                var connection = DriverManager.getConnection("jdbc:mysql://localhost/order_mgmt", "root", "root1234!");
                var statement = connection.createStatement();
                var resultSet = statement.executeQuery("select * from customers")
        ){

            while(resultSet.next()) {
                var name = resultSet.getString("name");
                var customerId = UUID.nameUUIDFromBytes(resultSet.getBytes("customer_id"));
                var createdAt = resultSet.getTimestamp("created_at").toLocalDateTime();
                logger.info("customer id -> {}, customer name -> {}, createdAt -> {}", customerId, name, createdAt);
            }
        } catch (SQLException throwables) {
            logger.error("Got error while closing connection", throwables);
        }

    }
}
