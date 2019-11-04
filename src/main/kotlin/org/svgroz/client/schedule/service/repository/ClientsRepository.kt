package org.svgroz.client.schedule.service.repository

import org.svgroz.client.schedule.service.model.Client
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface ClientsRepository {
    fun findAll(): Flux<Client>

    fun save(client: Client): Mono<Client>
}