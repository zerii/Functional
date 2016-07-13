package com.zerii.functional.collection;

import com.zerii.functional.Function1;
import java.util.Arrays;
import java.util.List;
import org.javatuples.Pair;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author zerii
 */
public class CollectionUtilsTest {

    @Test
    public void testMap() {
        List<String> result = CollectionUtils.map(Arrays.asList(Pair.with("a", "b")),
                new Function1<Pair<String, String>, String>() {
            @Override
            public String apply(Pair<String, String> param1) {
                return param1.getValue1();
            }
        });
        assertEquals(Arrays.asList("b"), result);
    }
}
