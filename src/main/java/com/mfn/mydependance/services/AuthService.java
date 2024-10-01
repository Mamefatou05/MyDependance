package com.mfn.mydependance.services;

import com.mfn.mydependance.interfaces.LoginDep;
import org.springframework.security.core.Authentication;

public interface AuthService {

    Authentication authenticateUser(LoginDep loginDepRequest);
}
