package com.poetry.console;

import com.poetry.domain.PoetryReader;
import com.poetry.infra.ConsoleAdapter;
import com.poetry.infra.PoetryLibraryFileAdapter;
import com.poetry.port.ObtainPoem;

/**
 * Created by Paul
 *
 * @author <a href="mailto:paul58914080@gmail.com">Paul Williams</a>
 */
public class ConsoleApplication {
    public static void main(String[] args) {
        // 1. Instantiate the right side adapter i.e. ObtainPoem (PoetryLibraryFileAdapter)
        ObtainPoem fileAdapter = new PoetryLibraryFileAdapter(ConsoleApplication.class.getClassLoader().getResource("Rimbaud.txt").getPath());
        // 2. Instantiate the hexagon i.e. PoetryReader (domain)
        PoetryReader poetryReader = new PoetryReader(fileAdapter);
        // 3. Instantiate the left side adapter i.e. ConsoleAdapter
        ConsoleAdapter consoleAdapter = new ConsoleAdapter(poetryReader);
        consoleAdapter.ask();
    }
}
