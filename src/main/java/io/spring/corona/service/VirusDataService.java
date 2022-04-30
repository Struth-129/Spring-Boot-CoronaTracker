package io.spring.corona.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import io.spring.corona.model.VirusDataModel;

@Service
public class VirusDataService {

	private String URL = "https://data.covid19india.org/data.json";
	private List<VirusDataModel> data = new ArrayList<>();
	
	@PostConstruct
	@Scheduled(cron = "* * 1 * * *")
	public void fetchData() throws IOException, InterruptedException {
		
		HttpClient client   = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
			.uri(URI.create(URL))
			.build();
		
		HttpResponse<String> httpResponse =
					client.send(request, HttpResponse.BodyHandlers.ofString());
		String response = httpResponse.body().toString();
//		JsonParser springParser = JsonParserFactory.getJsonParser();
//		Map<String,Object> parseMap = springParser.parseMap(response);
//		
//		for(String Key : parseMap.keySet()) {
//			data.add(new VirusDataModel((Integer)parseMap.get(Key),Key));
//		}
		
	}
	
}
