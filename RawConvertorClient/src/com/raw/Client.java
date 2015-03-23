package com.raw;

import java.util.List;

import com.cdyne.ws.weatherws.ArrayOfWeatherDescription;
import com.cdyne.ws.weatherws.Weather;
import com.cdyne.ws.weatherws.WeatherDescription;
import com.cdyne.ws.weatherws.WeatherSoap;

public class Client {
public static void main(String[] args) {

	Weather weather = new Weather();
WeatherSoap ws=weather.getWeatherSoap();
ws.getCityForecastByZIP("10001");
ws.getCityWeatherByZIP("10001");
ArrayOfWeatherDescription list = ws.getWeatherInformation();
List<WeatherDescription> weatherlist = list.getWeatherDescription();
for(WeatherDescription wd:weatherlist){
	System.out.println(wd.getDescription());
}

}

}

