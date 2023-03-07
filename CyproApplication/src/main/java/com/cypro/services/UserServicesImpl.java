package com.cypro.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cypro.entity.Cart;
import com.cypro.entity.Customer;
import com.cypro.entity.Wallet;
import com.cypro.exception.UserException;
import com.cypro.repository.CartDAO;
import com.cypro.repository.UserDAO;
import com.cypro.repository.WalletDAO;
import com.cypro.util.PrimaryKeyUtilityClass;

@Service
public class UserServicesImpl implements UserServices{
	private UserDAO userDao;
	private PrimaryKeyUtilityClass key;
	private CartDAO cartDao;
	private WalletDAO walletDao;
	@Autowired
	public UserServicesImpl(UserDAO userDao, PrimaryKeyUtilityClass key, CartDAO cartDao, WalletDAO walletDao) {
		super();
		this.userDao = userDao;
		this.key = key;
		this.cartDao = cartDao;
		this.walletDao = walletDao;
	}

	@Override
	public Customer addUser(Customer user) throws UserException {
		Wallet wallet= new Wallet();
		wallet.setWalletBallance(0.0);
		wallet.setWalletId(key.primaryKey());
		Cart cart = new Cart();
		cart.setCartId(key.primaryKey());
		cart.setTotalPrice(0.0);
		cartDao.save(cart);
		walletDao.save(wallet);
		user.setCart(cart);
		user.setWallet(wallet);
		return userDao.save(user);
	}

	@Override
	public Customer logInUser(String email, String password) throws UserException {
		Optional<Customer> userOpt=userDao.findByEmail(email);
		if(userOpt.isEmpty()) throw new UserException("Invalid Email!");
		if(userOpt.get().getPassword().equals(password))return userOpt.get();
		else throw new UserException("Invalid Password!");	
	}
	
}
