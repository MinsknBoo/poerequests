package de.misc;

import feign.Feign;
import feign.RequestLine;
import feign.jackson.JacksonDecoder;

import java.time.Duration;
import java.time.Instant;

/**
 * Created by soedo on 30.03.2017.
 */
public class main {

    public static void main(String... args) {
        Instant start = Instant.now();
        PathOfExile pathOfExile = Feign.builder()
                .decoder(new JacksonDecoder())
                .target(PathOfExile.class, "http://api.pathofexile.com");


        // Fetch and print a list of the contributors to this library.
        Object contributors = pathOfExile.stashtabs();
        Instant end = Instant.now();
        System.out.printf("Request took: " + Duration.between(start,end).toString());
//        for (Stash contributor : contributors.getStashes()) {
//            System.out.println(contributor.getAccountName());
//        }
    }
}

interface PathOfExile {
    //statt Object geht auch StashtabResponse
    @RequestLine("GET /public-stash-tabs")
    Object stashtabs();

    static class Contributor {
        String login;
        int contributions;
    }
}



