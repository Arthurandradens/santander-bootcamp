package me.arthur.service;

import me.arthur.domain.models.WatchList;
import me.arthur.request.WatchListRequest;
import me.arthur.resource.WatchListResource;

import java.util.List;

public interface ServiceTemplate {
    WatchList findByItemId(Long movie_id);

    Boolean deleteAllElements(List<Long> ids);

    List<WatchListResource>findAll();

    WatchList create(WatchListRequest watchListToCreate);
    Boolean findByMovieId(Long movie_id);
}
