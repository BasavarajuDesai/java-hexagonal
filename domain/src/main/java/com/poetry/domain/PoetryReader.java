package com.poetry.domain;

import com.poetry.port.ObtainPoem;
import com.poetry.port.RequestVerse;

/**
 * Created by Paul
 *
 * @author <a href="mailto:paul58914080@gmail.com">Paul Williams</a>
 */
public class PoetryReader implements RequestVerse {
    private ObtainPoem obtainPoem;

    public PoetryReader() {
        this(new ObtainPoem() {
        });
    }

    public PoetryReader(ObtainPoem obtainPoem) {
        this.obtainPoem = obtainPoem;
    }

    @Override
    public String giveMeSomePoetry() {
        return obtainPoem.getMeSomePoetry();
    }
}
