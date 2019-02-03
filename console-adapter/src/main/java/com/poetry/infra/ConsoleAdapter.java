package com.poetry.infra;

import com.poetry.port.RequestVerse;

/**
 * Created by Paul
 *
 * @author <a href="mailto:paul58914080@gmail.com">Paul Williams</a>
 */
public class ConsoleAdapter {
    private RequestVerse poetryReader;
    private WriteLine publicationStrategy;

    public ConsoleAdapter(RequestVerse poetryReader, WriteLine publicationStrategy) {
        this.poetryReader = poetryReader;
        this.publicationStrategy = publicationStrategy;
    }

    public void ask() {
        this.publicationStrategy.writeLine("Poem: " + this.poetryReader.giveMeSomePoetry());
    }
}
