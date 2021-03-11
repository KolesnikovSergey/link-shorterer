package ru.kolesnikov.linkshorterer.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kolesnikov.linkshorterer.model.entity.Link;
import ru.kolesnikov.linkshorterer.reposirory.LinkRepository;
import ru.kolesnikov.linkshorterer.service.LinkShortererService;
import ru.kolesnikov.linkshorterer.service.ShortLinkGenerator;

import java.util.Date;

@Service
@AllArgsConstructor
public class LinkShortererServiceImpl implements LinkShortererService {

    private LinkRepository linkRepository;
    private ShortLinkGenerator shortLinkGenerator;

    @Override
    public String create(String longLink) {
        Link link = new Link();
        link.setLongLink(longLink);
        link.setShortLink(shortLinkGenerator.generateShortLink(longLink));
        link.setCreateDate(new Date());
        return linkRepository.save(link).getShortLink();
    }

    @Override
    public String getLongByShort(String shortLink) {
        Link link = linkRepository.getLinkByShotLink(shortLink);
        return link != null ? link.getLongLink() : null;
    }
}
