package org.example.module3_ecosystem.c05_lombok;

import lombok.Builder;
import lombok.With;

@Builder
@With
public record Teacher(
        String id,
        String name,
        String subject
) {
}
