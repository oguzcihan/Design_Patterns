package org.ocihan;

import org.ocihan.proxy.OfficeInternetAccess;
import org.ocihan.proxy.ProxyInternetAccess;

public class Main {
    public static void main(String[] args) {
        OfficeInternetAccess access = new ProxyInternetAccess("Oguzhan Cihan");
        access.grantInternetAccess();
        
    }
}

/*
Simply, proxy means an object representing another project.
According to GoF, a proxy pattern "provides the control for accessing the original object"
Proxy pattern is also known as Surrogate or Placeholder
It provides the protection to the original object from the outside world
 */