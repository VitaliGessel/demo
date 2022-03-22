package kz.controller.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/health")
public class HealthController {

    @GetMapping
    public String getHealthController()
    {
        return "ok";
    }
}
