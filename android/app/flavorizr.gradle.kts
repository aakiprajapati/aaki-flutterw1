import com.android.build.gradle.AppExtension

val android = project.extensions.getByType(AppExtension::class.java)

android.apply {
    flavorDimensions("default")

    productFlavors {
        create("dev") {
            dimension = "default"
            applicationId = "com.aaki.w1assignment.week1_assignment.dev"
            resValue(type = "string", name = "app_name", value = "MyApp-Dev")
        }
        create("staging") {
            dimension = "default"
            applicationId = "com.aaki.w1assignment.week1_assignment.staging"
            resValue(type = "string", name = "app_name", value = "MyApp-Staging")
        }
        create("prod") {
            dimension = "default"
            applicationId = "com.aaki.w1assignment.week1_assignment"
            resValue(type = "string", name = "app_name", value = "MyApp-Prod")
        }
    }

    buildFeatures.resValues = true
}