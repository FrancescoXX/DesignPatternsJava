
#Singleton Pattern (Single Object instances)
####Ensures that a class has only one instance and provide a global point of access to it

####Example
     One FileSystem, Window Manager

####Issues
     Multiple classes require the same object instance.
     There can only be one object for the entire application.
     It must be guaranteed that there is only one object.

####Solution
    Create a class which menages its one instance.

####Intent
    Ensure a class only has one instance, and provide a global point of access to it.

####When
    Required only one instance of class.
    Must be one access point.
    Need to menage object instances. (eg. database pool)

####Benefits
    Controlled access to one instance.
    Reduce name space -> avoids global variables.
    The ability to subclass the singleton class.
    Configure the number of instances you need.

####Drawbacks
    State of the singleton must be shareable between program executions
    If we have multiple threads, the instance must be shareable between threads

####Great For:
    Manage number of instances at runtime
    Provide single unique point of access
