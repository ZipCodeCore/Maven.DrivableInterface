# Interfacing Drivers

The following lab contains the shell of an application that uses a `Drivable` 
interface. Objects that implement this interface can be used to transport people 
distances. Certain types of vehicles that are drivable may have extra side
effects that happen when they transport. 

The classes you will have to write code for is the App class, the HondaCivic class,
and the MountainBike class. You should look at all of the interfaces and classes
provided for specific implementation details.

## Making your own

Once the tests are passing for the classes provided, try and make a new car and a new bike
and integrate them into the main app. Make sure to write appropriate tests for the
car you come up with. 

As an additional challenge, attempt to make a `Teleporter` class that implements `Drivable`.
The `Teleporter` class should have the ability to send you any distance in an instant.
Make appropriate tests for the `Teleporter` and implement all required methods in the
`Drivable` interface.
