package com.yichou.album;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.yichou.album.model.AlbumVo;
import com.yichou.album.service.AlbumService;

@SpringBootApplication
public class AlbumBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlbumBackendApplication.class, args);
		/*ConfigurableApplicationContext context = 
                SpringApplication.run(AlbumBackendApplication.class, args); // 取得Spring Context

        AlbumService albumService = context.getBean(AlbumService.class); // 取得AlbumService的bean

        AlbumVo vo1 = new AlbumVo();
        vo1.setName("new album");
        vo1.setAlbum_date(new Date());
        albumService.add(vo1); // 新增
        
        System.out.println(albumService.getAll()); */
	}

}
