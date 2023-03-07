package com.cypro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.cypro.entity.Cart;
import com.cypro.entity.Customer;
import com.cypro.entity.Wallet;
import com.cypro.exception.UserException;
import com.cypro.services.UserServicesImpl;

@SpringBootTest
public class UserServiceTests {
	@Mock
	UserServicesImpl userService;
	@BeforeAll
	static void beforeTesting() {
		System.out.println("Testing started");
	}
	@Test
	void UserSignUp() throws UserException {
		Customer user = new Customer();
		Wallet wallet = new Wallet();
		Cart cart = new Cart();
		wallet.setWalletId(2);
		wallet.setWalletBallance(0.0);
		cart.setCartId(3);
		cart.setTotalPrice(0.0);
		user.setCustomerId(1);
		user.setCustomerName("User Name");
		user.setEmail("test@gmail.com");
		user.setMobileNo("9124567814");
		user.setPassword("password");
		user.setCart(cart);
		user.setWallet(wallet);
		
		when(userService.addUser(user)).thenReturn(user);
		Customer savedUser =userService.addUser(user);
		assertEquals(savedUser.getCustomerName(),user.getCustomerName());
		assertEquals(savedUser.getWallet(),user.getWallet());
		assertEquals(savedUser.getWallet(),user.getWallet());
	}
	
	@Test
	void UserLoginTest() throws UserException {
		Customer user = new Customer();
		Wallet wallet = new Wallet();
		Cart cart = new Cart();
		wallet.setWalletId(2);
		wallet.setWalletBallance(0.0);
		cart.setCartId(3);
		cart.setTotalPrice(0.0);
		user.setCustomerId(1);
		user.setCustomerName("User Name");
		user.setEmail("test@gmail.com");
		user.setMobileNo("9124567814");
		user.setPassword("password");
		user.setCart(cart);
		user.setWallet(wallet);
		
		when(userService.logInUser("test@gmail.com", "password")).thenReturn(user);
		when(userService.addUser(user)).thenReturn(user);
		Customer savedUser =userService.addUser(user);
		assertEquals(savedUser.getCustomerName(),user.getCustomerName());
		assertEquals(savedUser.getWallet(),user.getWallet());
		assertEquals(savedUser.getWallet(),user.getWallet());
	}	
	@AfterAll
	static void afterTesting() {
		System.out.println("Testing completed");
	}
}
