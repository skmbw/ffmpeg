package com.xueershangda.ffmpeg;

import java.io.File;

/**
 * @author yinlei
 * @since 2019-1-22 14:37
 */
public class TestFileSeperator {
    public static void main(String[] args) {
        String path = "D:\\downloads\\ffmpeg-20190116-win64-static\\bin\\ffmpeg.exe";
        // 因为是包含起始字符，不包含最后的字符，所以会包含斜杠\
        System.out.println(path.substring(path.lastIndexOf(File.separator)));
        System.out.println(path.substring(path.lastIndexOf(File.separator) + 1));
    }
}
