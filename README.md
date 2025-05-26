# Servicios Web REST sobre base de datos PostgreSQL

Implementación de algunos endpoints utilizando Spring Boot e Hibernate. También incorpora un repositorio anotado **@RepositoryRestResource**.

La anotación **@RepositoryRestResource** pertenece a Spring Data REST, un proyecto de Spring Framework que expone automáticamente los repositorios de datos como servicios RESTful, sin necesidad de escribir controladores (controllers) personalizados.

Los endpoints expuestos son (partiendo de **@RequestMapping("/api/movies/")**):
- @PostMapping
    - public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {

- @GetMapping("/{id}")
    - public ResponseEntity<?> getMovieById(@PathVariable String id) {

- @GetMapping("/search")
    - public ResponseEntity<List> findMovies(@RequestParam(name="s", required = false) String titles,
                                           @RequestParam(name="i", required = false) String imdbId,
                                           @RequestParam(name="t", required = false) String title) {

El diseño y la implementación de este último endpoint no es correcta, pese a funcionar correctamente. Sería conveniente diseñar una solución más sencilla y ortodoxa.
