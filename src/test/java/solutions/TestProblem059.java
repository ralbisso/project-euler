package solutions;

import java.io.UnsupportedEncodingException;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestProblem059 {

    @Test
    public void test() throws UnsupportedEncodingException {
        assertEquals(Solutions.PROBLEM_059, new Problem059().solve());
    }
}
