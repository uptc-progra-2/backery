package co.edu.uptc.utils;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Iterator;

import com.google.gson.Gson;

import co.edu.uptc.model.Desserts;
import co.edu.uptc.model.DessertsResponse;


public class HttpRequestClient {
	public static void main(String[] args) {
		HttpClient httpClient = HttpClient.newHttpClient();
		
		try {
			String url = "http://localhost:8081/desserts";
			
			HttpRequest httpRequest = HttpRequest.newBuilder()
					.uri(URI.create(url))
					.GET()
					.build();
			
			HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
			String responseBody = response.body();
			
			System.out.println(responseBody);
			System.out.println("===========");
			
			Gson gson = new Gson();
			
			DessertsResponse dessertsResponse = gson.fromJson(responseBody, DessertsResponse.class);
			
			for (Desserts desserts : dessertsResponse.getData()) {
				System.out.println(desserts);
	
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
