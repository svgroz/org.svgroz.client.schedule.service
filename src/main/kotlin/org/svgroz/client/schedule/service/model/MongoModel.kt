package org.svgroz.client.schedule.service.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal
import java.util.*

@Document(collection = "clients")
data class Client(
        @Id
        val id: String? = null,
        val createdAt: Date? = null,
        val fullName: String? = null,
        val phoneNumber: String? = null,
        val info: String? = null
)

@Document(collection = "employees")
data class Employee(
        @Id
        val id: String? = null,
        val fullName: String? = null,
        val employeeRole: EmployeeRoleType? = null,
        val employeeContacts: Map<EmployeeContactType, String> = mapOf()
)

//@Document(collection = "organizations")
//data class Organization(
//        @Id
//        val id: String? = null,
//        val parentId: String? = null,
//        val childesIds: Set<String> = setOf(),
//        val name: String? = null,
//        val type: OrganizationType? = null,
//        val employeesIds: Set<String> = setOf()
//)

@Document(collection = "records")
data class Record(
        @Id
        val id: String? = null,
        val info: String? = null,
        val date: Date? = null,
//        val organizationId: String? = null,
        val employeeId: String? = null,
        val clientId: String? = null,
        // TODO maybe replace with external document?
        val services: List<Service> = listOf()
)

data class Service(
        val name: String,
        val info: String?,
        val price: BigDecimal?
)
