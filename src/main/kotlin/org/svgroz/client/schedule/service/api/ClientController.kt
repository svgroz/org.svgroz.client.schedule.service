package org.svgroz.client.schedule.service.api

import org.springframework.web.bind.annotation.*
import org.svgroz.client.schedule.service.dto.ClientDto
import org.svgroz.client.schedule.service.service.ClientsService
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api")
class ClientController(
        private val clientsService: ClientsService
) {
    @GetMapping("/client")
    fun allClients(): Flux<ClientDto> {
        return clientsService.findAll()
    }

    @PostMapping("/client")
    fun save(@RequestBody clientDto: ClientDto): Mono<ClientDto> {
        return clientsService.save(clientDto)
    }
}
