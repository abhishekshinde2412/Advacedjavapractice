package com.cdac.app;

import java.time.LocalDate;

import com.cdac.dao.GenericDao;
import com.cdac.entity.Album;

public class AlbumSongExample {

	public static void main(String[] args) {
		
		GenericDao dao = new GenericDao();
		
		Album album = new Album();
		
		album.setName("Hits of 2020");
		album.setReleaseDate(LocalDate.of(2020, 12, 30));
		album.setCopyright("Amazon Music");
		dao.save(album);
		
		
	}
}
