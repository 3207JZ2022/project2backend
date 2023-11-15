package org.example.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.Bean.Video;
import org.example.Bean.VideoSource;

import java.util.List;

@Mapper
public interface VideoMapper {


    @Select("SELECT * FROM videosmanagement.videos "+
            "WHERE releaseDate >= DATE_SUB(CURRENT_TIMESTAMP(), INTERVAL 3 MONTH) AND releaseDate <= CURRENT_TIMESTAMP() "+
            "ORDER BY views DESC")
    public List<Video> getRecentVideos();

    @Select("SELECT * FROM videosmanagement.videos "+
            " WHERE videos.title LIKE '%' #{searchQuery} '%'")
    public List<Video> getVideoByTitle(String searchQuery);

    @Select("SELECT * FROM videosmanagement.videos "+
            "WHERE videos.videoId = #{videoId}")
    public Video getVideoByVideoId(String videoId);

    @Select("select * from videosmanagement.videosource "+
             "where videoID = #{videoID} "+
             "and episode = #{episode} " )
    public VideoSource getVideoSource(String videoID, String episode);


}
