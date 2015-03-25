# Maintainable Architecture Description Language (MADL)

Drawing out software architecture diagrams can get messy. Maintaining them is even harder. MADL, pronounced "model," is meant to alleviate that pain.

## Keywords

* `architecture`
* `component`

### Reserved properties

* `components`
* `connections`
* `requests`

## Components

```
# Define a base component to represent services
component Service:
  # Add the name property as part of the definition for Service
  name
  # Add an optional properties to the definition
  description?
  metadata?

# Define a more concrete Service
component FooProvider < Service:
  name: "Foo Provider"
  metadata:
    foo: "bar"

# Basic component with no properties
component Baz

# Define another Service
component BarStore < Service:
  # name is left undefined
  description: "Stores bars for you"
  bar_specific_property: 42

  # Nested components
  components:
    baz: Baz
```

## Architecture Description

```
# ... Component Definitions

# Architecture description
architecture ExampleArchitecture:

  ##
  # Realized components
  ##
  components:
    foo: FooProvider()
    bar_master: BarStore(name: "BS Master")
    bar_slave: BarStore(name: "BS Slave")

  ##
  # Connections
  ##
  connections:
    # Unnamed connection
    foo <-> bar_master
    # Named connection
    (bar_replication): Bar Store Master -> Bar Store Slave
```
