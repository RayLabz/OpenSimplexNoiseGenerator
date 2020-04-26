# Open Simplex Noise Generator
An OpenSimplex noise generation library in Java which supports 2D, 3D, and 4D OpenSimplex noise generation.
For use in Java 8+ environments. 

### Import using Maven:
```xml
<dependency>
    <groupId>com.raylabz</groupId>
    <artifactId>opensimplex</artifactId>
    <version>1.0.2</version>
</dependency>
```

or

```xml
com.raylabz:opensimplex:1.0.2
```

### Download jar:

[Download](https://github.com/RayLabz/OpenSimplexNoiseGenerator/raw/master/out/artifacts/opensimplexnoisegenerator_jar/opensimplexnoisegenerator.jar)

<hr/>

###Updates in v1.0.2:
* Added ```Range``` class to model the range of the generated values.
* Added ```RangedValue``` class to model generated values in a specified range.
* ```RangedValue``` objects can now be easily shifted to a different range using the ```getValue(Range range)``` method.
* The generator's methods now return:
    * ```eval()``` returns ```RangedValue```.
    * ```getNoise2D()``` returns ```RangedValue```.
    * ```getNoise3D()``` returns ```RangedValue```.
    * ```getNoise4D()``` returns ```RangedValue```.
    * ```getNoise2DArray()``` returns ```RangedValue[]```.
* To retrieve the original generated value (in the original range of -1 to 1) of a ```RangedValue``` use ```getValue()``` without specifying a range.

<hr/>

###Usage

Create generator without seed:
```java
OpenSimplexNoise noise = new OpenSimplexNoise();
``` 

Create generator with specified seed:
```java
long seed = 123;
OpenSimplexNoise noise = new OpenSimplexNoise(seed);
```

Generate a value for position (0,0):
```java
RangedValue value = noise.getNoise2D(0, 0);
```

Get double number from ```RangedValue```:
```java
double originalValue = value.getValue();
```

Shift value from original range to a new range (-255, 255):
```java
double shiftedValue = value.getValue(new Range(-255, 255));
```

Generate an 2D array of values for positions (0,0) to (2500, 2500):
```java
final RangedValue[][] noise2DArray = noise.getNoise2DArray(0, 0, 2500, 2500);
```