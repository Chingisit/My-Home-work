package ru.davletbaev.task15;

import java.io.*;
import java.net.URL;

public class GetFromInternet {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://api.tvmaze.com/lookup/shows?tvrage=24493");
            try (InputStream is = url.openStream();
                 Reader reader = new InputStreamReader(is);
                 BufferedReader br = new BufferedReader(reader)
            ){
                System.out.println(br.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
