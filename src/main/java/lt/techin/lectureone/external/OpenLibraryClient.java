package lt.techin.lectureone.external;


import jakarta.ws.rs.core.UriBuilder;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class OpenLibraryClient {
    //TODO Http client <- a thing that would call our openlibrary api

    HttpClient httpClient = HttpClient.newHttpClient();

    String baseURI = "https://openlibrary.org/";
    String searchEndPoint = "search.json";

    public Object lookupBookByName(String bookName) throws IOException, InterruptedException {
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(UriBuilder.fromPath(baseURI+searchEndPoint)
                        .queryParam("q", bookName)
                        .build()
                )
                .build();
        HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
    }

}
