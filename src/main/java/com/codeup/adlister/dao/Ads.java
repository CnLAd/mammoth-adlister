package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;

import java.util.List;

public interface Ads {
    // get a list of all the ads
    List<Ad> all();
    // insert a new ad and return the new ad's id
    Long insert(Ad ad);
    Ad findAdById(Long id);
    List<Ad> searchAds(String search);
    List<Ad> findAdsByUser(long id);
    void editAd(Long id, String title, String description, long price, long category);
    void deleteAd(Long id);
}
