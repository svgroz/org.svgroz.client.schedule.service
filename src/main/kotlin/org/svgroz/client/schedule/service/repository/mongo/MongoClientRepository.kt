package org.svgroz.client.schedule.service.repository.mongo

import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.svgroz.client.schedule.service.model.Client
import org.svgroz.client.schedule.service.repository.ClientsRepository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface MongoClientRepository :
        ClientsRepository,
        ReactiveMongoRepository<Client, String> {
    override fun findAll(): Flux<Client>

    override fun save(client: Client): Mono<Client>
}
