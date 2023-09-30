package org.jsp.shoppingkart.repository;

import org.jsp.shoppingkart.dto.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantRepository extends JpaRepository<Merchant, Integer>
{
	Merchant findByEmail(String email);

	Merchant findByMobile(long mobile);   
}
