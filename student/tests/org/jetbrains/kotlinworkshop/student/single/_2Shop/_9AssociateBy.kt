package org.jetbrains.kotlinworkshop.student.introduction._2Shop

import org.jetbrains.kotlinworkshop.student.single._2Shop.*
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Test
import kotlin.test.*

class _9AssociateBy {
    @Test
    fun testAssociateCustomersByName() {
        assertEquals(customers, shop.associateCustomersByName())
    }
}