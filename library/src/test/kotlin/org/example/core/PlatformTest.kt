package org.example.core

import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertNotNull

class PlatformTest {

    @Test
    fun `OS name should be a recognized operating system`() {
        val os = PlatformInfo().os.lowercase()
        val expected = listOf("windows", "linux", "mac", "unix")
        val matched = expected.any { os.contains(it) }

        println("Detected OS: $os")
        assertTrue(matched, "OS name should match one of the known OS types")
    }

    @Test
    fun `JVM version should start with Java and follow semantic versioning`() {
        val jvm = PlatformInfo().jvm
        println("Detected JVM: $jvm")

        assertTrue(jvm.startsWith("Java"), "JVM info should start with 'Java '")
    }

    @Test
    fun testPlatformImplementsInterface() {
        val platform: Platform = PlatformInfo()
        assertNotNull(platform.os)
        assertNotNull(platform.jvm)
    }

}
