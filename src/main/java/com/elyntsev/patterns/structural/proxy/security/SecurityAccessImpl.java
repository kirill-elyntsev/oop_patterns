package com.elyntsev.patterns.structural.proxy.security;

public class SecurityAccessImpl implements SecurityAccess {
    @Override
    public void access() {
        System.out.println("access to bank account");
    }
}
