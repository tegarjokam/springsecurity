package com.tegar.secureapp.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tegar.secureapp.entity.User;
import com.tegar.secureapp.model.UserDetailsModel;
import com.tegar.secureapp.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		Collection<GrantedAuthority> authorities = new ArrayList<>();
		
		if (user == null)
			throw new UsernameNotFoundException("Username Not Found");
		
		GrantedAuthority simpleGrantedAuth = new SimpleGrantedAuthority(user.getRole());
		authorities.add(simpleGrantedAuth);
		
		return new UserDetailsModel(user, authorities);
	}

}
