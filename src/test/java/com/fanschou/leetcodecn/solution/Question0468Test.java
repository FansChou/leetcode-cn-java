package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0468Test {

    Question0468 question0468 = new Question0468();

    @Test
    void validIPAddress() {
        assertEquals("IPv4", question0468.validIPAddress("172.16.254.1"));
        assertEquals("IPv6", question0468.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
        assertEquals("Neither", question0468.validIPAddress("256.256.256.256"));
        assertEquals("Neither", question0468.validIPAddress("1.01.01.1"));
    }
}