package ru.kolesnikov.linkshorterer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.kolesnikov.linkshorterer.service.LinkShortererService;

@RestController
@RequestMapping("/short")
@AllArgsConstructor
public class LinkShortererController {

    private LinkShortererService linkShortererService;

    @PostMapping(value = "/create")
    public String createShortLink(@RequestParam String link) {
        return linkShortererService.create(link);
    }

    @GetMapping(value = "/get")
    public String getLongLink(@RequestParam String shortLink) {
        return linkShortererService.getLongByShort(shortLink);
    }
}
