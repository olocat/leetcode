package com.olocat.leetcode;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Lc_1189_maxNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        if (text == null || text.length() < 7) {
            return 0;
        }
        int[] a = new int[]{0, 0, 0, 0, 0};
        for (char s : text.toCharArray()) {
            switch (s) {
                case 'b':
                    a[0]++;
                    break;
                case 'a':
                    a[1]++;
                    break;
                case 'l':
                    a[2]++;
                    break;
                case 'o':
                    a[3]++;
                    break;
                case 'n':
                    a[4]++;
                    break;
            }
        }
        int re = a[0];
        re = Math.min(re,a[1]);
        re = Math.min(re,a[2]/2);
        re = Math.min(re,a[3]/2);
        re = Math.min(re,a[4]);
        return re;
    }
    @Test
    public void textm(){
       int re = this.maxNumberOfBalloons("aasloonbalxballlpoon");
        System.out.println("re = ");
        System.out.println(re);
    }
}
