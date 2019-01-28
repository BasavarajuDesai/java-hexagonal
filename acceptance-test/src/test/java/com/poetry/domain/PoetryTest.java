package com.poetry.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Created by Paul
 *
 * @author <a href="mailto:paul58914080@gmail.com">Paul Williams</a>
 */
@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class PoetryTest {
    @Test
    @DisplayName("Should be able to get verses when asked for poetry")
    public void should_give_verses_when_asked_for_poetry() {
        /*
            RequestVerse - left side port
            PoetryReader - hexagon (domain)
         */
        RequestVerse poetryReader = new PoetryReader();
        String verses = poetryReader.giveMeSomePoetry();
        Assertions.assertEquals("If you could read a leaf or tree\\r\\nyoud have no need of books.\\r\\n-- © Alistair Cockburn (1987)", verses);
    }

    @Test
    @DisplayName("Should be able to get verses when asked for poetry from a poetry library")
    public void should_give_verses_when_asked_for_poetry_from_library(@Mock PoetryLibrary poetryLibrary) {
        // Stub
        Mockito.lenient().when(poetryLibrary.getMeSomePoetry()).thenReturn("I want to sleep\\r\\nSwat the flies\\r\\nSoftly, please.\\r\\n\\r\\n-- Masaoka Shiki (1867-1902)");
        // hexagon
        RequestVerse poetryReader = new PoetryReader(poetryLibrary);
        String verses = poetryReader.giveMeSomePoetry();
        Assertions.assertEquals("I want to sleep\\r\\nSwat the flies\\r\\nSoftly, please.\\r\\n\\r\\n-- Masaoka Shiki (1867-1902)", verses);
    }
}

