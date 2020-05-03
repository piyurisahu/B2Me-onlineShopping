package onlineShop.dao;

import org.springframework.stereotype.Repository;

import onlineShop.model.SalesOrder;

@Repository
public interface SalesOrderDao {
    void addSalesOrder(SalesOrder SalesOrder);
}
