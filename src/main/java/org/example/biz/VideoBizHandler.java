package org.example.biz;

import jakarta.servlet.ServletException;
import org.example.Bean.Video;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;


@Service
public class VideoBizHandler {

    public ServerResponse getUsers(ServerRequest request) throws Exception{
        List<Video> videos = Arrays.asList(new Video("【1分钟布光挑战】用1盏灯，打出8种人像光",
                        "我是Jack，热爱影像设计与美学，梦想成为导演 专注灯光|影像|剪辑|审美，做视频关注我就对了 坚信视觉美感是做视频的核心竞争力",
                        "【1分钟布光挑战】用1盏灯，打出8种人像光",
                        576084124,
                        "摄影 科技 数码 摄影技巧 教程 布光 灯光 挑战 人像 Vlog 摄影布光",
                        "",
                        4,
                        1),
                new Video("【1分钟布光挑战】用1盏灯，打出8种人像光",
                        "我是Jack，热爱影像设计与美学，梦想成为导演 专注灯光|影像|剪辑|审美，做视频关注我就对了 坚信视觉美感是做视频的核心竞争力",
                        "【1分钟布光挑战】用1盏灯，打出8种人像光",
                        576084124,
                        "摄影 科技 数码 摄影技巧 教程 布光 灯光 挑战 人像 Vlog 摄影布光",
                        "",
                        4,
                        1));
        System.out.println("======");
        System.out.println("======");
        return ServerResponse
                .ok()
                .body(videos);
    }
    // find user by id
    public ServerResponse getUser(ServerRequest request) throws Exception{
        Video video = new Video("【1分钟布光挑战】用1盏灯，打出8种人像光",
                "我是Jack，热爱影像设计与美学，梦想成为导演 专注灯光|影像|剪辑|审美，做视频关注我就对了 坚信视觉美感是做视频的核心竞争力",
                "【1分钟布光挑战】用1盏灯，打出8种人像光",
                576084124,
                "摄影 科技 数码 摄影技巧 教程 布光 灯光 挑战 人像 Vlog 摄影布光",
                "",
                4,
                1);
        return ServerResponse
                .ok()
                .body(video);
    }
    public ServerResponse createUser(ServerRequest request) throws Exception {
        Video video = new Video("【1分钟布光挑战】用1盏灯，打出8种人像光",
                "我是Jack，热爱影像设计与美学，梦想成为导演 专注灯光|影像|剪辑|审美，做视频关注我就对了 坚信视觉美感是做视频的核心竞争力",
                "【1分钟布光挑战】用1盏灯，打出8种人像光",
                576084124,
                "摄影 科技 数码 摄影技巧 教程 布光 灯光 挑战 人像 Vlog 摄影布光",
                "",
                4,
                1);
        return ServerResponse
                .ok()
                .body(video);
    }
    public ServerResponse updateUser(ServerRequest request) throws Exception {
        Video video = new Video("【1分钟布光挑战】用1盏灯，打出8种人像光",
                "我是Jack，热爱影像设计与美学，梦想成为导演 专注灯光|影像|剪辑|审美，做视频关注我就对了 坚信视觉美感是做视频的核心竞争力",
                "【1分钟布光挑战】用1盏灯，打出8种人像光",
                576084124,
                "摄影 科技 数码 摄影技巧 教程 布光 灯光 挑战 人像 Vlog 摄影布光",
                "",
                4,
                1);
        return ServerResponse
                .ok()
                .body(video);
    }
    public ServerResponse deleteUser(ServerRequest request) throws Exception {
        String id = request.pathVariable("id");
        System.out.println();
        System.out.println("delete id: "+ id);
        System.out.println();
        return ServerResponse
                .ok()
                .body(true);
    }
    public ServerResponse saveUser(ServerRequest request) throws ServletException, IOException {
        Video video = request.body(Video.class);

        return ServerResponse
                .ok()
                .build();
    }
}
