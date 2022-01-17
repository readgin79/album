package com.yichou.album.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yichou.album.entity.Album;

@Repository
public interface AlbumDao extends JpaRepository<Album, Integer>{

}
