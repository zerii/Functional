package com.zerii.others;

import com.zerii.functional.Function1;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author zerii
 */
public class EnumConverter {

    /**
     * 列挙型に定義された列挙子1つづつリストに入れます。
     *
     * @param <E> 列挙型
     * @param <P> リスト要素の型
     * @param elementType 列挙型の型
     * @param f 列挙型から目的要素への変換関数
     * @return 目的リスト
     */
    public static <E extends Enum<E>, P> List<P> toList(Class<E> elementType, Function1<E, P> f) {
        Iterator<E> iterator = EnumSet.allOf(elementType).iterator();
        List<P> result = new ArrayList<>();
        while (iterator.hasNext()) {
            E e = iterator.next();
            result.add(f.apply(e));
        }
        return result;
    }
}
