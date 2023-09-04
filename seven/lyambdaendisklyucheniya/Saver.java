package com.Lyambda.seven.lyambdaendisklyucheniya;
import java.io.IOException;
@FunctionalInterface
public interface Saver {
    public void save(Object obj) throws IOException;
}
