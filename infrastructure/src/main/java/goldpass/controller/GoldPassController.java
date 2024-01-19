package goldpass.controller;

import goldpass.dtos.GoldPassDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/goldpass")
public class GoldPassController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get")
    public GoldPassDTO getPass() {
        String apiUrl = "https://api.clashofclans.com/v1/goldpass/seasons/current";
        try {
            Thread.sleep(10000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // Encabezados de la solicitud
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.AUTHORIZATION, "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiIsImtpZCI6IjI4YTMxOGY3LTAwMDAtYTFlYi03ZmExLTJjNzQzM2M2Y2NhNSJ9.eyJpc3MiOiJzdXBlcmNlbGwiLCJhdWQiOiJzdXBlcmNlbGw6Z2FtZWFwaSIsImp0aSI6IjdhYWFjMmM2LTM2OWMtNDRjMC05N2JhLWI4NGRhY2NlMmY3NyIsImlhdCI6MTcwNTIwMTQzMSwic3ViIjoiZGV2ZWxvcGVyLzkyNjBmN2Q2LTQ4YjAtMjhjNy00Mzg3LTRiYmMwMTdlNDZhYSIsInNjb3BlcyI6WyJjbGFzaCJdLCJsaW1pdHMiOlt7InRpZXIiOiJkZXZlbG9wZXIvc2lsdmVyIiwidHlwZSI6InRocm90dGxpbmcifSx7ImNpZHJzIjpbIjkxLjI0Mi4xNDUuMTEzIl0sInR5cGUiOiJjbGllbnQifV19.OPvkyDUlKwPavav6oeC7psuwiEgLOMPwP2AtSE6L6divxksLy19ARSs0OR54AmqYQeYTmRjMspIfpsH8J4ou2Q");
        headers.setContentType(MediaType.APPLICATION_JSON);

        // Construir la entidad de solicitud
        RequestEntity<Void> requestEntity = RequestEntity.get(apiUrl).headers(headers).build();

        ResponseEntity<String> responseEntity = restTemplate.exchange(
                requestEntity,
                String.class
        );
        // Realizar la solicitud
        GoldPassDTO responseEntity2 = restTemplate.exchange(
                requestEntity,
                GoldPassDTO.class
        ).getBody();

        // Puedes devolver la respuesta o manejarla según tus necesidades
        return responseEntity2;
    }
}
