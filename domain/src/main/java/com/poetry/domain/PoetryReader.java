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
        this(new HardcodedPoem());
    }

    public PoetryReader(ObtainPoem obtainPoem) {
        this.obtainPoem = obtainPoem;
    }

    @Override
    public String giveMeSomePoetry() {
        return obtainPoem.getMeSomePoetry();
    }

    private static class HardcodedPoem implements ObtainPoem {
        @Override
        public String getMeSomePoetry() {
            return "If you could read a leaf or tree\\r\\nyoud have no need of books.\\r\\n-- © Alistair Cockburn (1987)";
        }
    }
}
