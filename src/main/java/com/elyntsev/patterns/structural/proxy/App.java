package com.elyntsev.patterns.structural.proxy;

import com.elyntsev.patterns.structural.proxy.lazy.HeavyObject;
import com.elyntsev.patterns.structural.proxy.lazy.HeavyObjectImpl;
import com.elyntsev.patterns.structural.proxy.lazy.LazyProxy;
import com.elyntsev.patterns.structural.proxy.security.SecurityAccess;
import com.elyntsev.patterns.structural.proxy.security.SecurityAccessImpl;
import com.elyntsev.patterns.structural.proxy.security.SecurityProxy;

public class App {

    public static void main(String[] args) {
        security();
        lazy();
    }

    private static void security() {
        SecurityAccess proxy = new SecurityProxy(new SecurityAccessImpl());
        proxy.access();
    }

    private static void lazy() {
        HeavyObject heavyObject = new HeavyObjectImpl();
        System.out.println(heavyObject);

        HeavyObject heavyObjectProxy = new LazyProxy(heavyObject);
        String.valueOf(true).length();

        System.out.println(heavyObjectProxy.getValue());
        System.out.println(heavyObject);
        System.out.println(heavyObjectProxy.getValue());

    }
}
