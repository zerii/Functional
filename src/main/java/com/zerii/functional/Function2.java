package com.zerii.functional;

/**
 * 二変数関数を定義するインタフェースです。
 *
 * @author zerii
 * @param <T1> 引数1の型
 * @param <T2> 引数2の型
 * @param <R> 戻り値の型
 */
public interface Function2<T1, T2, R> {

    /**
     * 関数の結果を求めます。
     *
     * @param param1 パラメーター1
     * @param param2 パラメーター2
     * @return 関数の戻り値
     */
    R apply(T1 param1, T2 param2);
}
