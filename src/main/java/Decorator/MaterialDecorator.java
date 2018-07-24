package Decorator;

public class MaterialDecorator implements MaterialService {

    protected MaterialService materialService;

    public MaterialDecorator(MaterialService materialService) {
        this.materialService = materialService;
    }

    @Override
    public void content() {
        materialService.content();
    }
}
