package com.algaworks.patrimonio.resource;

import com.algaworks.patrimonio.model.Item;
import com.algaworks.patrimonio.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ItemResource {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/itens")
    public List<Item> listar(){
        return itemRepository.findAll();
    }

    @PostMapping("/itens")
    public Item adicionar (@RequestBody @Valid Item item){
        return itemRepository.save(item);
    }

}
