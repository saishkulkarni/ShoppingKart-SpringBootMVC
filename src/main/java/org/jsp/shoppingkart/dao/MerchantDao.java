package org.jsp.shoppingkart.dao;

import org.jsp.shoppingkart.dto.Merchant;
import org.jsp.shoppingkart.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MerchantDao {
    @Autowired
    MerchantRepository merchantRepository;

	public Merchant fetchByEmail(String email) {
		return merchantRepository.findByEmail(email); 
	}

	public Merchant fetchByMobile(long mobile) {
		return merchantRepository.findByMobile(mobile); 
	}

    public void save(Merchant merchant) {
		merchantRepository.save(merchant);
    }

    public Merchant fetchById(int id) {
        return merchantRepository.findById(id).orElse(null);
    }

}
