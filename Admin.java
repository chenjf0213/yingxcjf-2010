package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    private String id;
    private String username;
    private String password;
    private String status;
    private String salt;
    private String level;
}

public static void main(String[] args){
    System.out.println("----")
}
