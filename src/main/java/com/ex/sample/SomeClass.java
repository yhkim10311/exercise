package com.ex.sample;

import com.ex.test.Human;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SomeClass {
    public static void main(String[] args) {
        Set<String> ERROR_PAGE_REDIRECT_URLS =
                Stream.of("/v2/cms/affiliates/(\\d+)","/v2/cms/contents/(\\d+)").collect(Collectors.toSet());
        for(String each : ERROR_PAGE_REDIRECT_URLS) {
            String a = "/v2/cms/affiliates/1555555";
            System.out.println(each+"matches"+a+" : "+a.matches(each));
            String b = "/v2/cms/contents/5555";
            System.out.println(each+"matches"+b+" : "+b.matches(each));
        }
    }
}
