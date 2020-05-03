package onlineShop.service;

import org.springframework.stereotype.Service;

import onlineShop.model.SalesOrder;
@Service
public interface SalesOrderService {
	void addSalesOrder(SalesOrder salesOrder);
}
