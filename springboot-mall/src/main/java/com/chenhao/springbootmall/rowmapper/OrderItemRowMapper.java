package com.chenhao.springbootmall.rowmapper;

import com.chenhao.springbootmall.model.OrderItem;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderItemRowMapper implements RowMapper<OrderItem> {
    @Override
    public OrderItem mapRow(ResultSet rs, int rowNum) throws SQLException {
        OrderItem orderItem = new OrderItem();

        orderItem.setAmount(rs.getInt("amount"));
        orderItem.setQuantity(rs.getInt("quantity"));
        orderItem.setOrderId(rs.getInt("order_id"));
        orderItem.setOrderItemId(rs.getInt("order_item_id"));
        orderItem.setProductId(rs.getInt("product_id"));

        orderItem.setImageUrl(rs.getString("image_url"));
        orderItem.setProductName(rs.getString("product_name"));

        return orderItem;
    }
}
