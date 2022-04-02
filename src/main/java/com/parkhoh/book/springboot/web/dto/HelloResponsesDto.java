package com.parkhoh.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloResponsesDto {

    private final String name;
    private final int amount;

}
