package com.kang.interview;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class InterviewApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {
        System.out.println(DataSource.class);

        Connection connection=dataSource.getConnection();

        System.out.println("----------------");
        System.out.println(connection);
        System.out.println("----------------");
        connection.close();

    }

}
