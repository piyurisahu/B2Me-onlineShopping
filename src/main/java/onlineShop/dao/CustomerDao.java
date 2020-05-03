package onlineShop.dao;

import org.springframework.stereotype.Repository;

import onlineShop.model.Customer;

@Repository
public interface CustomerDao {
	void addCustomer(Customer customer);

    Customer getCustomerByUserName(String userName);

}
