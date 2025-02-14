package org.example.module3_ecosystem.c05_lombok;

import lombok.Builder;

@Builder
public record Teacher(
        String id,
        String name,
        String subject
) {
}
