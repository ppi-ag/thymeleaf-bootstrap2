# thymeleaf bootstap2

Thymeleaf Dialect which helps to create bootstrap2-forms.

Supported attributes at input, select, option and textarea are:

- `bs:field`: which is similar to th:field, but it adds a label and shows the
   validation-message. The label can be changed via `bs:label`.
- `bs:name`: like bs:field doesn't need a form object.
  The label can be changed via `bs:label`.

See the testdata at src/test/resources/thymeleaf/bootstrap2.

To use codecompletion add `xmlns:bs="http://www.ppi.de/thymeleaf/bootstrap2"` to the html-tag.

## Installation
Simply add
    <dependency>
        <groupId>de.ppi.oss</groupId>
        <artifactId>thymeleaf-bootstrap2</artifactId>
        <version>0.2</version>
    </dependency>
