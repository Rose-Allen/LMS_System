package kz.bitlab.mainService.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AttachmentDto {

    private Long id;
    private String name;
    private String url;
    private Long lessonId;
    private LocalDateTime createdTime;
}