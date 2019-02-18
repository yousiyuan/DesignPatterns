package com.lnson.pattern.singleton.demo.utils;

import com.sun.istack.internal.NotNull;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TxtFileUtils {

    public static String read(@NotNull String filepath) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filepath), StandardCharsets.UTF_8));
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line);
        }
        if (bufferedReader != null)
            bufferedReader.close();
        return stringBuilder.toString();
    }

    public static void write(@NotNull String value, String filepath) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filepath), StandardCharsets.UTF_8));
        bufferedWriter.write(value);
        if (bufferedWriter != null) {
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}
