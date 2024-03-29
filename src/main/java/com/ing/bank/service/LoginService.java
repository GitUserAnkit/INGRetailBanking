package com.ing.bank.service;

import java.lang.reflect.InvocationTargetException;

import com.ing.bank.dto.UserDTO;
import com.ing.bank.exception.UserNotFoundException;

public interface LoginService {

	UserDTO login(String loginName, String password) throws UserNotFoundException, IllegalAccessException, InvocationTargetException;

}
