package com.poetry.infra;

/**
 * Created by Paul
 *
 * @author <a href="mailto:paul58914080@gmail.com">Paul Williams</a>
 */
public interface WriteLine {
    default void writeLine(String text) {
        System.out.println(text);
    }
}
