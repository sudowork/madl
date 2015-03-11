# Maintainable Architecture Description Language (MADL)

Drawing out software architecture diagrams can get messy. Maintaining them is even harder. MADL, pronounced "model," is meant to alleviate that pain.

## Keywords

* `component`
* `connections`
  * `->`
  * `<-`
  * `<->`
* `architecture`

## Components

```
# Define a base component to represent services
component Service {
  # Add the name property as part of the definition for Service
  name
  # Add an optional properties to the definition
  description?
  metadata?
}

# Define a more concrete Service
component FooProvider < Service {
  name: Foo Provider
  metadata: {
    foo: bar
  }
}

# Define another Service
component BarStore < Service {
  # name is left undefined
  description: Stores bars for you
  bar_specific_property: 42
}
```

## Architecture Description

```
# ... Component Definitions

# Architecture description
architecture {

  ##
  # Realized components
  ##

  Foo Provider 1: FooProvider

  Bar Store Master: BarStore {
    name: BS Master
  }

  Bar Store Slave: BarStore {
    name: BS Slave
  }

  ##
  # Connections
  ##

  connections {
    # Unnamed connection
    Foo Provider 1 <-> Bar Store Master
    # Named connection
    (bar replication): Bar Store Master -> Bar Store Slave
  }

}
```
