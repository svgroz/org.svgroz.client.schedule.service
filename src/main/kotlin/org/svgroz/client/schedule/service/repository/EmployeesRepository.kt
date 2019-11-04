package org.svgroz.client.schedule.service.repository

import org.svgroz.client.schedule.service.model.Employee
import reactor.core.publisher.Mono

interface EmployeesRepository {
    fun findById(id: String): Mono<Employee>
}