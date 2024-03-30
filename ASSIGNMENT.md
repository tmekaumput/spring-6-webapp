## Assignments

### jpa-entities branch

#### Create Publisher Entity

- Create new Entity called Publisher
- POJO with properties for id, and publisherName, address, city, state, zip
- Annotate with necessary JPA annotations
- Add toString, equals, and hashCode
- Create Spring Data JPA repository
- Add to Bootstrap class and create new publisher
- Verify database count using System.out.println

### adding-authors-assignment branch

#### Create Author Service and Controller

- Use same methods used to display a list of books to display a list of Authors
- Create Author Service and Implementation for “findAll”
- Create Author Controller for path “/authors”
- Add to model response list of authors
- Create Thymeleaf template to display list of Authors
- Test in browser
