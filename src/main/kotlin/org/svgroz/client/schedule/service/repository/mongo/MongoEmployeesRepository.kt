package org.svgroz.client.schedule.service.repository.mongo

import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.svgroz.client.schedule.service.model.Employee
import org.svgroz.client.schedule.service.repository.EmployeesRepository
import reactor.core.publisher.Mono

interface MongoEmployeesRepository :
        EmployeesRepository,
        ReactiveMongoRepository<Employee, String> {
    override fun findById(id: String): Mono<Employee>
}
