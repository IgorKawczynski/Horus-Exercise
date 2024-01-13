import Interfaces.Block;
import Interfaces.CompositeBlock;

import java.util.List;

public class CompositeBlockImplementation implements CompositeBlock {

    private List<Block> blocks;
    private String color;
    private String material;

    public CompositeBlockImplementation(List<Block> blocks, String color, String material) {
        this.blocks = blocks;
        this.color = color;
        this.material = material;
    }

    @Override
    public List<Block> getBlocks() {
        return blocks;
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
        return "CompositeBlockImplementation{" +
                "blocks=" + blocks +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
