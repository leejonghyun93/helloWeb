package org.kosa.helloweb;

import jakarta.servlet.ServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeController {

    @GetMapping("/")
    public String index(ServletRequest request) {
        log.info("server port = {}", request.getServerPort());
        return "CICD반영됨 Hello World... " + request.getServerPort();
    }
}
