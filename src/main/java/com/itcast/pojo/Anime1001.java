package com.itcast.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Data
@Component
public class Anime1001 {

    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;

    @Override
    public String toString() {
        return "Anime1001{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
