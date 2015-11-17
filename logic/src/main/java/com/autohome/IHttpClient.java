package com.autohome;

import java.io.IOException;

/**
 * Created by hujinliang on 2015/11/17.
 */
public interface IHttpClient<T> {
    T DoGet(String url,Class<T> typeKey) throws IOException;
}
