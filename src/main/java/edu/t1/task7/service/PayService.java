package edu.t1.task7.service;

import java.sql.SQLException;

public interface PayService {
    public String payExecute(Long userId, Long productId, Long count) throws SQLException;
}