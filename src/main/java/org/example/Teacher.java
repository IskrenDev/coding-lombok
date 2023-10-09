package org.example;

import lombok.Builder;

@Builder
public record Teacher (
    String id,

    String name,

    String subject
) {

}
