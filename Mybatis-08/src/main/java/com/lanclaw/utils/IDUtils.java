package com.lanclaw.utils;


import org.junit.Test;

import java.util.UUID;

public class IDUtils {

    public static String getId(){
        return UUID.randomUUID().toString();
    }

    @Test
    public void test(){
        System.out.println(IDUtils.getId());
    }
}
