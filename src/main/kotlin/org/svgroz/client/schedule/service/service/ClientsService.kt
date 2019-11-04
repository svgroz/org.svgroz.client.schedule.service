package org.svgroz.client.schedule.service.service

import org.svgroz.client.schedule.service.dto.ClientDto
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface ClientsService {
    fun findAll(): Flux<ClientDto>

    fun save(clientDto: ClientDto): Mono<ClientDto>
}