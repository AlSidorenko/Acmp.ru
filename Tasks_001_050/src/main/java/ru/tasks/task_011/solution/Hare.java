package ru.tasks.task_011.solution;

import java.math.BigInteger;
import java.util.Arrays;

import static java.math.BigInteger.*;

/**
 * Created on 06.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Hare {

    public static BigInteger[] arrCount(int n, int k) {
        BigInteger[] a = new BigInteger[n + 1];
        a[0] = ONE;
        int start;
        for (int i = 1; i <= n; i++) {
            start = Math.max(0, i - k);
            a[i] = ZERO;
            for (int j = start; j < i; j++) {
                a[i] = a[i].add(a[j]);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrCount(2, 7)));
    }
}

/*
static int result = 0;
static int k;
static int n;

void tryCount(int a) {
    if (a == n) {
        ++result;
        return;
    }

    for (int i = 1; i <= k; ++i) {
        if (a < n) {
            a += i;
            tryCount(a);
            a -= i;
        }
    }
}
*/
