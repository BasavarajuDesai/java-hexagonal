package com.poetry.domain;

/**
 * Created by Paul
 *
 * @author <a href="mailto:paul58914080@gmail.com">Paul Williams</a>
 */
public class HardcodedPoetryLibrary implements PoetryLibrary {

    @Override
    public String getMeSomePoetry() {
        return "If you could read a leaf or tree\\r\\nyoud have no need of books.\\r\\n-- © Alistair Cockburn (1987)";
    }
}
