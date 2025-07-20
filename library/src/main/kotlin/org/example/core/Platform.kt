package org.example.core

interface Platform {
    val version: String
}

class JVMPlatform: Platform {
    override val version: String = "Java ${System.getProperty("java.version")}"
}
