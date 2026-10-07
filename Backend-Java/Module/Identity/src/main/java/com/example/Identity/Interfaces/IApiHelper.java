package com.example.Identity.Interfaces;

import java.util.Map;

import com.example.Identity.Models.Account.AccountModel;

public interface IApiHelper {
    Map<String, Object> toAccountResponse(AccountModel account);
}
