package com.xxxxtech.xxutils;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/**
 * create date：2017/4/28 10:12
 * @author dawson@xxxxtech.com
 * @version 1.0
 * @since JDK 1.7.0_79
 * fileName： StreamUtils.java
 * Description： 流转换成字符串
 */
public class StreamUtils {

    /**
     * @param inputStream inputStream
     * @return 字符串转换之后的
     */
    public static String streamToString(InputStream inputStream) {
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = inputStream.read(buffer)) != -1) {
                out.write(buffer, 0, len);
                out.flush();
            }

            String result = out.toString();
            out.close();
            inputStream.close();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
