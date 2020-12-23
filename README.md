# hashkey
A simple implementation that uses custom class as HashMap key.

The hash code generation and equality check is done via [Apache Commons Lang](https://commons.apache.org/proper/commons-lang/) `HashCodeBuilder` and `EqualsBuilder`.

## Sample Console Output
```console
Keys equal? [true]
Hash codes equal? [true]
==============
Validate whether generated hash codes are always same:
Hash code [dataKey1]: 70329913
Hash code [dataKey1]: 70329913
Hash code [dataKey1]: 70329913
Hash code [dataKey2]: 70329913
Hash code [dataKey2]: 70329913
Hash code [dataKey2]: 70329913
==============
Added data with dataKey1.
==============
Query data with dataKey2:
[1000, 2000, 3000, 4000, 5000]
==============
Replaced data with dataKey2:
[5000, 4000, 3000, 2000, 1000]
==============
Query data with dataKey1:
[5000, 4000, 3000, 2000, 1000]
```
