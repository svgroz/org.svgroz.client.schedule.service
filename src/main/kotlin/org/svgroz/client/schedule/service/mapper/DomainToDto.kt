package org.svgroz.client.schedule.service.mapper


import org.svgroz.client.schedule.service.dto.ClientDto
import org.svgroz.client.schedule.service.model.Client
import java.time.ZoneId
import java.time.ZonedDateTime

object DomainToDto {
    fun map(client: Client): ClientDto {
        return ClientDto(
                id = requireNotNull(client.id),
                createdAt = ZonedDateTime.ofInstant(client.createdAt!!.toInstant(), ZoneId.systemDefault()),
                fullName = requireNotNull(client.fullName),
                phoneNumber = requireNotNull(client.phoneNumber),
                info = client.info
        )
    }
}
