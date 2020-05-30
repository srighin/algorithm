package com.algorithm.dp;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@ToString
@RequiredArgsConstructor
@Accessors(fluent = true, chain = true)
public class TestAnnotation {

    @Setter
    boolean hasExpUserId;
}
