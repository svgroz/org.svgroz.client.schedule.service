package org.svgroz.client.schedule.service.service

import org.springframework.stereotype.Service
import org.svgroz.client.schedule.service.dto.ClientDto
import org.svgroz.client.schedule.service.mapper.DomainToDto
import org.svgroz.client.schedule.service.model.Client
import org.svgroz.client.schedule.service.repository.ClientsRepository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.time.ZonedDateTime
import java.util.*

@Service
class ClientServiceImpl(
        private val clientsRepository: ClientsRepository
) : ClientsService {
    override fun findAll(): Flux<ClientDto> {
        return clientsRepository.findAll()
                .map { DomainToDto.map(it) }
    }

    override fun save(clientDto: ClientDto): Mono<ClientDto> {
        return clientsRepository.save(
                Client(
                        createdAt = Date.from(ZonedDateTime.now().toInstant()),
                        fullName = requireNotNull(clientDto.fullName),
                        phoneNumber = requireNotNull(clientDto.phoneNumber),
                        info = clientDto.info
                )
        ).map { DomainToDto.map(it) }
    }
}
