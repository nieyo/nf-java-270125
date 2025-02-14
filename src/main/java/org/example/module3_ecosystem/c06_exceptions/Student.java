package org.example.module3_ecosystem.c06_exceptions;

import lombok.Builder;
import lombok.With;

@Builder
@With
public record Student(
        String id,
        String name,
        String subject
) {
}
