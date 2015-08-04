package co.youngleader.admin.rhino.rest.dao;

import java.util.List;

import co.youngleader.admin.rhino.rest.entities.Podcast;

public interface PodcastDao {
	
	public List<Podcast> getPodcasts();

	/**
	 * Returns a podcast given its id
	 * 
	 * @param id
	 * @return
	 */
	public Podcast getPodcastById(Long id);

	public Long deletePodcastById(Long id);

	public Long createPodcast(Podcast podcast);

	public int updatePodcast(Podcast podcast);

	/** removes all podcasts */
	public void deletePodcasts();	

}
