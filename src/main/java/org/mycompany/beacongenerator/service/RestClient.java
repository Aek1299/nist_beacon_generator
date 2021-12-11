package org.mycompany.beacongenerator.service;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class RestClient {

    public String getLastPulse() throws IOException {
        return sendRequest("https://beacon.nist.gov/beacon/2.0/pulse/last");
    }

    public String getPulse(int index) throws IOException {
        System.out.println("Current index: "+index);
        return sendRequest("https://beacon.nist.gov/beacon/2.0/chain/1/pulse/"+index);
    }

    private String sendRequest(String url) throws IOException {
        HttpGet request = new HttpGet(url);
        String result = null;
        try(CloseableHttpClient client = HttpClients.createDefault();
            CloseableHttpResponse response = client.execute(request)){
            if(response.getStatusLine().getStatusCode()!= 200){
                throw new RuntimeException("Service is unavailable");
            }
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                result = EntityUtils.toString(entity);
            }
            return result;
        }
    }

}
