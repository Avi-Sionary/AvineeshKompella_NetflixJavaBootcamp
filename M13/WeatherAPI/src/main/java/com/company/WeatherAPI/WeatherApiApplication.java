package com.company.WeatherAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class WeatherApiApplication {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a city name: ");
		String city = scanner.nextLine();

		WebClient client = WebClient.create("http://api.openweathermap.org/data/2.5/weather?q=" + city + "&units=imperial&appid=312444bc10841f16418912a210aaf02b");

		String json = null;

		try {
			Mono<String> response = client
					.get()
					.retrieve()
					//.bodyToMono(WeatherResponse.class);
					.bodyToMono(String.class);

			//WeatherResponse weatherResponse = response.share().block();
			json = response.share().block();
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

		//if (weatherResponse != null) {
		if (json != null)
			//System.out.println(weatherResponse.weather[0]);
			System.out.println("here u go: \n" + json);

			Mono<WeatherResponse> response2 = client.get().retrieve().bodyToMono(WeatherResponse.class);

			WeatherResponse json2 = response2.share().block();

			System.out.println();
			System.out.println("WEATHER DATA FOR " + json2.name.toUpperCase() + ", " + json2.sys.get("country") + " (ID " + json2.id + "):\n-------------");

			System.out.println("City Longitude: " + json2.coord.get("lon"));
			System.out.println("City Latitude: " + json2.coord.get("lat"));
			System.out.println();

			System.out.println("Weather: " + json2.weather[0].main);
			System.out.println();

			System.out.println("Base: " + json2.base);
			System.out.println();

			System.out.println("Temperature: " + json2.main.get("temp") + " K");
			System.out.println("Feels like: " + json2.main.get("feels_like") + " K");
			System.out.println("Minimum temperature is: " + json2.main.get("temp_min") + " K");
			System.out.println("Maximum temperature is: " + json2.main.get("temp_max") + " K");
			System.out.println("Atmospheric Pressure: " + json2.main.get("pressure") + " hPa");
			System.out.println("Humidity: " + json2.main.get("humidity") + "%");
			System.out.println();

			System.out.println("Visibility: " + json2.visibility + " km");
			System.out.println();

			System.out.println("Wind speed: " + json2.wind.get("speed") + " meter/sec");
			System.out.println("Wind direction: " + json2.wind.get("deg") + " degrees");
			System.out.println();

			System.out.println("Cloudiness: " + json2.clouds.get("all") + "%");
			System.out.println();

			System.out.println("Timezone shift: " + json2.timezone + " seconds from UTC");



		// WeatherResponse weatherResponse = null;
	}
		//SpringApplication.run(WeatherApiApplication.class, args);
	}
