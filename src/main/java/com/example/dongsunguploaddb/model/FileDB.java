package com.example.dongsunguploaddb.model;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * packageName : com.example.dongsunguploaddb.model
 * fileName : FileDB
 * author : jc
 * date : 2022-05-31
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-31         jc          최초 생성
 */
@Setter
@Getter
@ToString
//@NoArgsConstructor : Lombok 지원(매개변수 없는 생성자를 자동으로 만들어줌)
@NoArgsConstructor
public class FileDB {
    private String id; // 첨부파일 id
    private String name; // 첨부파일 이름
    private String type; // 첨부파일 타입(image, text 등)
    private byte[] data; // oracle 이미지 담는 자료형(blob) : byte[]

    public FileDB(String name, String type, byte[] data) {
        this.name = name;
        this.type = type;
        this.data = data;
    }
}
