package Interfaces;

import java.util.List;
import java.util.Optional;

public interface Structure {
    Optional<Block> findBlockByColor(String color); // zwraca dowolny element o podanym kolorze
    List<Block> findBlocksByMaterial(String material); // zwraca wszystkie elementy z danego materiału
    int count(); // zwraca liczbę wszystkich elementów tworzących strukturę
}
