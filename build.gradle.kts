signingConfigs {
        release {
            def tmpFilePath = System.getProperty("user.home") + "/work/_temp/keystore/"
            def allFilesFromDir = new File(tmpFilePath).listFiles()

            if (allFilesFromDir != null) {
                def keystoreFile = allFilesFromDir.first()
                keystoreFile.renameTo("keystore/your_keystore.jks")
            }

            storeFile = file("keystore/your_keystore.jks")
            storePassword System.getenv("SIGNING_STORE_PASSWORD")
            keyAlias System.getenv("SIGNING_KEY_ALIAS")
            keyPassword System.getenv("SIGNING_KEY_PASSWORD")
        }
    }// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.9.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}
