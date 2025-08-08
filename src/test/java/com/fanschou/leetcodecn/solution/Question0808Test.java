package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question0808Test {

    Question0808 question0808 = new Question0808();

    @Test
    void removeElement() {
        assertEquals(0.62500, question0808.soupServings(50));
        assertEquals(0.71875, question0808.soupServings(100));

    }
}