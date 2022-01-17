package com.yichou.album.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yichou.album.dao.AlbumDao;
import com.yichou.album.entity.Album;
import com.yichou.album.model.AlbumVo;

@Service
public class AlbumService {

	@Autowired
	private AlbumDao albumDao;

	public void add(AlbumVo vo) {
		Album entity = new Album();
		entity.setId(vo.getId());
		entity.setName(vo.getName());
		entity.setAlbum_date(vo.getAlbum_date());
		albumDao.save(entity);
	}

	public AlbumVo get(int id) {
		Album entity = albumDao.findById(id).orElse(new Album());
		AlbumVo vo = new AlbumVo();
		vo.setId(entity.getId());
		vo.setName(entity.getName());
		vo.setAlbum_date(entity.getAlbum_date());

		return vo;
	}
	
	public List<Album> getAll() {
		List<Album> list = albumDao.findAll();

		return list;
	}
}
