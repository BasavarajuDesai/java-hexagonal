package com.poetry.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Created by Paul
 *
 * @author <a href="mailto:paul58914080@gmail.com">Paul Williams</a>
 */
public class PoetryTest {
    @Test
    @DisplayName("Should be able to get verses when asked for poetry")
    public void should_give_verses_when_asked_for_poetry() {
        RequestVerse poertyReader = new PoetryReader();
        String verses = poertyReader.giveMeSomePoetry();
        Assertions.assertEquals("If you could read a leaf or tree\\r\\nyou’d have no need of books.\\r\\n-- © Alistair Cockburn (1987)", verses);
    }
}
