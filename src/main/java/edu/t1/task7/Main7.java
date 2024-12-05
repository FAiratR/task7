package edu.t1.task7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.*;

@SpringBootApplication(scanBasePackages="edu.t1.task7")
public class Main7 {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ctx = SpringApplication.run(Main7.class);
    }
}
