package com.poetry.port;

/**
 * Created by Paul
 *
 * @author <a href="mailto:paul58914080@gmail.com">Paul Williams</a>
 */
public interface ObtainPoem {
    default String getMeSomePoetry() {
        return "If you could read a leaf or tree\r\nyoud have no need of books.\r\n-- Alistair Cockburn (1987)";
    }
}
