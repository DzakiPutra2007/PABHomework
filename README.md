# Homework 6 — My First Compose App

## Task 3: Colour and Spacing
- Colour used: Color.LightGray
- Padding kept: 24.dp
- What changed / what stayed the same:
  When changing padding from 8.dp to 48.dp, the inner spacing around the content increased significantly, pushing all UI elements (texts and image) further inward toward the center of the screen. What stayed the same was the content structure, text values, image size, and background surface color.

## Task 4: Build Error
- First error message:
  `Invalid symbol 'My-Picture', valid characters are 'a-z0-9_'.` (or `AAPT: error: invalid file path '.../res/drawable/My-Picture.png'`)
- Cause:
  Android resource naming rules strictly forbid uppercase letters and hyphens (`-`). Resource file names inside `res/drawable/` can only contain lowercase letters (`a-z`), digits (`0-9`), and underscores (`_`).
- Why other errors appear:
  Because Android failed to compile the invalid resource file name, it could not generate the `R.drawable.My-Picture` ID in the generated `R.java` file. Consequently, Kotlin reported an "unresolved reference" error when trying to access `R.drawable.my_picture`.
- Fix:
  Renamed the file back to `my_picture.png` using only lowercase letters and underscores.

## Task 5: Explore the Project
(a) MainActivity: path `app/src/main/java/com/example/myfirstcomposeapp/MainActivity.kt` — It is the entry point activity of the Android application that sets up the UI content using Jetpack Compose.
(b) Gradle file: path `app/build.gradle.kts` — Configures module-level build settings, Android SDK versions, dependencies, and Compose options for the app module.
(c) Launcher image line: `painter = painterResource(id = R.drawable.ic_launcher_foreground)` — Refers to the default vector drawable resource used for the launcher foreground icon.

## Task 6: Preview vs Run
1. Updating a text in `MyFirstScreen` updates the Preview rendering locally in Android Studio because Preview compiles a standalone preview snippet.
2. The app running on the physical device or emulator does not update automatically because the newly compiled APK has not been deployed to the device. To reflect the changes on the device, you must click the "Run" button (or press `Shift + F10`) to recompile, build, install, and launch the updated APK onto the device.

## Task 7: Views vs Compose
1. **Imperative (Views) vs Declarative (Compose):**
    - In the classic View system (imperative), UI components are constructed via XML layouts, and developers manually retrieve widgets (e.g., via `findViewById`) and mutate their state imperatively (e.g., `textView.setText("...")`).
    - In Jetpack Compose (declarative), you describe what the UI should look like for a given state using `@Composable` functions like `MyFirstScreen()`. When state changes, Compose automatically re-executes (recomposes) the function to reconstruct the updated UI without manual view mutation.

2. **Library Layers:**

| Composable | Package | Library layer |
|---|---|---|
| Column | `androidx.compose.foundation.layout.Column` | Foundation Layout |
| Text | `androidx.compose.material3.Text` | Material 3 (Design) |
| Image | `androidx.compose.foundation.Image` | Foundation |