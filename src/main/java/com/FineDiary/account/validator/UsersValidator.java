package com.FineDiary.account.validator;

import com.FineDiary.account.model.Users;
import com.FineDiary.account.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class UsersValidator implements Validator {

    @Autowired
    private UsersService usersService;

    @Override
    public boolean supports(Class<?> aClass) {
        return Users.class.equals(aClass);
    }
@Override
    public void validate(Object o, Errors errors) {
        Users user = (Users) o;
    }

//////// (допимать проверку длинны пароля
}
