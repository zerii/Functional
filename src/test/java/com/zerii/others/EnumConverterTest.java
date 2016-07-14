package com.zerii.others;

import com.zerii.functional.Function1;
import static com.zerii.others.EnumConverter.toList;
import java.util.Arrays;
import java.util.List;
import org.javatuples.Pair;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author zerii
 */
public class EnumConverterTest {

    @Test
    public void test_toList() {

        List<Pair<Integer, String>> expected = Arrays.asList(new Pair<>(1, "a"), new Pair<>(2, "b"));
        List<Pair<Integer, String>> result = toList(AA.class, new Function1<AA, Pair<Integer, String>>() {
            @Override
            public Pair<Integer, String> apply(AA param) {
                return new Pair<>(param.getID(), param.name());
            }
        });
        assertEquals(expected, result);
    }

    enum AA {
        a(1),
        b(2);
        private final int id;

        private AA(int id) {
            this.id = id;
        }

        int getID() {
            return id;
        }
    }
}
