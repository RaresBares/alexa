package de.alexa;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Scanner;

public class Alexa {

    @SneakyThrows
    public static void main(String[] args) {
        final Process proc = new ProcessBuilder("whoami")
                .redirectErrorStream(true)
                .start();
        proc.waitFor();
        final BufferedReader rdr = new BufferedReader(new InputStreamReader(proc.getInputStream()));
        String str;
        while ((str = rdr.readLine()) != null) {
            System.out.println(str);
        }
    }
}
