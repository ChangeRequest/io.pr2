IO. Practice Task 2
===============

[![Join the chat at https://gitter.im/changerequest/io.pr2](https://badges.gitter.im/changerequest/io.pr2.svg)](https://gitter.im/changerequest/io.pr2?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
1\. Json Output Stream
---------------

Your task is to create implementation `IJsonOutputStream` interface that should be named
as `JsonOutputStream` and should also be a Filtering stream - so you need to extend 
`FilterOutputStream` also.

The only method that should be implemented is `writeJson` that consumes object of type
`JsonType` and performs write operation.

To show usage of your stream you need to implement all reasonable [JSON][json.org] related data types:
* Json String
* Json Number
* Json Array
* Json Object
* Json Boolean

All this types should implement `JsonType` interface.

#### Json String

This data type should be an immutable data type that is actually just wrapper above
regular java `String`.

Strings in JSON format are just quoted sequence of characters:
```json
"I need to use Quotes(\")"
```

#### Json Number

This data type should be an immutable data type that is actually just wrapper above
regular java `Number`.

Numbers in JSON format are represented by their values.

#### Json Array

This data type should be an immutable data type that is actually just wrapper above
java `Collection` of other `JsonType` objects.

Arrays in JSON format are represented as in example below:
```json
[1,2,"3",4,{"property":"value"},[1,2]] 
```

So, you see, that there are no restrictions for data types that are actually in the array.

#### Json Object

This data type should be an immutable data type that is actually just wrapper above
java `Map` of `String` keys and `JsonType` values.

Objects in JSON format have following representation:
```json
{
    "string": "value",
    "list": [1, 2, 3, "String"],
    "anotherEmptyObject": {},
    "anotherObject": {
    	"key": "value"
    },
    "boolean": true,
    "null": null,
    "integer": 1,
    "double": 2.2
}
```

#### Json Boolean

This data type should be an immutable data type that is actually just wrapper above
regular java `Boolean`.

Boolean should be represented as `true` or `false`

### Demo

You should create `Demo` class and show usage of your implementation.

In your demo you need to create complex `JsonObject` and save it to the file called `demo.json`.

You should also demonstrate usage of your stream with `System.out` stream.

### jUnit test

You should create jUnit tests for all your JSON types and `JsonOutputStream`.


[json.org]: http://www.json.org
