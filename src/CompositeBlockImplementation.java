import Interfaces.Block;
import Interfaces.CompositeBlock;

import java.util.ArrayList;
import java.util.List;

public class CompositeBlockImplementation implements CompositeBlock {

    private List<Block> blocks;
    private String color;
    private String material;

    public CompositeBlockImplementation(String color, String material) {
        this.blocks = new ArrayList<>();
        this.color = color;
        this.material = material;
    }

    public void addBlock(Block block) {
        blocks.add(block);
    }

    public void removeBlock(Block block) {
        blocks.remove(block);
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
