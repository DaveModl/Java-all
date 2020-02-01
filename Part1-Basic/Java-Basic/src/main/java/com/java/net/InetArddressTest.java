package com.java.net;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 获取IP地址
 */
public class InetArddressTest {
    public static void main(String[] args) throws UnknownHostException {
        if (args.length > 0){
            String host = args[0];
            InetAddress[] addresses = InetAddress.getAllByName(host);
            for (InetAddress address : addresses){
                System.out.println(address);
            }
        }else {
            InetAddress local = InetAddress.getLocalHost();
            System.out.println(local);
        }
    }
}
