# Java Reference

> :tired_face: **UGH! This is taking too long!** I though about making a Java Reference. It's just too much work for right now.

[toc]

---

## UML Map

```mermaid
classDiagram
class Object
class String
class Class
class Serializable {
<<interface>>
}
class GenericDeclaration {
<<interface>>
}
class TypeDescriptor {
<<interface>>
}
class TypeDescriptorOfField {
<<interface>>
}
class Type  {
<<interface>>
}
class AnnotatedElement  {
<<interface>>
}
class Constable  {
<<interface>>
}

Object <|-- String
Serializable <|.. String
Constable <|.. String

Object <|-- Class
Serializable <|.. Class
GenericDeclaration <|.. Class
TypeDescriptor <|.. Class
TypeDescriptorOfField <|.. Class
Type <|.. Class
AnnotatedElement <|.. Class
Constable <|.. Class
```

## Classes

### Object

```mermaid
classDiagram
class Object {
 +Object()
 #Object clone()
 +boolean equals(Object obj)
 +Class<?> getClass()
 +int hashCode()
 +void notify()
 +void notifyAll()
 +String toString()
 +void wait([long timeoutMillis [, int nanos]])
}
```

### String

```mermaid
classDiagram
class Object
class Serializable {
 <<interface>>
}
class Comparable {
 <<interface>>
 template<String>
}
class CharSequence {
 <<interface>>
}
class Constable {
 <<interface>>
}
class ConstantDesc {
 <<interface>>
}

class String {
 +String()
 +String(byte[] bytes)
 +String(byte[] bytes, int offset, int length)
 +String(byte[] bytes, int offset, int length, String charsetName)
 +$Comparator<String> CASE_INSENSITIVE_ORDER
}

Object <|-- String
Serializable <|.. String
CharSequence <|.. String
Comparable <|.. String
Constable <|.. String
ConstantDesc <|.. String
```

