package org.example.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.Bean.VideoSource;
import org.example.Mapper.VideoMapper;
import org.example.NonStaticResourceHttpRequestHandler;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.nio.charset.StandardCharsets;


@Controller
//@RequestMapping(value = "/api/baseResource")
public class BaseSourceApiController {

    @Autowired
    private VideoMapper videoMapper;
    @Autowired
    private NonStaticResourceHttpRequestHandler nonStaticResourceHttpRequestHandler;


    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/videosrc", method = RequestMethod.GET)
    public void video(
            HttpServletRequest request,
            HttpServletResponse response,
            @RequestParam("videoId") String videoId,
            @RequestParam("episode") String episode

    ) {
        try {
            VideoSource vs = videoMapper.getVideoSource(videoId,episode);
//            System.out.println();
//            System.out.println();
//            System.out.println(vs);
//            System.out.println();
//            System.out.println();
            String src= vs.getSrc();
//            System.out.println();
//            System.out.println();
//            System.out.println(src);
//            System.out.println();
//            System.out.println();
            String path = "C:\\Users\\a1205\\Desktop\\Java\\Web\\SpringBoot\\VideoHosting\\src\\main\\resources\\public\\"+src;
            File file = new File(path);
            if (file.exists()) {
                request.setAttribute(NonStaticResourceHttpRequestHandler.ATTR_FILE, path);
                nonStaticResourceHttpRequestHandler.handleRequest(request, response);
            } else {
                response.setStatus(HttpServletResponse.SC_NOT_FOUND);
                response.setCharacterEncoding(StandardCharsets.UTF_8.toString());
            }
        } catch (Exception e) {

        }
    }
}