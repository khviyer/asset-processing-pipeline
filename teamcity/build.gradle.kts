/*
 * Author: Manus
 * Date: 2025-08-05
 * 
 * This file is part of test assignment for "CI/CD Engineer" role in Scorewarrior
 * 
 * Test-assignment Version: 1.0.0
 * Agent name and version: Gemini
 */

plugins {
    id("com.github.rodm.teamcity-server") version "1.5.2"
}

repositories {
    mavenCentral()
}

teamcity {
    version = "2023.11"
}

dependencies {
    implementation("org.jetbrains.teamcity:configs-dsl-kotlin:2023.11")
}

