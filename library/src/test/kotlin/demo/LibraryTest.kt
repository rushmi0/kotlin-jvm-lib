package demo

import org.example.core.JVMPlatform
import kotlin.test.Test
import kotlin.test.assertTrue

class LibraryTest {

    @Test
    fun testJvmOsName() {
        val jvm = JVMPlatform().version
        println("JVM Version: $jvm")
        assertTrue(jvm.isNotBlank(), "jvm should not be blank")
    }

}
