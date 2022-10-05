package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Question0811Test {

    Question0811 question0811 = new Question0811();

    @Test
    void subdomainVisits() {
        assertEquals(List.of("9001 com","9001 leetcode.com","9001 discuss.leetcode.com"), question0811.subdomainVisits(new String[]{"9001 discuss.leetcode.com"}));
        assertEquals(List.of("951 com","900 google.mail.com","1 intel.mail.com","5 org","5 wiki.org","901 mail.com","50 yahoo.com"), question0811.subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"}));
    }
}