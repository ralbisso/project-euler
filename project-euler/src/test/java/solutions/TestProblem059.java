package solutions;

import java.io.UnsupportedEncodingException;

import org.junit.Assert;
import org.junit.Test;

public class TestProblem059 {

    @Test
    public void test() throws UnsupportedEncodingException {
        Assert.assertEquals(Solutions.PROBLEM_059, new Problem059().solve());
    }
}
