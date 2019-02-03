package com.poetry.infra;

import com.poetry.port.ObtainPoem;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by Paul
 *
 * @author <a href="mailto:paul58914080@gmail.com">Paul Williams</a>
 */
public class PoetryLibraryFileAdapter implements ObtainPoem {
    private String filePath;

    public PoetryLibraryFileAdapter(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String getMeSomePoetry() {
        try {
            return FileUtils.readFileToString(new File(filePath), "utf-8");
        } catch (IOException ex) {
            return "";
        }
    }
}
