package ru.kolesnikov.linkshorterer.reposirory;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kolesnikov.linkshorterer.model.entity.Link;


@Repository
public interface LinkRepository extends CrudRepository<Link, Long> {

    @Query("SELECT link FROM Link link WHERE link.shortLink = :shortLink")
    Link getLinkByShotLink(String shortLink);
}
