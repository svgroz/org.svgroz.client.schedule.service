package org.svgroz.client.schedule.service.dto

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.ZonedDateTime

data class ClientDto(
        @JsonProperty(value = "id", required = false) val id: String?,
        @JsonProperty(value = "createdAt", required = false) val createdAt: ZonedDateTime?,
        @JsonProperty(value = "fullName", required = true) val fullName: String,
        @JsonProperty(value = "phoneNumber", required = true) val phoneNumber: String,
        @JsonProperty(value = "info", required = false) val info: String?
)