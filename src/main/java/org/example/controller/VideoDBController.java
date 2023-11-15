package org.example.controller;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.io.IOUtils;
import org.example.Bean.Video;
import org.example.Bean.VideoSource;
import org.example.Mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.List;

@RestController
@RequestMapping("")
public class VideoDBController {

    @Autowired
    private VideoMapper videoMapper;

    // Obtain video information for home page
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/home")
    public List<Video> home() {
        List<Video> searchResult = videoMapper.getRecentVideos();

        return searchResult;

    }

    // Obtain video information from search query
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/search")
    public List<Video> searchResult(@RequestParam("searchQuery") String searchQuery){
        List<Video> searchResult = videoMapper.getVideoByTitle(searchQuery);
        System.out.println();
        System.out.println(searchResult);
        System.out.println();
        return searchResult;
    }

    // Obtain cover image for videos
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/cover")
    public void getImg(HttpServletRequest request, HttpServletResponse response, @RequestParam("imgSrc") String imgSrc) throws Exception{
        ServletOutputStream os = response.getOutputStream();
        String path = "C:\\Users\\a1205\\Desktop\\Java\\Web\\SpringBoot\\VideoHosting\\src\\main\\resources\\public\\";
        FileInputStream is = new FileInputStream(new File(path, imgSrc));
        IOUtils.copy(is,os);
        System.out.println();
        System.out.println(os);
        System.out.println();
        IOUtils.closeQuietly(is);
        IOUtils.closeQuietly(os);
    }

//  Obtain video by videoID
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/video")
    public Video getVideoSrc(@RequestParam("videoId") String videoId){
        Video video = videoMapper.getVideoByVideoId(videoId);
        return video;
    }

    // pass entire video as a file, cannot play video through drag progress bar
//    @CrossOrigin(origins = "http://localhost:4200")
//    @GetMapping("/sample")
//    public void getVideo(HttpServletRequest request, HttpServletResponse response, @RequestParam("src") String src) throws Exception{
//        ServletOutputStream os = response.getOutputStream();
//        String path = "C:\\Users\\a1205\\Desktop\\Java\\Web\\SpringBoot\\VideoHosting\\src\\main\\resources\\public\\";
//        FileInputStream is = new FileInputStream(new File(path, src));
//        IOUtils.copy(is,os);
//        System.out.println();
//        System.out.println(os);
//        System.out.println();
//        IOUtils.closeQuietly(is);
//        IOUtils.closeQuietly(os);
//    }
}
