package ru.kolesnikov.linkshorterer.service;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.kolesnikov.linkshorterer.model.entity.Link;
import ru.kolesnikov.linkshorterer.reposirory.LinkRepository;
import ru.kolesnikov.linkshorterer.service.impl.LinkShortererServiceImpl;

@ExtendWith(MockitoExtension.class)
public class LinkShortererServiceTest {

    @Mock
    private LinkRepository linkRepository;

    @Mock
    private ShortLinkGenerator shortLinkGenerator;

    @InjectMocks
    private LinkShortererServiceImpl linkShortererService;

    private final Link saved = new Link();

    @BeforeEach
    public void before() {
        saved.setShortLink("test.com");
        Mockito.when(linkRepository.save(Mockito.any(Link.class))).thenReturn(saved);
    }

    @Test
    public void createTest() {
        String shortLink = linkShortererService.create("test-link.com");
        Assert.assertEquals(saved.getShortLink(), shortLink);
    }

}
