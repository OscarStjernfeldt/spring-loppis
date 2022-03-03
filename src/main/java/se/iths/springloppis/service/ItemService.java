package se.iths.springloppis.service;

import org.springframework.stereotype.Service;
import se.iths.springloppis.entity.ItemEntity;
import se.iths.springloppis.repository.ItemRepository;

import java.util.Optional;

@Service
public class ItemService {

    ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public ItemEntity createItem(ItemEntity itemEntity) {
        return itemRepository.save(itemEntity);
    }

    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }

    public Optional<ItemEntity> findItemById(Long id) {
        return itemRepository.findById(id);
    }

    public Iterable<ItemEntity> findAllItems() {
        return itemRepository.findAll();
    }
}
