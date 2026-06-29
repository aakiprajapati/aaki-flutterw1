# week1_assignment

This is the first Flutter assignment, where the default flutter app logo and name is edited. The updated name is Aaki Prajapati, with a custom profile icon. 

**App Flavors**:

For the second assignment, the previously configured application was configured into dev, staging and prod app flavors. The names were configured as:
- **dev:** MyApp-Dev (used for development and testing)
- **staging:** MyApp-Staging (used for pre-release testing)
- **prod:** MyApp-Prod (the original production version of the app)

**Setup Steps:**

1. To begin with, from pub.dev, the concept of app flavors were researched. Then, the latest version of flutter_flavorizr was copied, and pasted to pubspec.yaml for establishing dependencies. This step was done within dev_dependencies.
2. Following this, the command **flutter pub get** was run in the terminal to download the package.
3. Flavorizr configuration was added to pubspec.yaml.
4. Three flavors (dev, staging and prod) were configured each with its own application name.
5. A unique applicationId was assigned to each flavor, so that all three versions can be installed and run independently on the same device.
6. Whenever changes are made to the flavorizr configuration in pubspec.yaml, the following command should be executed to regenerate the flavor configuration:   
    **Command to generate Flutter configuration:**

    dart run flutter_flavorizr
   7. Each flavor can be run using the following commands:
       **Commands to install the flavors:**
       - **dev:**
    flutter run --flavor dev
       - **staging:**  flutter run --flavor staging
       - **prod:**  flutter run --flavor prod
    
      - After running all 3 commands the 3 flavors were visible.

8. Finally, the icons for dev and staging flavors were changed for easy recognition




## Getting Started

This project is a starting point for a Flutter application.

A few resources to get you started if this is your first Flutter project:

- [Learn Flutter](https://docs.flutter.dev/get-started/learn-flutter)
- [Write your first Flutter app](https://docs.flutter.dev/get-started/codelab)
- [Flutter learning resources](https://docs.flutter.dev/reference/learning-resources)

For help getting started with Flutter development, view the
[online documentation](https://docs.flutter.dev/), which offers tutorials,
samples, guidance on mobile development, and a full API reference.
