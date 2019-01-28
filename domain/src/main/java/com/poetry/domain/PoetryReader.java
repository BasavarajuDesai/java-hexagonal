package com.poetry.domain;

/**
 * Created by Paul
 *
 * @author <a href="mailto:paul58914080@gmail.com">Paul Williams</a>
 */
public class PoetryReader implements RequestVerse {
    private PoetryLibrary poetryLibrary;

    public PoetryReader() {
        this(new HardcodedPoetryLibrary());
    }

    public PoetryReader(PoetryLibrary poetryLibrary) {
        this.poetryLibrary = poetryLibrary;
    }

    @Override
    public String giveMeSomePoetry() {
        return poetryLibrary.getMeSomePoetry();
    }
}
