package ru.kolesnikov.linkshorterer.controller;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
public class LinkShortererControllerTest {


    @Autowired
    private LinkShortererController controller;

    @Test
    public void contextLoads() {
        Assert.assertNotNull(controller);
    }

    @Test
    public void createTest() {
        String shortLink = controller.createShortLink("vk.com");
        Assert.assertNotNull(shortLink);
        Assert.assertTrue(shortLink.contains("short.ru"));
    }

    @Test
    public void getTest() {
        String shortLink = controller.createShortLink("vk.com");
        Assert.assertNotNull(shortLink);
        String old = controller.getLongLink(shortLink);
        Assert.assertNotNull(shortLink);
        Assert.assertTrue(old.equals("vk.com"));
    }
}
