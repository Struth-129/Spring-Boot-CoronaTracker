package io.spring.corona.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class VirusDataService {

	private String URL = "https://data.covid19india.org/data.json";
	
	@PostConstruct
	public void fetchData() throws IOException, InterruptedException {
		HttpClient client   = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
			.uri(URI.create(URL))
			.build();
		
		HttpResponse<String> httpResponse =
					client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(httpResponse.body());
		
	}
	
}
