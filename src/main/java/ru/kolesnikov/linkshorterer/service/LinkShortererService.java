package ru.kolesnikov.linkshorterer.service;

public interface LinkShortererService {

    String create(String longLink);

    String getLongByShort(String shortLink);
}
