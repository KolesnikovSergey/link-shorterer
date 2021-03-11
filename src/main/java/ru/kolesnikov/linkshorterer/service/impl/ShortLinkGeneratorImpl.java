package ru.kolesnikov.linkshorterer.service.impl;

import org.springframework.stereotype.Service;
import ru.kolesnikov.linkshorterer.service.ShortLinkGenerator;

import java.util.Date;

@Service
public class ShortLinkGeneratorImpl implements ShortLinkGenerator {

    private final String PREFIX = "https://short.ru/";

    @Override
    public String generateShortLink(String longLink) {
        return PREFIX + new Date().getTime();
    }
}
