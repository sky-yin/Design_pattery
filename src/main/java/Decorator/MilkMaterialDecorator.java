package Decorator;

public class MilkMaterialDecorator extends MaterialDecorator{

    public MilkMaterialDecorator(MaterialService materialService) {
        super(materialService);
    }

    @Override
    public void content() {
        super.content();
        setContent(materialService);
    }

    private void setContent(MaterialService materialService){
        System.out.println("the content is milk");
    }
}
