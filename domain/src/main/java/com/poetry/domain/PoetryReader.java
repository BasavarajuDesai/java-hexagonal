package com.poetry.domain;

/**
 * Created by Paul
 *
 * @author <a href="mailto:paul58914080@gmail.com">Paul Williams</a>
 */
public class PoetryReader implements RequestVerse {
    @Override
    public String giveMeSomePoetry() {
        return "If you could read a leaf or tree\\r\\nyou’d have no need of books.\\r\\n-- © Alistair Cockburn (1987)";
    }
}
