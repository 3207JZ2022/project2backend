package org.example.Mapper;


//import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.Bean.Video;

import java.util.List;

@Mapper
public interface OlMapper {
    @Select ("select * from videosmanagement.videos")
    public List<Video> searchAll();
}
