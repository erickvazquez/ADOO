/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner;

import java.io.IOException;
import java.net.MalformedURLException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;


/**
 *
 * @author ertim
 */
public class SMS {
    public SMS(){
        
    }
    public void mandar(String numero, String Mensaje) throws MalformedURLException, IOException{
        HttpClient httpClient = HttpClientBuilder.create().build();
        try {
            HttpPost request = new HttpPost("https://smsgateway.me/api/v4/message/send");
            request.addHeader("Authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJhZG1pbiIsImlhdCI6MTUyNzY0NTA5NiwiZXhwIjo0MTAyNDQ0ODAwLCJ1aWQiOjUzOTIxLCJyb2xlcyI6WyJST0xFX1VTRVIiXX0.xaB6NBOIpj-ISVXPD9az5UCjwSiD_wBH9fDvZF0epk0");
            StringEntity params =new StringEntity("[{\"phone_number\":\""+numero+"\",\"message\":\""+Mensaje+"\",\"device_id\":\"91573\"}]");
            request.addHeader("content-type", "application/x-www-form-urlencoded");
            request.setEntity(params);
            HttpResponse response = httpClient.execute(request);
        }catch (Exception ex) {
            //handle exception here

        } finally {
            //Deprecated
            //httpClient.getConnectionManager().shutdown(); 
        }
    }
}

