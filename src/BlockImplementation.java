import Interfaces.Block;

public class BlockImplementation implements Block {

    private String color;
    private String material;

    public BlockImplementation(String color, String material) {
        this.color = color;
        this.material = material;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "BlockImplementation{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
