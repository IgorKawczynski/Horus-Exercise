import Interfaces.Block;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Block> blocks = new ArrayList<>();
        blocks.add(new BlockImplementation("red", "dust"));
        blocks.add(new BlockImplementation("blue", "sand"));
        blocks.add(new BlockImplementation("violet", "dust"));
        blocks.add(new BlockImplementation("red", "dust"));

        CompositeBlockImplementation compositeBlock = new CompositeBlockImplementation("yellow", "concrete");
        compositeBlock.addBlock(new BlockImplementation("yellow", "concrete"));
        compositeBlock.addBlock(new BlockImplementation("yellow", "concrete"));

        BlockImplementation blockToRemove = new BlockImplementation("yellow", "concrete");
        compositeBlock.addBlock(blockToRemove);
        compositeBlock.removeBlock(blockToRemove);

        blocks.addAll(compositeBlock.getBlocks());

        Wall firstWall = new Wall(blocks);

        System.out.println(firstWall.getBlocks());
        System.out.println(firstWall.findBlockByColor("yellow"));
        System.out.println(firstWall.findBlocksByMaterial("sand"));
        System.out.println(firstWall.count());

    }
}