package com.poetry.console;

import com.poetry.domain.PoetryReader;
import com.poetry.infra.ConsoleAdapter;

/**
 * Created by Paul
 *
 * @author <a href="mailto:paul58914080@gmail.com">Paul Williams</a>
 */
public class ConsoleApplication {
    public static void main(String[] args) {
        PoetryReader poetryReader = new PoetryReader();
        ConsoleAdapter consoleAdapter = new ConsoleAdapter(poetryReader);
        consoleAdapter.ask();
    }
}
