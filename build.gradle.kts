buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
        jcenter()
    }
    // https://www.guardsquare.com/manual/setup/upgrading
    dependencies {
        classpath("com.android.tools.build:gradle:${KotlinConstants.gradle_version}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${KotlinConstants.kotlin_version}")
    }
}

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
        jcenter()
    }

    gradle.projectsEvaluated {
        tasks.withType<JavaCompile> {
            options.encoding = "UTF-8"
            val compilerArgs = options.compilerArgs
            compilerArgs.add("-Xlint:unchecked")
            compilerArgs.add("-Xlint:deprecation")
            compilerArgs.add("-Xdiags:verbose")
        }
    }
}

tasks.create("clean", Delete::class.java) {
    delete(rootProject.buildDir)
}
