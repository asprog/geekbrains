package ru.gb_cource2.lesson7;

import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import ru.gb_cource2.lesson7.accuWeather.AccuWeatherClass;
import ru.gb_cource2.lesson7.accuWeather.DailyForecast;
import ru.gb_cource2.lesson7.accuWeather.RequestParam;

import java.io.IOException;
import java.util.Scanner;

public class AccuWeatherRequest {
    public static void main(String[] args) {
        AccuWeatherRequest accRequest = new AccuWeatherRequest();
        accRequest.request();

    }
    private void request(){
        CloseableHttpClient httpClient = null;
        //Type typeOfObjectsList = null;
        String result = "";
        try {
            httpClient = HttpClients.createDefault();
            httpClient = HttpClients.createDefault();
            String urs =  String.format("%s://%s/%s/%s/%s/%s/%s?apikey=%s&language=%s&details=%s&metric=%s",
                    RequestParam.PROTO,
                    RequestParam.HOST,
                    RequestParam.FORECAST,
                    RequestParam.API_VERSION,
                    RequestParam.DAILY,
                    RequestParam.DAYS,
                    RequestParam.CITY_ID,
                    RequestParam.API_KEY,
                    RequestParam.LANG,
                    RequestParam.DETAILS,
                    RequestParam.METRIC
            );
            System.out.printf(urs);
            HttpGet httpGet = new HttpGet(urs);
            HttpResponse response = httpClient.execute(httpGet);
            int status = response.getStatusLine().getStatusCode();
            if (status < 200 && status > 300) return ;
            Scanner sc = new Scanner(response.getEntity().getContent());
            while(sc.hasNext()) {
                result += sc.nextLine();
            }
            System.out.println(result);

            accuWeatherPrint(new Gson().fromJson(result,AccuWeatherClass.class));
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                httpClient.close();
            } catch (IOException ex) {
               System.out.println(ex.toString());
            }
        }
       // return new Gson().fromJson(result, typeOfObjectsList);

    }

    private void accuWeatherPrint(AccuWeatherClass accuWeather) {
        System.out.println("city: Moscow");
        for(DailyForecast dailyForecast : accuWeather.getDailyForecasts()) {
           System.out.println("date: " + dailyForecast.getDate()
                   + " IconPhrase: " + dailyForecast.getDay().getIconPhrase()
                   + " temp min: " + dailyForecast.getTemperature().getMinimum().getValue() + "C"
                   + " temp max: " + dailyForecast.getTemperature().getMaximum().getValue() + "C"
           );
        }
    }
}
