package com.example.Identity.Interfaces;

public interface IAccountHelper {
    boolean isEmailValid(String email);
    boolean isPasswordValid(String password);
    String hashPassword(String password);
    boolean verifyPassword(String password, String hash);
}
