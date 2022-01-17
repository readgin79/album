package com.yichou.album.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yichou.album.service.AlbumService;

@RestController
public class AlbumController {
	
	@Autowired
	private AlbumService albumService;
	
	@GetMapping("/GetAll")
	public String getAll() {
		return albumService.getAll().toString();
	}
}
