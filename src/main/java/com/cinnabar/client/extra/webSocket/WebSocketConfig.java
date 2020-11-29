package com.cinnabar.client.extra.webSocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;
/**
 * @author cinnabar-1
 * @version 1.0.0
 * @ClassName WebSocketConfig.java
 * @Description
 * @createTime 2020-11-27  19:19:00
 */

/**
 * 开启WebSocket支持
 * @author zhengkai.blog.csdn.net
 */
@Configuration
public class WebSocketConfig {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

}
