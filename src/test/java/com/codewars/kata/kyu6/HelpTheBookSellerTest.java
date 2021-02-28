package com.codewars.kata.kyu6;

import org.testng.annotations.Test;

import static com.codewars.kata.kyu6.HelpTheBookSeller.stockSummary;
import static org.testng.Assert.assertEquals;

public class HelpTheBookSellerTest {

    @Test
    public void test1() {
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[] {"A", "B"};
        assertEquals("(A : 200) - (B : 1140)", stockSummary(art, cd));
        System.out.println(stockSummary(art, cd));
    }

    @Test
    public void test2() {
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[] {"Q"};
        assertEquals("(Q : 0)", stockSummary(art, cd));
        System.out.println(stockSummary(art, cd));
    }

    @Test
    public void test3() {
        assertEquals("", stockSummary(new String[0], new String[0]));
    }
}
