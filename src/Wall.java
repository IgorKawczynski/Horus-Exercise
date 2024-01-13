import Interfaces.Block;
import Interfaces.CompositeBlock;
import Interfaces.Structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// TODO :
//    Poniżej przekazujemy zadanie z prośbą o analizę poniższego kodu
//        i zaimplementowanie metod findBlockByColor, findBlocksByMaterial, count w klasie Wall
//        - najchętniej unikając powielania kodu i umieszczając całą logikę w klasie Wall.
//        Z uwzględnieniem w analizie i implementacji interfejsu Interfaces.CompositeBlock!

//    Prosimy o wykonanie zadania bez korzystania z pomocy.
//    Zadanie należy umieścić na jednej z dostępnych platform
//    (np. github, gitlab, bitbucket, etc.).

public class Wall implements Structure {
    List<Block> blocks;

    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }

    public List<Block> getBlocks() {
        return blocks;
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        return findBlockByColorHelper(blocks, color);
    }

    private Optional<Block> findBlockByColorHelper(List<Block> blocks, String color) {
        for(Block block: blocks) {
            if (block.getColor().equals(color)) {
                return Optional.of(block);
            }
            else if(block instanceof CompositeBlock)  {
                List<Block> blocksFromCompositeBlock = ((CompositeBlock) block).getBlocks();
                return findBlockByColorHelper(blocksFromCompositeBlock, color);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return findBlocksByMaterialHelper(blocks, material);
    }

    private List<Block> findBlocksByMaterialHelper(List<Block> blocks, String material) {
        ArrayList<Block> blocksByMaterial = new ArrayList<>();
        for(Block block: blocks) {
            if (block.getMaterial().equals(material)) {
                blocksByMaterial.add(block);
            }
            else if(block instanceof CompositeBlock)  {
                List<Block> blocksFromCompositeBlock = ((CompositeBlock) block).getBlocks();
                findBlocksByMaterialHelper(blocksFromCompositeBlock, material);
            }
        }
        return blocksByMaterial;
    }

    @Override
    public int count() {
        return countHelper(blocks);
    }

    private int countHelper(List<Block> blocks) {
        int result = 0;
        for(Block block: blocks) {
            result = result + 1;
            if(block instanceof CompositeBlock) {
                List<Block> blocksFromCompositeBlock = ((CompositeBlock) block).getBlocks();
                result = result + countHelper(blocksFromCompositeBlock);
            }
        }
        return result;
    }

}