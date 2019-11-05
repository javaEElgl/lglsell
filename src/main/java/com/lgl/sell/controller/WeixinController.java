package com.lgl.sell.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
@RequestMapping("/weixin")
public class WeixinController {

    @GetMapping("/auth")
    public void auth(@RequestParam("code")String code){
        log.info("进入auth中了");
        log.info("code={}",code);

        String url="https://api.weixin.qq.com/sns/oauth2/access_token?appid=wx77a70bc3f6ee2bb2&secret=b70059f406474c6f0854c1a5775bb2c9&code="+code+"&grant_type=authorization_code";

        RestTemplate restTemplate=new RestTemplate();
        String s = restTemplate.getForObject(url, String.class);
        System.out.println(s);
    }
}
