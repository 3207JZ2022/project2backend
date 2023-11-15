package org.example.Bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VideoSource {
    private int duration;
    private int videoID;
    private int episode;
    private String src;
}
