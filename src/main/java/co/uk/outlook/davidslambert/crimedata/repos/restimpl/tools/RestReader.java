package co.uk.outlook.davidslambert.crimedata.repos.restimpl.tools;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestReader<T> {

    public T fetchGetResults(final String url, ParameterizedTypeReference<T> typeReference) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<T> response =
                restTemplate.exchange(url,
                        HttpMethod.GET, null, typeReference);
        return response.getBody();
    }

}
