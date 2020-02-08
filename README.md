# MapStruct workbench

A Workbench to tinker with MapStruct especially mapping inheritance structures.

In this example the class `VehicleModel` which contains an abstract property `vehicle`
should be mapped to a `VehicleModelTarget` which itself contains an abstract
property `vehicle`. Source and target inheritance structure are equal but with their
own classes.

The `VehicleMapper` shows how the actual mapping of the abstract class can
be done either by calling a mapping method in the same mapper or a separate
mapper. 

## Running

You can see the mapping in action by running the tests:

```
./gradlew clean test
```
