package com.joyce.webclient.demo.controller;

import com.joyce.webclient.demo.model.UserModel;
import com.joyce.webclient.demo.util.MyResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.ZonedDateTime;

@RestController
public class WebclientController {

    /**
     retrieve 返回 mono 对象
     */
    @RequestMapping("/webclient/test-a")
    public MyResponse test_a() {
        WebClient client = WebClient.create("http://localhost");
        Mono<MyResponse> mono = client.get()
                .uri("/webclient/test-b")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(MyResponse.class);
        return MyResponse.of("200", mono.block(Duration.ofMillis(2000)));
    }

    @RequestMapping("/webclient/test-b")
    public MyResponse test_b() {
        MyResponse res = MyResponse.of("200", "ok");
        res.put("time", ZonedDateTime.now());
        return res;
    }

}
