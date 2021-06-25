# DaggerHiltPart1

#### Todo 1
```gradle
buildscript {
    repositories {
         ...
        //todo 1
        mavenCentral()
    }
    dependencies {
        classpath "com.android.tools.build:gradle:4.0.0"

        //todo 1
        classpath 'com.google.dagger:hilt-android-gradle-plugin:2.28-alpha'
    }
}
```

#### Todo 2
```gradle
//todo 2
apply plugin: 'com.android.application'
apply plugin: 'dagger.hilt.android.plugin'

//todo 2
kapt {
    correctErrorTypes true
}

dependencies {
    ...
    //todo 2
    implementation 'com.google.dagger:hilt-android:2.28-alpha'
    annotationProcessor 'com.google.dagger:hilt-android-compiler:2.28-alpha'
    implementation 'androidx.multidex:multidex:2.0.1'

}
```

#### Todo 3
```gradle
//todo 3
@HiltAndroidApp
class MyApp : MultiDexApplication()
```
```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest>

    <application
        android:name=".MyApp">

    </application>

</manifest>
```

#### Todo 4
```gradle
//todo 4
@Module
@InstallIn(ApplicationComponent::class)
object AppModule{
    @Provides
    fun string() : String = "providesString"
}
```

#### Todo 5
```gradle
//todo 5
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    @Inject lateinit var str: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: $str")
    }
}
```

---

```
Copyright 2021 M. Fadli Zein
```