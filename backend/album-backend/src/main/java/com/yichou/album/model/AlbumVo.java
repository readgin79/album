package com.yichou.album.model;

import java.util.Date;

public class AlbumVo {
	private Integer id;
    private String name;
    private Date album_date;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id:" + id + ",");
        sb.append("name:" + name + ",");
        sb.append("album_date:" + album_date);
        return sb.toString();
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getAlbum_date() {
		return album_date;
	}

	public void setAlbum_date(Date album_date) {
		this.album_date = album_date;
	}
}
