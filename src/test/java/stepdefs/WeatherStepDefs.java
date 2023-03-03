package stepdefs;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.Minute;
import model.WeatherResponse;
import org.junit.jupiter.api.Assertions;
import requesters.WeatherRequester;

import java.util.List;
import java.util.Map;

public class WeatherStepDefs {
    private long cityId;
    private WeatherResponse response; //null


    @Given("city ID is: {long}")
    public void set_city_id(long cityId) {
        this.cityId = cityId;
    }


    @When("we are requesting weather forecast")
    public void request_weather() throws JsonProcessingException {
        WeatherRequester requester = new WeatherRequester();
        response = requester.requestWeather(cityId);
    }

    @Then("coordinates are:")
    public void check_coordinates(Map<String, Double> params) {
        Assertions.assertEquals(params.get("latitude"), response.getLat(), "WRONG Lat");
        Assertions.assertEquals(params.get("longtitude"), response.getLon(), "WRONG Lon");
    }

    @Then("timezone information is:")
    public void check_timezone(Map<String, String> params) {
        Assertions.assertEquals(params.get("timezone"), response.getTimezone(), "WRONG timezone");
        Assertions.assertEquals(params.get("offset"), String.valueOf(response.getTimezoneOffset()), "WRONG timezone offset");
    }

    @Then("current weather data is:")
    public void check_current_weather(Map<String, String> params) {
        Assertions.assertEquals(params.get("time"), String.valueOf(response.getCurrent().getDt()));
        Assertions.assertEquals(params.get("sunrise"), String.valueOf(response.getCurrent().getSunrise()));
        Assertions.assertEquals(params.get("sunset"), String.valueOf(response.getCurrent().getSunset()));
        Assertions.assertEquals(params.get("temperature"), String.valueOf(response.getCurrent().getTemp()));
        Assertions.assertEquals(params.get("feels_like"), String.valueOf(response.getCurrent().getFeelsLike()));
        Assertions.assertEquals(params.get("pressure"), String.valueOf(response.getCurrent().getPressure()));
        Assertions.assertEquals(params.get("humidity"), String.valueOf(response.getCurrent().getHumidity()));
        Assertions.assertEquals(params.get("dew_point"), String.valueOf(response.getCurrent().getDewPoint()));
        Assertions.assertEquals(params.get("uvi"), String.valueOf(response.getCurrent().getUvi()));
        Assertions.assertEquals(params.get("clouds"), String.valueOf(response.getCurrent().getClouds()));
        Assertions.assertEquals(params.get("visibility"), String.valueOf(response.getCurrent().getVisibility()));
    }

    @Then("{word} wind data is:")
    public void check_wind(String windTime, Map<String, Double> params) {


    }

    @Then("{word} weather is:")
    public void current_weather(String weatherTime, Map<String, String> params) {

    }

    @Then("minutely weather data is:")
    public void check_minute_weather(Map<String, Long> params) {
        Assertions.assertEquals(params.get("time"), response.getMinutely().get(0).getDt());
        Assertions.assertEquals(params.get("precipitation"), response.getMinutely().get(0).getPrecipitation());
    }
// PAJAUTAAT PEEC KAADA PRINCIPA STRAADAA SHIS TE AUGSHAA KAAPEC IR GET (0)

    @Then("hourly weather data is:")
    public void check_hourly_weather(Map<String, String> params) {
        Assertions.assertEquals(params.get("time"), String.valueOf(response.getHourly().get(0).getDt()));
        Assertions.assertEquals(params.get("temp"), String.valueOf(response.getHourly().get(0).getTemp()));
        Assertions.assertEquals(params.get("feels_like"), String.valueOf(response.getHourly().get(0).getFeelsLike()));
        Assertions.assertEquals(params.get("pressure"), String.valueOf(response.getHourly().get(0).getPressure()));
        Assertions.assertEquals(params.get("humidity"), String.valueOf(response.getHourly().get(0).getHumidity()));
        Assertions.assertEquals(params.get("dew_point"), String.valueOf(response.getHourly().get(0).getDewPoint()));
        Assertions.assertEquals(params.get("uvi"), String.valueOf(response.getHourly().get(0).getUvi()));
        Assertions.assertEquals(params.get("clouds"), String.valueOf(response.getHourly().get(0).getClouds()));
        Assertions.assertEquals(params.get("visibility"), String.valueOf(response.getHourly().get(0).getVisibility()));
        Assertions.assertEquals(params.get("pop"), String.valueOf(response.getHourly().get(0).getPop()));
    }

    @Then("daily weather data is:")
    public void check_daily_weather(Map<String, String> params) {
        Assertions.assertEquals(params.get("dt"), String.valueOf(response.getDaily().get(0).getDt()));
        Assertions.assertEquals(params.get("sunrise"), String.valueOf(response.getDaily().get(0).getSunrise()));
        Assertions.assertEquals(params.get("sunset"), String.valueOf(response.getDaily().get(0).getSunset()));
        Assertions.assertEquals(params.get("moonrise"), String.valueOf(response.getDaily().get(0).getMoonrise()));
        Assertions.assertEquals(params.get("moonset"), String.valueOf(response.getDaily().get(0).getMoonset()));
        Assertions.assertEquals(params.get("moon_phase"), String.valueOf(response.getDaily().get(0).getMoonPhase()));
        Assertions.assertEquals(params.get("pressure"), String.valueOf(response.getDaily().get(0).getPressure()));
        Assertions.assertEquals(params.get("humidity"), String.valueOf(response.getDaily().get(0).getHumidity()));
        Assertions.assertEquals(params.get("dew_point"), String.valueOf(response.getDaily().get(0).getDewPoint()));
        Assertions.assertEquals(params.get("clouds"), String.valueOf(response.getDaily().get(0).getClouds()));
        Assertions.assertEquals(params.get("pop"), String.valueOf(response.getDaily().get(0).getPop()));
        Assertions.assertEquals(params.get("rain"), String.valueOf(response.getDaily().get(0).getRain()));
        Assertions.assertEquals(params.get("uvi"), String.valueOf(response.getDaily().get(0).getUvi()));
    }

    @Then("daily weather temperature is:")
    public void check_daily_weather_temperature(Map<String, Double> params) {
      Assertions.assertEquals(params.get("day"),response.getDaily().get(0).getTemp().getDay());
      Assertions.assertEquals(params.get("min"),response.getDaily().get(0).getTemp().getMin());
      Assertions.assertEquals(params.get("max"),response.getDaily().get(0).getTemp().getMax());
      Assertions.assertEquals(params.get("night"),response.getDaily().get(0).getTemp().getNight());
      Assertions.assertEquals(params.get("evening"),response.getDaily().get(0).getTemp().getEve());
      Assertions.assertEquals(params.get("morning"),response.getDaily().get(0).getTemp().getMorn());
    }

    @Then("daily feels like weather is:")
    public void check_daily_feels_like_weather(Map<String, Double> params) {
        Assertions.assertEquals(params.get("day"),response.getDaily().get(0).getFeelsLike().getDay());
        Assertions.assertEquals(params.get("night"),response.getDaily().get(0).getFeelsLike().getNight());
        Assertions.assertEquals(params.get("evening"),response.getDaily().get(0).getFeelsLike().getEve());
        Assertions.assertEquals(params.get("morning"),response.getDaily().get(0).getFeelsLike().getMorn());
    }

    @Then("alert Nr. {int} received:")
    public void check_alert(int index, Map<String, String> params) {

    }

    @Then("tags for an alert Nr. {int} are:")
    public void check_tags(int index, List<String> tags) {

    }


}


