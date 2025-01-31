package com.wicio.shiplog.vessel.api.dto;

import java.time.Instant;
import lombok.Builder;

@Builder
public record CreateVesselResponse(
    Long id,
    String name,
    Instant productionDate) {

}
