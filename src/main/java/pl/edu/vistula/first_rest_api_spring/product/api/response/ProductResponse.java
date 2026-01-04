package pl.edu.vistula.first_rest_api_spring.product.api.response;

public class ProductResponse {
    private final Long id;
    private final String name;

    // This is the constructor the mapper is looking for
    public ProductResponse(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
}