package com.company.WeatherAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherApiApplication {

	public static void main(String[] args) {

		WebClient client = WebClient.create("http://api.openweathermap.org/data/2.5/weather?q=Los Angeles&units=imperial&appid=312444bc10841f16418912a210aaf02b");

		WeatherResponse weatherResponse = null;

		try {
			Mono<WeatherResponse> response = client
					.get()
					.retrieve()
					.bodyToMono(WeatherResponse.class);

			WeatherResponse weatherResponse = response.share().block();
		}

		catch (WebClientResponseException we) {
			int statusCode = we.getRawStatusCode();
			if (statusCode >= 400 && statusCode < 500) {
				System.out.println("Client error");
			}
			else if (statusCode >= 500 && statusCode < 600) {
				System.out.println("Server error");
			}
			System.out.println("Message: " + we.getMessage());
		}

		catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		}

		if (weatherResponse != null) {
			System.out.println(weatherResponse.weather[0]);
		}
		//SpringApplication.run(WeatherApiApplication.class, args);
	}

}
